package za.co.bakery.dao;

import java.util.List;
import za.co.bakery.model.Ingredient;

public interface IngredientDao {
    List<Ingredient> getProductIngredients(int recipeID);
}
