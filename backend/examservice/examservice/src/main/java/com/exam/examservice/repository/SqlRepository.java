package com.exam.examservice.repository;

import com.exam.examservice.entity.SQLModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SqlRepository extends JpaRepository<SQLModel, Long> {
}
