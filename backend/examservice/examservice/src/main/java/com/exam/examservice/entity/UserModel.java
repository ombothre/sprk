package com.exam.examservice.entity;

import com.exam.examservice.enums.Roles;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;


    @Column(name = "use_name")
    private String userName;

    @Column(name = "use_email")
    private String email;

    @Column(name = "use_password")
    private String password;


    @Column(name = "use_enabled")
    private boolean enabled;

    @ElementCollection(targetClass = Roles.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "role")
    private Set<Roles> roles = new HashSet<>();


    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private ExamModel examScore;
}
