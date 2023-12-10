package com.exam.examservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "java_questions")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JavaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long javInt;

    @Column(name = "questions")
    private String javQuestions;

    @Column(name = "option_one")
    private String optionOne;

    @Column(name = "option_two")
    private String optionTwo;

    @Column(name = "option_three")
    private String optionThree;

    @Column(name = "option_four")
    private String optionFour;

    @Column(name = "py_ans")
    private String javAns;

    @Column(name = "py_marks")
    private String javmarks;

    @OneToOne
    @JoinColumn(name = "created_by")
    private UserModel user;

}
