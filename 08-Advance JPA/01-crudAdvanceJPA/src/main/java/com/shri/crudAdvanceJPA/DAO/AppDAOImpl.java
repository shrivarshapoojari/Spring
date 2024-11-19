package com.shri.crudAdvanceJPA.DAO;

import com.shri.crudAdvanceJPA.entity.Instructor;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AppDAOImpl implements  AppDAO{

    private EntityManager entityManager;


    @Autowired
    public  AppDAOImpl(EntityManager entityManager)
    {
        this.entityManager=entityManager;
    }
    @Override
    @Transactional
    public void save(Instructor theInstructor) {
        entityManager.persist((theInstructor));
    }

    @Override
    public Instructor findInstructorById(int theId) {
        return entityManager.find(Instructor.class,theId);
    }

    @Override
    @Transactional
    public  void deleteInstructorById(int id)
    {
        Instructor temp=entityManager.find(Instructor.class,id);
        entityManager.remove(temp);
    }


}
