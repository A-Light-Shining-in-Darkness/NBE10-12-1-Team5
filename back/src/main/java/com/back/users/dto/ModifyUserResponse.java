package com.back.users.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ModifyUserResponse {

    private final String resultCode;
    private final String msg;
    private final UserData data;

    public ModifyUserResponse(String resultCode, String msg, UserData data) {
        this.resultCode = resultCode;
        this.msg = msg;
        this.data = data;
    }

    @Getter
    public static class UserData {
        private final Long id;
        private final String email;
        private final String address;
        private final String postcode;
        private final LocalDateTime createdate;
        private final LocalDateTime updatedate;

        public UserData(Long id, String email, String address, String postcode,
                        LocalDateTime createdate, LocalDateTime updatedate) {
            this.id = id;
            this.email = email;
            this.address = address;
            this.postcode = postcode;
            this.createdate = createdate;
            this.updatedate = updatedate;
        }
    }
}