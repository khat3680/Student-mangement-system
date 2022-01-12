package com.springboot.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class StudentMangementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentMangementSystemApplication.class, args);
	}


//	@Autowired
	// private StudentRepository studentRespository;

//	public void run(String... args) throws Exception {

//		Student student1 = new Student ("Anshul", "Khatri", "anshulskhe@gmail.com");
//
//		studentRespository.save(student1);
//
//		Student student2 = new Student ("Kanishk", "Khatri", "kanishkhatri@gmail.com");
//
//		studentRespository.save(student2);
//
//		Student student3 = new Student ("Spider", "Man", "spidermans@gmail.com");
//
//		studentRespository.save(student3);
//	}

}
