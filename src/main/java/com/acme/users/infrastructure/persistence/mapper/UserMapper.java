package com.acme.users.infrastructure.persistence.mapper;

import com.acme.users.domain.User;
import com.acme.users.infrastructure.persistence.entity.UserEntity;

public class UserMapper {
	private UserMapper() {
	}

	public static User toDomain(UserEntity userEntity) {
		User user = null;
		if (userEntity != null) {
			user = new User(userEntity.getFirstName(), 
					userEntity.getLastName(), 
					userEntity.getCityOfBirth(),
					userEntity.getAge(),
					userEntity.getDocumentType());
		}
		return user;
	}

	public static UserEntity toEntity(User user) {
		UserEntity userEntity = new UserEntity();
		userEntity.setFirstName(user.getFirstName());
		userEntity.setLastName(user.getLastName());
		userEntity.setCityOfBirth(user.getCityOfBirth());
		userEntity.setAge(user.getAge());
		userEntity.setDocumentType(user.getDocumentType());
		return userEntity;
	}
}
