package za.co.bakery.dao;

import java.util.List;
import za.co.bakery.model.Nutrition;

public interface NutritionDao {
    List<Nutrition> getProductNutrition(int recipeID);
}
