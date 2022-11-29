package Business;

import Core.Logger;
import Entities.Course;
import dataAccess.ICourseDao;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private List<Course> courses = new ArrayList<Course>();
    private ICourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(ICourseDao courseDao, Logger[] loggers){
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception{
        for(Course crs : courses){
            if(crs.getCourseName() == course.getCourseName()){
                throw new Exception("Aynı kursu tekrar ekleyemezsin!");
            }
        }

        if(course.getPrice() < 0){
            throw new Exception("Kurs fiyatı 0'dan küçük olamaz!");
        }

        courses.add(course);
        courseDao.add(course);

        for (Logger logger : loggers){
            logger.log(course.getCourseName());
        }
    }

}
