package com.acme.users.infrastructure.persistence.entity;

import javax.persistence.*;

import com.acme.users.domain.DocumentType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@Entity(name = "user")
public class UserEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;

	@Column(length=50, nullable=false, unique=false)
	private String firstName;

	@Column(length=50, nullable=false, unique=false)
	private String lastName;

	@Column(length=50, nullable=false, unique=false)
	private String cityOfBirth;

	@Column(length=50, nullable=false, unique=false)
	private Integer age;

	@Enumerated(EnumType.STRING)
	private DocumentType documentType;
}
