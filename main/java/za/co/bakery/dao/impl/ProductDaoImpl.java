package za.co.bakery.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import za.co.bakery.dao.ProductDao;
import za.co.bakery.model.Product;

public class ProductDaoImpl implements ProductDao {
    private static ProductDao productDao = null;
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    private ProductDaoImpl(Connection con) {
        this.con = con;
    }

    public static ProductDao getInstance(Connection dbCon) {
        if (productDao == null) {
            productDao = new ProductDaoImpl(dbCon);
        }
        return productDao;
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
