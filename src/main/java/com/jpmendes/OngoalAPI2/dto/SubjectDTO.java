package com.jpmendes.OngoalAPI2.dto;

import com.jpmendes.OngoalAPI2.model.Subject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectDTO {
    private Long id;
    private String name;
    private int questionsSolved;
    private double hoursStudied;

    public static SubjectDTO convert(Subject subject){
        SubjectDTO subjectDTO = new SubjectDTO();
        subjectDTO.setId(subject.getId());
        subjectDTO.setName(subject.getName());
        subjectDTO.setQuestionsSolved((subject.getQuestionsSolved()));
        subjectDTO.setHoursStudied(subject.getHoursStudied());
        return subjectDTO;
    }
}
