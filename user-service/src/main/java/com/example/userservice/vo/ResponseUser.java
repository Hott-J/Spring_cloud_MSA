package com.example.userservice.vo;

import lombok.Data;

// 반환 객체, 비밀번호는 안알려줌
@Data
public class ResponseUser {
    private String email;
    private String name;
    private String userId;
}
