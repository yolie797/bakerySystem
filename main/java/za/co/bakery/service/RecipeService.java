package za.co.bakery.service;

import za.co.bakery.dao.*;
import java.util.List;
import za.co.bakery.model.Recipe;

public interface RecipeService {
   List<Recipe> getProductRecipe(int recipeID); 
}
