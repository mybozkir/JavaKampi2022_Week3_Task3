package dataAccess.Hibernate;

import Entities.Instructor;
import dataAccess.IInstructorDao;

public class HibernateInstructorDao implements IInstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " Hibernate ile veritabanına eklendi.");
    }
}
