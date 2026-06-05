package com.back.users.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class GetUserRequest {

    private Long id;
    private String email;
    private String address;
    private String postcode;
    private LocalDateTime createdate;
    private LocalDateTime updatedate;
}