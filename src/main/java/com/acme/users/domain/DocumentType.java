package com.acme.users.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum DocumentType {
	DNI("Cedula"),
	ARC("Cedula de Extranjeria");
	
	private final String description;
}
