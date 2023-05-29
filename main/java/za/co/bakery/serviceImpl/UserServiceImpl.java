package za.co.bakery.serviceImpl;

import za.co.bakery.dao.UserDao;
import za.co.bakery.dao.impl.UserDaoImpl;
import za.co.bakery.db.manager.DBManager;
import za.co.bakery.model.User;
import za.co.bakery.service.UserService;

public class UserServiceImpl implements UserService {

    UserDao userDao;

    public UserServiceImpl(DBManager dBManager) {
        this.userDao = UserDaoImpl.getInstance(dBManager.getConnection());
    }

    @Override
    public boolean addUser(User user) {
        return user != null ? userDao.addUser(user):null;
    }

    @Override
    public boolean editUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User userLogin(User user) {
        return userDao.userLogin(user);
    }

}
