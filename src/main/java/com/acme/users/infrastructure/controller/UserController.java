package com.acme.users.infrastructure.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.users.application.command.CreateUserCommand;
import com.acme.users.application.handler.CreateUserHandler;
import com.acme.users.domain.DocumentType;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
	private final CreateUserHandler createUserHandler;

	public UserController(CreateUserHandler createUserHandler) {
		this.createUserHandler = createUserHandler;
	}

	@PostMapping
	public ResponseEntity<Void> createUser(@RequestBody CreateUserRequest request) {
		log.debug("Begin create: userToCreate = {}", request);


		CreateUserCommand createUserCommand = new CreateUserCommand(
				request.getFirstName(), 
				request.getLastName(), 
				request.getCityOfBirth(), 
				request.getAge(),
				DocumentType.valueOf(request.getDocumentType())
				);

		log.debug("CreateUserCommand: {}", createUserCommand);

		createUserHandler.ejecutar(createUserCommand);

		log.debug("End create: userCreated");
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
}
