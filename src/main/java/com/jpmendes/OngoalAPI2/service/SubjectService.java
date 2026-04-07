package com.jpmendes.OngoalAPI2.service;

import com.jpmendes.OngoalAPI2.dto.SubjectDTO;
import com.jpmendes.OngoalAPI2.model.Subject;
import com.jpmendes.OngoalAPI2.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public List<SubjectDTO> getAll(){
        List<Subject> subjects = subjectRepository.findAll();
        return subjects
                .stream()
                .map(SubjectDTO::convert)
                .collect(Collectors.toList());
    }

    public SubjectDTO newSubject(SubjectDTO subjectDTO){
        Subject subject = subjectRepository.save(Subject.convert(subjectDTO));
        return SubjectDTO.convert(subject);
  }

    public SubjectDTO updateSubject(Long id, SubjectDTO subjectDTO) {
        Subject subject = subjectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Subject not found"));
        subject.setHoursStudied(subjectDTO.getHoursStudied());
        subject = subjectRepository.save(subject);
        return SubjectDTO.convert(subject);
    }

    public void deleteSubject(Long id){
        if (!subjectRepository.existsById(id)){
            throw new RuntimeException("Subject does not exists!");
        }else {
            subjectRepository.deleteById(id);
        }
    }

    public int getAllHours(){
        List<Subject> subjects = subjectRepository.findAll();
        int hours = 0;
        for(Subject s : subjects){
            hours+=s.getHoursStudied();
        }
        return hours;
    }
}
