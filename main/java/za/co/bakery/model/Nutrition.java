package za.co.bakery.model;

import java.util.Objects;

public class Nutrition {
    private int nutritionID;
    private String nutritionName;
    private double nutritionValue;

    public Nutrition() {
    }

    public Nutrition(int nutritionID, String nutritionName, double nutritionValue) {
        this.nutritionID = nutritionID;
        this.nutritionName = nutritionName;
        this.nutritionValue = nutritionValue;
    }
    
    public int getNutritionID() {
        return nutritionID;
    }
    
    public void setNutritionID(int nutritionID) {
        this.nutritionID = nutritionID;
    }
    
    public String getNutritionName() {
        return nutritionName;
    }
    
    public void setNutritionName(String nutritionName) {
        this.nutritionName = nutritionName;
    }
    
    public double getNutritionValue() {
        return nutritionValue;
    }
    
    public void setNutritionValue(double nutritionValue) {
        this.nutritionValue = nutritionValue;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.nutritionID;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.nutritionValue) ^ (Double.doubleToLongBits(this.nutritionValue) >>> 32));
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
        final Nutrition other = (Nutrition) obj;
        if (this.nutritionID != other.nutritionID) {
            return false;
        }
        if (Double.doubleToLongBits(this.nutritionValue) != Double.doubleToLongBits(other.nutritionValue)) {
            return false;
        }
        if (!Objects.equals(this.nutritionName, other.nutritionName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Nutrition{" + "nutritionID=" + nutritionID + ", nutritionName=" + nutritionName + ", nutritionValue=" + nutritionValue + '}';
    }
    
}
