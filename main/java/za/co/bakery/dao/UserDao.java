package za.co.bakery.dao;

import za.co.bakery.model.User;

public interface UserDao {
    boolean addUser(User user);
    boolean editUser(User user);
    User userLogin(User user);
}
