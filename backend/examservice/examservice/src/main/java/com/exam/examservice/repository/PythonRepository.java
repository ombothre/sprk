package com.exam.examservice.repository;

import com.exam.examservice.entity.PythonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PythonRepository extends JpaRepository<PythonModel,Long> {
}
