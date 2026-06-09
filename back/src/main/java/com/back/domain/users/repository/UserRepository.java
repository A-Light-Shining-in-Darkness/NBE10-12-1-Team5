package com.back.domain.users.repository;

import com.back.domain.users.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Integer> {
    List<Users> findByDeleteDateIsNull();
    Optional<Users> findByIdAndDeleteDateIsNull(Integer id);
}