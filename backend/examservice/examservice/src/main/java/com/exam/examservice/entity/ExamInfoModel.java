package com.exam.examservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "exam_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamInfoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exam_id")
    private Long examId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "questions", length = 1000) // Adjust the length as needed
    private Set<String> questions;

    @OneToOne
    private PythonModel pyQuest;

    @OneToOne
    private CprogModel cQuest;

    @OneToOne
    private JavaModel javaQuest;

    @OneToOne
    private SQLModel sqlQuest;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;



}
