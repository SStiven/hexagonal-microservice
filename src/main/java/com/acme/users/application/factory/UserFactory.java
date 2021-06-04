package com.acme.users.application.factory;

import org.springframework.stereotype.Component;

import com.acme.users.application.command.CreateUserCommand;
import com.acme.users.domain.User;

@Component
public class UserFactory {
    public User createUser(CreateUserCommand command) {
        return new User(command.getFirstName(), 
        		command.getLastName(), 
        		command.getCityOfBirth(),
        		command.getAge(),
        		command.getDocumentType());
    }
}
