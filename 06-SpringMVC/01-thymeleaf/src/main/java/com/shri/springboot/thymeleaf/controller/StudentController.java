package com.shri.springboot.thymeleaf.controller;


import com.shri.springboot.thymeleaf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/showStudentForm")
    public String showForm(Model theModel)
    {

                Student theStudent=new Student();
                theModel.addAttribute("student",theStudent);
            return  "student-form";
    }

    @PostMapping("/processStudentForm")
    public String process(@ModelAttribute("student") Student theStudent)

    {

        System.out.println("the student "+ theStudent.getFirstName() + " "+theStudent.getLastName());
        return "student-confirmation";
    }
}
