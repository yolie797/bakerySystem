
package za.co.bakery.model;

import java.util.Objects;


public class Order {
    private String name;
    private String size;
    private String category;
    private String quantity;
    private boolean prepared;
    private boolean delivered;
    private double unitPrice;

    public Order() {
    }

    public Order(String name, String size,String category, String quantity, boolean prepared, boolean delivered, double unitPrice) {
        this.name = name;
        this.size = size;
           this.category = category;
        this.quantity = quantity;
        this.prepared = prepared;
        this.delivered = delivered;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
     public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.size = category;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public boolean isPrepared() {
        return prepared;
    }

    public void setPrepared(boolean prepared) {
        this.prepared = prepared;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.size);
        hash = 71 * hash + Objects.hashCode(this.quantity);
        hash = 71 * hash + (this.prepared ? 1 : 0);
        hash = 71 * hash + (this.delivered ? 1 : 0);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.unitPrice) ^ (Double.doubleToLongBits(this.unitPrice) >>> 32));
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
        final Order other = (Order) obj;
        if (this.prepared != other.prepared) {
            return false;
        }
        if (this.delivered != other.delivered) {
            return false;
        }
        if (Double.doubleToLongBits(this.unitPrice) != Double.doubleToLongBits(other.unitPrice)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.size, other.size)) {
            return false;
        }
        if (!Objects.equals(this.quantity, other.quantity)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Order{" + "name=" + name + ", size=" + size + ", category=" + category + ", quantity=" + quantity + ", prepared=" + prepared + ", delivered=" + delivered + ", unitPrice=" + unitPrice + '}';
    }

    

 
    
    
}
