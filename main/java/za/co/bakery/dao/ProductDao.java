package za.co.bakery.dao;

import java.util.List;
import za.co.bakery.model.Product;

public interface ProductDao {
    List<Product> getProductByCategory(String category);
    List<Product> getAllProducts();
    boolean addProduct(Product product);
    boolean editProduct(Product product);
}
