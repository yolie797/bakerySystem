package za.co.bakery.dao;

import za.co.bakery.model.Category;


public interface CategoryDao {
    Category getCategory(int categoryId);
    boolean createCategory(Category category);
    boolean activateCategory(int categoryId, boolean activate);
}
