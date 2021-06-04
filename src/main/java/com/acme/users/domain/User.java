package com.acme.users.domain;

import lombok.Getter;

@Getter
public class User {
	private String firstName;
	private String lastName;
	private String cityOfBirth;
	private Integer age;
	private DocumentType documentType;

	public User(String firstName, 
			String lastName, 
			String cityOfBirth, 
			Integer age, 
			DocumentType documentType) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.cityOfBirth = cityOfBirth;
		this.age = age;
		this.documentType = documentType;
	}
}
