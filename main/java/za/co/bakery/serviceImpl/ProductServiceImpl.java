package za.co.bakery.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import za.co.bakery.model.Product;
import za.co.bakery.service.ProductService;

public class ProductServiceImpl implements ProductService {
    private static ProductService productService = null;
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    private ProductServiceImpl(Connection con) {
        this.con = con;
    }

    public static ProductService getInstance(Connection dbCon) {
        if (productService == null) {
            productService = new ProductServiceImpl(dbCon);
        }
        return productService;
    }

   

    public List<Product> retrieveProductFromDb() {
        List<Product> productList = new ArrayList<>();
        if (con != null) {
            try {
                ps = con.prepareStatement("SELECT userEmailAddress,fName,lName,title,tellNo FROM product");
                rs = ps.executeQuery();

            } catch (SQLException ex) {
                System.out.println("ERROR!!! " + ex.getMessage());
            } finally {
                if (ps != null) {
                    try {
                        ps.close();
                    } catch (SQLException ex) {
                        System.out.println("could not close: " + ex.getMessage());
                    }
                }
            }
        }
        return productList;
    }

    @Override
    public List<Product> getProductByCategory(String category) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> getAllProducts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addProduct(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editProduct(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
