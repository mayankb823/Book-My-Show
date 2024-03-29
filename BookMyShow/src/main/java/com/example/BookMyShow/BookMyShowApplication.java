package com.example.BookMyShow;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookMyShowApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
	}

	@Bean
	public static ModelMapper modelMapper(){
		return new ModelMapper();
	}

}
