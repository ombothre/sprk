package com.exam.examservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="exam_score")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExamModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long examId;

    @Column(name = "total_marks")
    private long totalMarks;

    @Column(name = "pass_fail_grade")
    private Long passFailGrade;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserModel user;
}
