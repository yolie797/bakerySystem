package za.co.bakery.model;

import java.util.Objects;

public class Category {
    private int categoryId;
    private String description;
    private boolean isActive;

    public Category(int categoryId, String description, boolean isActive) {
        this.categoryId = categoryId;
        this.description = description;
        this.isActive = isActive;
    }
    public Category(int categoryId, String description) {
        this(categoryId, description,true);
    }
    public Category() {
      this(0, "Unknown",false);
    }

    public Category(boolean isActive) {
        this.isActive = isActive;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.categoryId;
        hash = 29 * hash + Objects.hashCode(this.description);
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
        final Category other = (Category) obj;
        if (this.categoryId != other.categoryId) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Category{" + "categoryId=" + categoryId + ", description=" + description + ", isActive=" + isActive + '}';
    }
    
    
}
