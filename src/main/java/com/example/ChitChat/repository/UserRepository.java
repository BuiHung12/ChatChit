package com.example.chitchat.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.chitchat.model.UserChat;

@Repository
public interface UserRepository extends CrudRepository<UserChat, Long>{

}
