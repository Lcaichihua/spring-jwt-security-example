package com.cavetech.spring.security.jwt.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.cavetech.spring.security.jwt.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
