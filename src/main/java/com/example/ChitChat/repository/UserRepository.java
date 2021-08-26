package com.example.chitchat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.chitchat.model.UserChat;

@Repository
public interface UserRepository extends CrudRepository<UserChat, Long>{
	@Query("SELECT u FROM UserChat u WHERE LOWER(u.username) = LOWER(:username) AND LOWER(u.password) = LOWER(:password)")
    public List<UserChat> find(@Param("username") String username, @Param("password") String password);
}
