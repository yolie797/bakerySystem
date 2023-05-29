package za.co.bakery.model;

import java.util.Objects;

public class Ingredient {
    private String ingredientID;
    private String name;
    private int quantity;

    public Ingredient() {
    }

    public Ingredient(String ingredientID, String name, int quantity) {
        this.ingredientID = ingredientID;
        this.name = name;
        this.quantity = quantity;
    }
    
    public String getIngredientID() {
        return ingredientID;
    }
    
    public void setIngredientID(String ingredientID) {
        this.ingredientID = ingredientID;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + this.quantity;
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
        final Ingredient other = (Ingredient) obj;
        if (!Objects.equals(this.ingredientID, other.ingredientID)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ingredient{" + "ingredientID=" + ingredientID + ", name=" + name + ", quantity=" + quantity + '}';
    }
    
    
}
