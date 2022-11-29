package dataAccess.JDBC;

import Entities.Category;
import dataAccess.ICategoryDao;

public class JdbcCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName() + " JDBC ile veri tabanına eklendi.");
    }
}
