package za.co.bakery.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import za.co.bakery.dao.UserDao;
import za.co.bakery.model.User;

public class UserDaoImpl implements UserDao {

    private List<User> users;
    private static UserDao userDao = null;
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    private UserDaoImpl(Connection con) {
        this.con = con;
    }

    public static UserDao getInstance(Connection dbCon) {
        if (userDao == null) {
            userDao = new UserDaoImpl(dbCon);
        }
        return userDao;
    }

    @Override
    public boolean addUser(User user) {
        boolean retVal = false;
        if (con != null) {
            try {
                ps = con.prepareStatement("INSERT INTO user(userEmailAddress,password,fName,lName,title,tellNo, roleId, active) values(?,?,?,?,?,?,?,?)");
                ps.setString(1, user.getEmail().toLowerCase());
                ps.setString(2, user.getPassword());
                ps.setString(3, user.getfName());
                ps.setString(4, user.getLname());
                ps.setString(5, user.getTitle());
                ps.setString(6, user.getPhoneNo());
                ps.setString(7, user.getRoleId());
                ps.setBoolean(8, user.isActive());
                if (ps.executeUpdate() > 0) {
                    retVal = true;
                }
            } catch (SQLException ex) {
                System.out.println("Error!!: " + ex.getMessage());
            } finally {
                if (ps != null) {
                    try {
                        ps.close();
                    } catch (SQLException ex) {
                        System.out.println("Could not close: " + ex.getMessage());
                    }
                }
            }
        }
        return retVal;
    }

    @Override
    public boolean editUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User userLogin(User user) {
        User aUser = null;
        if (con != null) {
            try {
                ps = con.prepareStatement("Select userEmailAddress, fName,lname,title,tellNo,roleId,active from user WHERE userEmailAddress=? AND PASSWORD=?");
                ps.setString(1, user.getEmail().toLowerCase());
                ps.setString(2, user.getPassword());
                rs = ps.executeQuery();
                if (rs.next()){
                    aUser = new User(
                      rs.getString("userEmailAddress"),
                      rs.getString("fName"),
                      rs.getString("lname"),
                      rs.getString("title"),
                      "",
                      rs.getString("tellNo"),
                      rs.getString("roleId"),
                      rs.getBoolean("active"));
                }
            } catch (SQLException ex) {
                System.out.println("Error!!: " + ex.getMessage());
            } finally {
                if (ps != null) {
                    try {
                        ps.close();
                    } catch (SQLException ex) {
                        System.out.println("Could not close: " + ex.getMessage());
                    }
                }
            }
        }
        return aUser;
    }
}
