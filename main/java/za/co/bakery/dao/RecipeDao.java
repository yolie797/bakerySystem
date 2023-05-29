package za.co.bakery.dao;

import java.util.List;
import za.co.bakery.model.Recipe;

public interface RecipeDao {
   List<Recipe> getProductRecipe(int recipeID); 
}
