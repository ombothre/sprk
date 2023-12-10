package com.exam.examservice.repository;

import com.exam.examservice.entity.ExamInfoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamInfoRepository extends JpaRepository<ExamInfoModel, Long> {
}
