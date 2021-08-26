package com.example.chitchat.service;

import java.util.List;
import java.util.Optional;

import com.example.chitchat.model.Message;
import com.example.chitchat.model.UserChat;


public interface MessageService {
	List<Message> findAll();
	Optional<Message> findLatestMessage(String username);
    void save(Message message);
    void remove(Message message);
    Optional<Message> findById(Long id);
    List<Message> findByUsername(String username);
    
    Optional<UserChat> findByUserId(Long UserId);

}