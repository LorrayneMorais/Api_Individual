package com.projeto.Tarefa.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.Tarefa.Entities.Column;
import java.util.UUID;

public interface ColumnRepository extends JpaRepository<Column, UUID> {
}