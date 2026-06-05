package com.back.users.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String addressDetail;

    @Column(nullable = false)
    private Integer postcode;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdate;

    @LastModifiedDate
    private LocalDateTime modifydate;

    @Builder
    public Users(String email, String address, String addressDetail, Integer postcode) {
        this.email = email;
        this.address = address;
        this.addressDetail = addressDetail;
        this.postcode = postcode;
    }

    public void update(String email, String address, String addressDetail, Integer postcode) {
        this.email = email;
        this.address = address;
        this.addressDetail = addressDetail;
        this.postcode = postcode;
    }
}