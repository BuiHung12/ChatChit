package com.example.ChitChat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.example.ChitChat.repository")
public class ChitChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChitChatApplication.class, args);
	}

}
