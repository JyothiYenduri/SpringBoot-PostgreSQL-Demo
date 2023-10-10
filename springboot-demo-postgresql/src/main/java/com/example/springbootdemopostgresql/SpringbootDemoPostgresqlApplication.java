package com.example.springbootdemopostgresql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springbootdemopostgresql.entity.Student;
import com.example.springbootdemopostgresql.repository.StudentRepository;

@SpringBootApplication
public class SpringbootDemoPostgresqlApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoPostgresqlApplication.class, args);
	}

	@Autowired
	private StudentRepository sr;
	@Override
	public void run(String... args) throws Exception {
		Student s=new Student();
		
		s.setName("Chinna");
		sr.save(s);
	}

}
