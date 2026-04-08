package com.jpmendes.OngoalAPI2.service;

import com.jpmendes.OngoalAPI2.dto.ToDoDTO;
import com.jpmendes.OngoalAPI2.model.ToDo;
import com.jpmendes.OngoalAPI2.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {
    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDoDTO> getAllToDos(){
        List<ToDo> toDos = toDoRepository.findAll();
        List<ToDoDTO> toDosDTO = new ArrayList<>();
        for (ToDo t : toDos){
            toDosDTO.add(ToDoDTO.convert(t));
        }
        return toDosDTO;
    }

    public ToDoDTO newTask(ToDoDTO toDoDTO){
        ToDo toDo = toDoRepository.save(ToDo.convert(toDoDTO));
        return toDoDTO.convert(toDo);
    }
}
