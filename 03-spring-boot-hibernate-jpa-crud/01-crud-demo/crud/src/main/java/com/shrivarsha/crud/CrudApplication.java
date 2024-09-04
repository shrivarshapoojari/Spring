package com.shrivarsha.crud;

import com.shrivarsha.crud.dao.StudentDAO;
import com.shrivarsha.crud.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO)
	{
		return runner ->{
//			 createStudent(studentDAO);
//			 readStudent(studentDAO);

			queryForStudents(studentDAO);
		};
	}

	private void queryForStudents(StudentDAO studentDAO) {

		List<Student> students=studentDAO.findAll();
  System.out.println("Retrieving");
		for(Student temp:students)
			System.out.println(temp);
	}

	private void readStudent(StudentDAO studentDAO) {

		System.out.println("Creating new Student");

		Student temp=new Student("Poojary","Shrivarsha","shrivarshapoojary@gmail.com");
		System.out.println("Saving Student");
		studentDAO.save(temp);

		int id=temp.getId();
		System.out.println("Saved Student  id is "+ id);

		System.out.println("Retreiving student with id " + id);

		Student mystudent=studentDAO.findByID(id);

		System.out.println("Found student "+ mystudent);




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
