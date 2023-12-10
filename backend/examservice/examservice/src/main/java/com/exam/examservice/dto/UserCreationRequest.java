package com.exam.examservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreationRequest {
    private String userName;
    private String email;
    private String password;

}
