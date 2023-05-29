package za.co.bakery.model;

import java.awt.image.BufferedImage;
import java.util.Objects;

public class Product {
    private int productID;
    private Recipe recipeID;
    private String name; 
    private Recipe description; 
    private String warnings; 
    private String category; 
    private double price; 
    private BufferedImage image;

    public Product() {
    }

    public Product(int productID, Recipe recipeID, String name, Recipe description, String warnings, String category, double price, BufferedImage image) {
        this.productID = productID;
        this.recipeID = recipeID;
        this.name = name;
        this.description = description;
        this.warnings = warnings;
        this.category = category;
        this.price = price;
        this.image = image;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public Recipe getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(Recipe recipeID) {
        this.recipeID = recipeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Recipe getDescription() {
        return description;
    }

    public void setDescription(Recipe description) {
        this.description = description;
    }

    public String getWarnings() {
        return warnings;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.productID;
        hash = 19 * hash + Objects.hashCode(this.recipeID);
        hash = 19 * hash + Objects.hashCode(this.name);
        hash = 19 * hash + Objects.hashCode(this.description);
        hash = 19 * hash + Objects.hashCode(this.warnings);
        hash = 19 * hash + Objects.hashCode(this.category);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 19 * hash + Objects.hashCode(this.image);
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
        final Product other = (Product) obj;
        if (this.productID != other.productID) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.warnings, other.warnings)) {
            return false;
        }
        if (!Objects.equals(this.category, other.category)) {
            return false;
        }
        if (!Objects.equals(this.recipeID, other.recipeID)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.image, other.image)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Product{" + "productID=" + productID + ", recipeID=" + recipeID + ", name=" + name + ", description=" + description + ", warnings=" + warnings + ", category=" + category + ", price=" + price + ", image=" + image + '}';
    }

    
}
