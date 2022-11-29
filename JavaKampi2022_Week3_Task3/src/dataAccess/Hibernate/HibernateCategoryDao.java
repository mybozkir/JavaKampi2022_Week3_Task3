package dataAccess.Hibernate;

import Entities.Category;
import dataAccess.ICategoryDao;

public class HibernateCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName() + " Hibernate ile veritabanına eklendi.");
    }
}
