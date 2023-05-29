package za.co.bakery.service;

import java.util.List;
import za.co.bakery.model.Product;

public interface ProductService {
    List<Product> getProductByCategory(String category);
    List<Product> getAllProducts();
    boolean addProduct(Product product);
    boolean editProduct(Product product);
}
