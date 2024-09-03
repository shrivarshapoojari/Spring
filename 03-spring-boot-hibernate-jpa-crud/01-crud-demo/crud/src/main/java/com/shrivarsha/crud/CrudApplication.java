package com.shrivarsha.crud;

import com.shrivarsha.crud.dao.StudentDAO;
import com.shrivarsha.crud.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO)
	{
		return runner ->{
			 createStudent(studentDAO);
		};
	}
	private void createStudent(StudentDAO studentDAO)
	{
		//create the student object
		System.out.println("Creating new student object..");

		Student tempStudent =new Student("Shri","varsha","shrivarshapoojari@gmail.com");
		System.out.println("Saving the object ..........");
		studentDAO.save(tempStudent);
		System.out.println("Saved");
		System.out.println("Saved Student ,Generated id"+ tempStudent.getId());
	}

}
