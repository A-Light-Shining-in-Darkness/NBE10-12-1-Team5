package com.back.domain.users.dto;

import com.back.domain.users.entity.Users;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CreateUserResponse {

    private final Integer id;
    private final String email;
    private final String address;
    private final String addressDetail;
    private final String postcode;
    private final LocalDateTime createDate;
    private final LocalDateTime modifyDate;

    public CreateUserResponse(Users users) {
        this.id = users.getId();
        this.email = users.getEmail();
        this.address = users.getAddress();
        this.addressDetail = users.getAddressDetail();
        this.postcode = users.getPostcode();
        this.createDate = users.getCreateDate();
        this.modifyDate = users.getModifyDate();
    }
}