package com.acme.users.infrastructure.controller;

import javax.validation.constraints.NotNull;

import lombok.Value;

@Value
public class CreateUserRequest {
	@NotNull(message = "Debe de ingresar un nombre.")
	private String firstName;
	@NotNull
	private String lastName;
	@NotNull
	private String cityOfBirth;
	@NotNull
	private Integer age;
	@NotNull
	private String documentType;
}
