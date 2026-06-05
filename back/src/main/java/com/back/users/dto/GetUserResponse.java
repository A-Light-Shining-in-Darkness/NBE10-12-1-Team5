package com.back.users.dto;

import com.back.users.entity.Users;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class GetUserResponse {

    private final Long id;
    private final String email;
    private final String address;
    private final String postcode;
    private final LocalDateTime createdate;
    private final LocalDateTime updatedate;

    public GetUserResponse(Users users) {
        this.id = users.getId();
        this.email = users.getEmail();
        this.address = users.getAddress();
        this.postcode = users.getPostcode();
        this.createdate = users.getCreatedate();
        this.updatedate = users.getUpdatedate();
    }
}