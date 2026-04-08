package com.jpmendes.OngoalAPI2.repository;

import com.jpmendes.OngoalAPI2.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
