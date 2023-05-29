package za.co.bakery.service;

import java.util.List;
import za.co.bakery.model.Ingredient;

public interface IngredientService {
    List<Ingredient> getProductIngredients(int recipeID);
}
