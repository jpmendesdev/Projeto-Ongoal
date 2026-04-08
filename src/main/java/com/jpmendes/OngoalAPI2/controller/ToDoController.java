package com.jpmendes.OngoalAPI2.controller;

import com.jpmendes.OngoalAPI2.dto.ToDoDTO;
import com.jpmendes.OngoalAPI2.model.ToDo;
import com.jpmendes.OngoalAPI2.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ToDoController {
    @Autowired
    private ToDoService toDoService;

    @GetMapping("/tarefas")
    public List<ToDoDTO> getToDos(){
        return toDoService.getAllToDos();
    }

    @PostMapping("/tarefas")
    public ToDoDTO newToDo(@RequestBody ToDoDTO toDoDTO){
        return toDoService.newTask(toDoDTO);
    }
}
