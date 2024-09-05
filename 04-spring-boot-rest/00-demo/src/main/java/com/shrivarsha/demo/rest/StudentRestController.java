package com.shrivarsha.demo.rest;

import com.shrivarsha.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {


    private List<Student> students;

    @PostConstruct
    public void loadData()
    {
         students=new ArrayList<>();
        students.add(new Student("Shrivarsha","Poojary"));
        students.add(new Student("Shri","Poojar"));
        students.add(new Student("varsha","Poojary"));

    }





    @GetMapping("/students")
    public List<Student> getStudents()
    {

        return students;
    }
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id)
    {

        if((id>=students.size() || id<0))
        {
            throw new StudentNotFoundException("Student Id not found"+id);
        }
        return students.get(id);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc)
    {
        StudentErrorResponse error=new StudentErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);

    }
    
}
