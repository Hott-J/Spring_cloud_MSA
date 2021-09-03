package com.example.userservice.dto;

import lombok.Data;

import java.util.Date;

// 중간 단계 클래스로 이동할 때 사용
@Data
public class UserDto {
    private String email;
    private String name;
    private String pwd;
    private String userId;
    private Date createdAt;

    private String encryptedPwd; // 비밀번호 암호화
}
