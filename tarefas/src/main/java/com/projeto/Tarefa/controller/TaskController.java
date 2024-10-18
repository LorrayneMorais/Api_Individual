package com.projeto.Tarefa.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;

import com.projeto.Tarefa.Entities.Column;
import com.projeto.Tarefa.Repositories.ColumnRepository;
import com.projeto.Tarefa.Repositories.TaskRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskRepository taskRepository;
    private final ColumnRepository columnRepository;

    public TaskController(TaskRepository taskRepository, ColumnRepository columnRepository) {
        this.taskRepository = taskRepository;
        this.columnRepository = columnRepository;
    }

    @GetMapping
    public List<org.springframework.scheduling.config.Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @PutMapping("/{taskId}/move/{columnId}")
    public ResponseEntity<Task> moveTaskToColumn(@PathVariable UUID taskId, @PathVariable UUID columnId) {
        Optional<Task> taskOptional = taskRepository.findById(taskId);
        Optional<Column> columnOptional = columnRepository.findById(columnId);

        if (taskOptional.isPresent() && columnOptional.isPresent()) {
            Task task = taskOptional.get();
            task.setColumn(columnOptional.get());
            taskRepository.save(task);
            return ResponseEntity.ok(task);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
