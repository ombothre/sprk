package com.exam.examservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sql_questions")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SQLModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sqlInt;

    @Column(name = "questions")
    private String sqlQuestions;

    @Column(name = "option_one")
    private String optionOne;

    @Column(name = "option_two")
    private String optionTwo;

    @Column(name = "option_three")
    private String optionThree;

    @Column(name = "option_four")
    private String optionFour;

    @Column(name = "py_ans")
    private String sqlAns;

    @Column(name = "py_marks")
    private String sqlmarks;

    @OneToOne
    @JoinColumn(name = "created_by")
    private UserModel user;
}
