package com.exam.examservice.repository;

import com.exam.examservice.entity.CprogModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CRepository extends JpaRepository<CprogModel,Long> {
}
