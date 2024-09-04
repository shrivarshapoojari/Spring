package com.shrivarsha.crud.dao;

import com.shrivarsha.crud.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);


    Student findByID(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);

}
