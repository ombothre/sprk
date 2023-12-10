package com.exam.examservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "c_questions")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CprogModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cInt;

    @Column(name = "questions")
    private String cQuestions;

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

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserModel user;
}
