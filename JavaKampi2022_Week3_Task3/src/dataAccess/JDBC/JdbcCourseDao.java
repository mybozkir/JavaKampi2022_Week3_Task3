package dataAccess.JDBC;

import Entities.Course;
import dataAccess.ICourseDao;

public class JdbcCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + " JDBC ile veritabanına eklendi.");
    }
}
