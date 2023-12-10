package com.exam.examservice.dto;

import com.exam.examservice.entity.CprogModel;
import com.exam.examservice.entity.JavaModel;
import com.exam.examservice.entity.PythonModel;
import com.exam.examservice.entity.SQLModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExamRequest {

    private Long userId;
    private String pyquestions;
    private PythonModel pyQuest;
    private String optionOne;
    private String optionTwo;
    private String optionThree;
    private String optionFour;
    private String pyAns;
    private String pyMarks;
}
