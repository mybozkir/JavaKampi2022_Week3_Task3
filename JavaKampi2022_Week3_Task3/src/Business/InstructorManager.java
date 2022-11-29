package Business;

import Core.Logger;
import Entities.Instructor;
import dataAccess.IInstructorDao;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    private List<Instructor> instructors = new ArrayList<Instructor>();
    private IInstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(IInstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {
        instructors.add(instructor);
        instructorDao.add(instructor);

        for(Logger logger : loggers){
            logger.log(instructor.getLastName());
        }
    }
}
