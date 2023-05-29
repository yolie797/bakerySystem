package za.co.bakery.service;

import java.util.List;
import za.co.bakery.model.Nutrition;

public interface NutritionService {
    List<Nutrition> getProductNutrition(int recipeID);
}
