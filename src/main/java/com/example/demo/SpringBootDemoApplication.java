package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@PropertySource("hello/application.properties")
public class SpringBootDemoApplication {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootDemoApplication.class);
		Info info = applicationContext.getBean(Info.class);
		System.out.println(info.getName());
		System.out.println(info.getVersion());
		System.out.println("this is Spring Boot Application");
	}
}
