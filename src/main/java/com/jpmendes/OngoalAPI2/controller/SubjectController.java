package com.jpmendes.OngoalAPI2.controller;

import com.jpmendes.OngoalAPI2.dto.SubjectDTO;
import com.jpmendes.OngoalAPI2.repository.SubjectRepository;
import com.jpmendes.OngoalAPI2.service.SubjectService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/subject")
    public List<SubjectDTO> getUsers(){
        return subjectService.getAll();
    }

    @PostMapping("/subject")
    public SubjectDTO save(@RequestBody SubjectDTO subjectDTO){
        return subjectService.newSubject(subjectDTO);
    }

    @PutMapping("/subject/{id}")
    public ResponseEntity<SubjectDTO> update(@PathVariable Long id, @RequestBody SubjectDTO subjectDTO) {
        SubjectDTO updatedSubject = subjectService.updateSubject(id, subjectDTO);
        return ResponseEntity.ok(updatedSubject);
    }

    @DeleteMapping("/subject/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        subjectService.deleteSubject(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/subject/hours")
    public double[] totalHours(){
        return subjectService.getAllHours();
    }
}
