package com.example.case_study_m4.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto
{
    private Long id;

    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;

    @Column(nullable=false)
    private String gender;

    @Column(nullable=false)
    private Long balance = 0L;


    @NotEmpty(message = "Username should not be empty")
    private String username;

    @NotEmpty(message = "Password should not be empty")
    private String password;

    @NotEmpty(message = "Email should not be empty")
    @Email
    private String email;

    private boolean isActive = true;
}
