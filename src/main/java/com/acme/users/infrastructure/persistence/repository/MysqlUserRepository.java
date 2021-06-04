package com.acme.users.infrastructure.persistence.repository;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.acme.users.domain.User;
import com.acme.users.domain.repository.UserRepository;
import com.acme.users.infrastructure.persistence.mapper.UserMapper;

@Repository
public class MysqlUserRepository implements UserRepository{
	
    private final EntityManager entityManager;
    
    public MysqlUserRepository(EntityManager entityManager) {
    	this.entityManager = entityManager;
    }

    @Override
    public void add(User user) {
    	entityManager.persist(UserMapper.toEntity(user));
    }

}
