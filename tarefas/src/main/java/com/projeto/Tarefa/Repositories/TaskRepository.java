package com.projeto.Tarefa.Repositories;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;

import java.util.UUID;

public interface TaskRepository extends JpaRepository<Task, UUID> {

	void save(com.projeto.Tarefa.Entities.Task task);
}
