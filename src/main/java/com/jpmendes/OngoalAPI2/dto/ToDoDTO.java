package com.jpmendes.OngoalAPI2.dto;

import com.jpmendes.OngoalAPI2.model.ToDo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDoDTO {
    private Long id;
    private String title;
    private String status;

    public static ToDoDTO convert(ToDo toDo){
        ToDoDTO toDoDTO = new ToDoDTO();
        toDoDTO.setId(toDo.getId());
        toDoDTO.setTitle(toDo.getTitle());
        toDoDTO.setStatus(toDo.getStatus());
        return toDoDTO;
    }
}
