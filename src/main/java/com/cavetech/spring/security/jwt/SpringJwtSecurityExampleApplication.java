package com.cavetech.spring.security.jwt;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cavetech.spring.security.jwt.entity.User;
import com.cavetech.spring.security.jwt.repository.UserRepository;
import java.util.stream.Stream;
import java.util.stream.Collectors;
@SpringBootApplication
public class SpringJwtSecurityExampleApplication {

	
	@Autowired
    private UserRepository repository;

    @PostConstruct
    public void initUsers() {
        List<User> users = Stream.of(
                new User(101, "lcaichihua", "123", "lcaichihua@gmail.com"),
                new User(102, "user1", "pwd1", "user1@gmail.com"),
                new User(103, "user2", "pwd2", "user2@gmail.com"),
                new User(104, "user3", "pwd3", "user3@gmail.com")
        ).collect(Collectors.toList());
        repository.saveAll(users);
    }
	public static void main(String[] args) {
		SpringApplication.run(SpringJwtSecurityExampleApplication.class, args);
	}

}
