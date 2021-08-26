package com.example.chitchat.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.chitchat.model.Message;
import com.example.chitchat.model.UserChat;
import com.example.chitchat.repository.MessageRepository;
import com.example.chitchat.repository.UserRepository;
import com.example.chitchat.service.MessageService;


@Service
public class MessageServiceImpl implements MessageService {
	
	@Autowired
	private MessageRepository messageRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Optional<Message> findLatestMessage(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Message message) {
		messageRepository.save(message);
	}

	@Override
	public void remove(Message message) {
		messageRepository.delete(message);
		
	}

	@Override
	public Optional<Message> findById(Long id) {
		return messageRepository.findById(id);
	}

	@Override
	public List<Message> findAll() {
		return (List<Message>) messageRepository.findAll();
	}

	@Override
	public List<Message> findByUsername(String username) {
		return messageRepository.find(username);
	}

	@Override
	public Optional<UserChat> findByUserId(Long userId) {
		return userRepository.findById(userId);
	}	
}