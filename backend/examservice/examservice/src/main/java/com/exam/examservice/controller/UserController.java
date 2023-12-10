package com.exam.examservice.controller;

import com.exam.examservice.Service.UserService;
import com.exam.examservice.dto.ExamRequest;
import com.exam.examservice.dto.UserCreationRequest;
import com.exam.examservice.entity.*;
import com.exam.examservice.exception.DataAlreadyExistException;
import com.exam.examservice.response.ApiResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Set;

@RestController
@RequestMapping(path = "/auth/api")
public class UserController {
    @Autowired
    UserService userService;

@PostMapping("/login")
public ResponseEntity<?> login(@RequestBody UserModel userModel) {

    String username  = userModel.getUserName();
    String password = userModel.getPassword();

    ApiResponse response = userService.login(username, password);

    return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(response);
}

@PostMapping("/create/user")
public ResponseEntity<?> createUser(@RequestBody UserCreationRequest userRequest) {

    try {
        UserModel newUser = userService.createUser(userRequest.getUserName(), userRequest.getEmail(), userRequest.getPassword());
        return new ResponseEntity<>("User created successfully with ID: ", HttpStatus.CREATED);
    } catch (DataAlreadyExistException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}

    @PostMapping("/logout")
    public ApiResponse<String> logout(HttpSession session) {
        return userService.logout(session);
    }

    @PostMapping("/create/exam")
    public ResponseEntity<String> createExam(@RequestBody ExamRequest request) {


        // Call the createExam method from ExamService
        PythonModel createdExam = userService.createExam(
                request.getPyquestions(),
                request.getOptionOne(),
                request.getOptionTwo(),
                request.getOptionThree(),
                request.getOptionFour(),
                request.getPyAns(),
                request.getPyMarks()
        );

        return new ResponseEntity<>("Exam created successfully with ID: " + createdExam.getPyInt(), HttpStatus.CREATED);
    }
}
