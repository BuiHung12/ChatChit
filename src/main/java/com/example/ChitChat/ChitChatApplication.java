package com.example.chitchat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.example.chitchat.repository")
public class ChitChatApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ChitChatApplication.class, args);
	}

}
