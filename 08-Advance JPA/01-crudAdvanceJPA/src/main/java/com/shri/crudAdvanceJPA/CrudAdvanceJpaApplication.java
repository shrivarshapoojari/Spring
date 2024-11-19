package com.shri.crudAdvanceJPA;

import com.shri.crudAdvanceJPA.DAO.AppDAO;
import com.shri.crudAdvanceJPA.entity.Instructor;
import com.shri.crudAdvanceJPA.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudAdvanceJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudAdvanceJpaApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO)
	{
		return runner->
		{
		   createInstructor(appDAO);
//			findInstructor(appDAO);
			deleteInstructor(appDAO);
		};
	}

	private  void findInstructor(AppDAO appDAO)
	{
		int id=1;
		System.out.println("Finding");

		Instructor temp=appDAO.findInstructorById(id);
		System.out.println("Instructor"+temp);
	}
	private  void deleteInstructor(AppDAO appDAO)
	{
		int id=2;
		System.out.println("Deleting");
		appDAO.deleteInstructorById(id);
		System.out.println("-----------------------------------Deleted-----------------------------------------------------");
	}

	private void createInstructor(AppDAO appDAO) {

		Instructor temp=new Instructor("shri","varsha","shri@gmail.com");

		InstructorDetail tempInstructorDetail=new InstructorDetail(
				"http:////",
				"love2code"



		);
		temp.setInstructorDetail(tempInstructorDetail);

		System.out.println("saving"+temp);

		appDAO.save(temp);

		System.out.println("done");


	}
}
