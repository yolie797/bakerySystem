
package za.co.bakery.service;

import java.util.List;
import za.co.bakery.model.Ingredient;
import za.co.bakery.model.Nutrition;
import za.co.bakery.model.Product;


public interface BakeryService {
     List<Product> getAllCategoryProduct(String category);
   String recipe(int productID);
  // String ingredient();
    List<Ingredient> getIngredient(int recipeID);
    List<Nutrition> getNutritionalInformation(int recipeID);

}
