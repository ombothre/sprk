package com.exam.examservice.repository;

import com.exam.examservice.entity.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {

    public UserModel findByUserName(String username);

}
