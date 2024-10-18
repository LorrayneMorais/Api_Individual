package com.projeto.Tarefa.controller;

import org.springframework.web.bind.annotation.*;

import com.projeto.Tarefa.Entities.Column;
import com.projeto.Tarefa.Repositories.ColumnRepository;

import java.util.List;

@RestController
@RequestMapping("/columns")
public class ColumnController {

    private final ColumnRepository columnRepository;

    public ColumnController(ColumnRepository columnRepository) {
        this.columnRepository = columnRepository;
    }

    @GetMapping
    public List<Column> getAllColumns() {
        return columnRepository.findAll();
    }

    @PostMapping
    public Column createColumn(@RequestBody Column column) {
        return columnRepository.save(column);
    }
}
