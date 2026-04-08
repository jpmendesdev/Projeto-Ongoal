package com.jpmendes.OngoalAPI2.model;

import com.jpmendes.OngoalAPI2.dto.ToDoDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String status;

    public static ToDo convert(ToDoDTO toDoDTO){
        ToDo toDo = new ToDo();
        toDo.setId(toDoDTO.getId());
        toDo.setTitle(toDoDTO.getTitle());
        toDo.setStatus(toDoDTO.getStatus());
        return toDo;
    }
}
