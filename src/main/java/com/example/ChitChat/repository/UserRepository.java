package com.example.chitchat.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.chitchat.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
