package com.acme.users.application.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.acme.users.application.command.CreateUserCommand;
import com.acme.users.application.factory.UserFactory;
import com.acme.users.domain.User;
import com.acme.users.domain.service.CreateUserService;

import lombok.AllArgsConstructor;

@Component
public class CreateUserHandler {
	@Autowired
	private CreateUserService createUserService;
	@Autowired
    private UserFactory userFactory;

    public CreateUserHandler(CreateUserService createUserService, UserFactory userFactory) {
        this.createUserService = createUserService;
        this.userFactory = userFactory;
    }

    @Transactional
    public void ejecutar(CreateUserCommand command) {
        User user = userFactory.createUser(command);
        createUserService.execute(user);
    }
}
