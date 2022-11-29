package Business;

import Core.Logger;
import Entities.Category;
import dataAccess.ICategoryDao;

import java.util.ArrayList;
import java.util.List;


public class CategoryManager {
    private List<Category> categories = new ArrayList<Category>();
    private ICategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(ICategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception{
        for (Category cat : categories){
            if (category.getCategoryName() == cat.getCategoryName()){
                throw new Exception("Aynı kategoriyi tekrar ekleyemezsiniz!");
            }
        }

        categories.add(category);
        categoryDao.add(category);

        for (Logger logger : loggers){
            logger.log(category.getCategoryName());
        }

    }



}
