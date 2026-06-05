package com.back.users.dto;

import lombok.Getter;

@Getter
public class DeleteUserResponse {

    private final String resultCode;
    private final String msg;
    private final String data;

    public DeleteUserResponse(String resultCode, String msg, String data) {
        this.resultCode = resultCode;
        this.msg = msg;
        this.data = data;
    }
}