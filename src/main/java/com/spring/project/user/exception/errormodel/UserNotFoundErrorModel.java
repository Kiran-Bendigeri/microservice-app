package com.spring.project.user.exception.errormodel;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class UserNotFoundErrorModel {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private LocalDateTime timestamp;
    private String errorMessage;
    private String errorStatus;
    private String path;
    private String code;

    public UserNotFoundErrorModel() {
        this.timestamp = LocalDateTime.now();
    }

}
