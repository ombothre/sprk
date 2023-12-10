package com.exam.examservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackages = "com.exam.examservice")
public class ExamserviceApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExamserviceApplication.class, args);
	}

}
