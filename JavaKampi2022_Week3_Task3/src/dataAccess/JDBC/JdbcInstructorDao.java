package dataAccess.JDBC;

import Entities.Instructor;
import dataAccess.IInstructorDao;

public class JdbcInstructorDao implements IInstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getFirstName() + instructor.getLastName() + " JDBC ile veritabanına eklendi.");
    }
}
