import Business.CategoryManager;
import Business.CourseManager;
import Business.InstructorManager;
import Core.DatabaseLogger;
import Core.FileLogger;
import Core.Logger;
import Entities.Category;
import Entities.Course;
import Entities.Instructor;
import dataAccess.Hibernate.HibernateCourseDao;
import dataAccess.Hibernate.HibernateInstructorDao;
import dataAccess.JDBC.JdbcCategoryDao;

public class Main {
    public static void main(String[] args) throws Exception{
        Logger[] loggers = {new DatabaseLogger(), new FileLogger()};

        Category category1 = new Category("Programlama");
        Category category2 = new Category("Programlama");

        Course course1 = new Course("Java", 50);

        Instructor instructor1 = new Instructor("Engin", "Demiroğ");

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);

        categoryManager.add(category1);
        //categoryManager.add(category2);

        courseManager.add(course1);

        instructorManager.add(instructor1);



    }
}