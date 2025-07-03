package com.spring.project.user.request;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spring.project.user.validation.custom_annotation.PasswordValidator;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserRegistrationRequest {

    @JsonProperty(namespace = "username")
    @NotBlank(message = "User name should not be blank")
    @Size(min = 3, max = 20, message = "Username must be between {min} and {max} characters long")
    private String username;

    @JsonProperty(namespace = "email")
    @Email
    @NotBlank(message = "EmailId should not be blank")
    @Size(min = 10, max = 30, message = "EmailId must be between {min} and {max} characters long")
    private String emailId;

    @JsonProperty(namespace = "password")
    @PasswordValidator
    private String password;

    @JsonProperty(namespace = "role", defaultValue = "user")
    private String role;

}
