package com.jpmendes.OngoalAPI2.model;

import com.jpmendes.OngoalAPI2.dto.SubjectDTO;
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
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int questionsSolved;
    private int hoursStudied;

    public static Subject convert(SubjectDTO subjectDTO){
        Subject subject = new Subject();
        subject.setId(subjectDTO.getId());
        subject.setName(subjectDTO.getName());
        subject.setQuestionsSolved(subjectDTO.getQuestionsSolved());
        subject.setHoursStudied(subjectDTO.getHoursStudied());
        return subject;
    }
}
