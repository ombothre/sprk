package com.exam.examservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "python_questions")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PythonModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pyInt;

    @Column(name = "questions")
    private String pyQuestions;

    @Column(name = "option_one")
    private String optionOne;

    @Column(name = "option_two")
    private String optionTwo;

    @Column(name = "option_three")
    private String optionThree;

    @Column(name = "option_four")
    private String optionFour;

    @Column(name = "py_ans")
    private String pyAns;

    @Column(name = "py_marks")
    private String pymarks;



}
