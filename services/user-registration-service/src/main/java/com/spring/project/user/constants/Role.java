package com.spring.project.user.constants;

public enum Role {

    USER("USER"),
    ADMIN("ADMIN");

    private String role;

    public String getRole() {
        return role;
    }

    private Role(String role) {
        this.role = role;
    }

}
