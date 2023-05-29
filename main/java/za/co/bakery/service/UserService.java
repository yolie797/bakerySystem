package za.co.bakery.service;

import za.co.bakery.model.User;

public interface UserService {
    boolean addUser(User user);
    boolean editUser(User user);
    User userLogin(User user);
}
