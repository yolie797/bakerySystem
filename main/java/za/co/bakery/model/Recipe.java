package za.co.bakery.model;

import java.util.List;
import java.util.Objects;

public class Recipe {
    private String category;
    private int recipeID;
    private List<Ingredient> ingredients;

    public Recipe() {
    }

    public Recipe(String category, int recipeID, List ingerdients) {
        this.category = category;
        this.recipeID = recipeID;
        this.ingredients = ingerdients;
    }
    
    public String getCategory() {
        return category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    public int getRecipeID() {
        return recipeID;
    }
    
    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }
    
    public List getIngerdients() {
        return ingredients;
    }
    
    public void setIngerdients(List ingerdients) {
        this.ingredients = ingerdients;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.category);
        hash = 59 * hash + this.recipeID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Recipe other = (Recipe) obj;
        if (this.recipeID != other.recipeID) {
            return false;
        }
        if (!Objects.equals(this.category, other.category)) {
            return false;
        }
        if (!Objects.equals(this.ingredients, other.ingredients)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Recipe{" + "category=" + category + ", recipeID=" + recipeID + ", ingredients=" + ingredients + '}';
    }
    
    
}
