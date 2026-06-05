package com.back.domain.users.dto;

import lombok.Getter;

@Getter
public class DeleteUserResponse {

    private final String resultCode;
    private final String msg;

    public DeleteUserResponse(String resultCode, String msg) {
        this.resultCode = resultCode;
        this.msg = msg;
    }
}