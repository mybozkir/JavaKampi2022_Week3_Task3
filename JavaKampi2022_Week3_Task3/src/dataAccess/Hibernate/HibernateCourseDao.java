package dataAccess.Hibernate;

import Entities.Course;
import dataAccess.ICourseDao;

public class HibernateCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + " Hibernate ile veritabanına eklendi.");
    }
}
