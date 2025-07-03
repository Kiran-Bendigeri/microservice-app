package com.spring.project.user.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.spring.project.user.constants.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_details")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", unique = true, nullable = false)
    private Long userId;

    @Column(name = "user_name", nullable = false)
    private String username;

    @Column(name = "user_email", nullable = false)
    private String emailId;

    @Column(columnDefinition = "NUMBER(1) DEFAULT 0", name = "user_email_verification_status", nullable = false)
    private Boolean emailVerificationStatus;

    @Column(name = "user_password", nullable = false)
    private String password;

    @CreationTimestamp
    @Column(name = "user_created_date", nullable = false)
    private LocalDateTime createdDate;

    @UpdateTimestamp
    @Column(name = "user_modified_date")
    private LocalDateTime modifiedDate;

    @Column(columnDefinition = "varchar(50) default 'USER'", name = "user_role")
    Role userRole;

}
