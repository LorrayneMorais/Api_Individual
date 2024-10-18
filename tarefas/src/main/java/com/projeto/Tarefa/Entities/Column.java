package com.projeto.Tarefa.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Data
public class Column {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name; // "To Do", "Doing", "Done"

    @OneToMany(mappedBy = "column", cascade = CascadeType.ALL)
    private List<Task> tasks;
}
