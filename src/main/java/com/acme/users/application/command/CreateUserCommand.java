package com.acme.users.application.command;

import lombok.Getter;

import com.acme.users.domain.DocumentType;

@Getter
public class CreateUserCommand {
	private String firstName;
	private String lastName;
	private String cityOfBirth;
	private Integer age;
	private DocumentType documentType;
	
	public CreateUserCommand(String firstName, 
			String lastName, 
			String cityOfBith, 
			Integer age, 
			DocumentType documentType) {
		this.firstName = firstName;
		this.lastName =lastName;
		this.cityOfBirth = cityOfBith;
		this.age = age;
		this.documentType = documentType;
	}
}
