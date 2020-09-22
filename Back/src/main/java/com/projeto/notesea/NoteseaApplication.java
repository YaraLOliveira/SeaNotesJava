package com.projeto.notesea;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.projeto.notesea.controller"})
@EntityScan(basePackages = { "com.projeto.notesea.model" })
@EnableJpaRepositories(basePackages = { "com.projeto.notesea.repository" })
public class NoteseaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoteseaApplication.class, args);
	}


	
	

}
