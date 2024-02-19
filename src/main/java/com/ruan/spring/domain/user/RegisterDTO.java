package com.ruan.spring.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
