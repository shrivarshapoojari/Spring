package com.shri.crudAdvanceJPA.DAO;

import com.shri.crudAdvanceJPA.entity.Instructor;
import com.shri.crudAdvanceJPA.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor theInstructor);
    Instructor findInstructorById(int theId);
    void deleteInstructorById(int id);
}
