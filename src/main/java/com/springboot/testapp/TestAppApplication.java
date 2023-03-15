package com.springboot.testapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.testapp.Model.Blog;

@SpringBootApplication
public class TestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestAppApplication.class, args);
		System.out.println("Started...........");
	}
}
