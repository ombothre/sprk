package com.exam.examservice.repository;

import com.exam.examservice.entity.JavaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JavaRepository extends JpaRepository<JavaModel, Long> {
}
