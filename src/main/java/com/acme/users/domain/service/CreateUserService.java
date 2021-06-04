package com.acme.users.domain.service;

import org.springframework.stereotype.Component;

import com.acme.users.domain.User;
import com.acme.users.domain.repository.UserRepository;

@Component
public class CreateUserService {
	private final UserRepository repository;

    public CreateUserService(UserRepository repository) {
        this.repository = repository;
    }

    public void execute(User user) {
        repository.add(user);
    }
}
