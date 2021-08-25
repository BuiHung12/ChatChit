package com.example.chitchat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.chitchat.model.Message;


@Repository
public interface MessageRepository extends CrudRepository<Message, Long>{
	
	@Query("SELECT m FROM Message m WHERE LOWER(m.nickname) = LOWER(:nickname) ORDER BY m.id DESC")
    public List<Message> find(@Param("nickname") String nickname);

}