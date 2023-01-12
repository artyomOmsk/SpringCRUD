package web.dao;

import web.model.User;

import java.util.List;


public interface UserDao {

    void addUser(User user);

    void deleteUser(User user);

    void updateUser(User user);

    List<User> getAllUsers();

    User getUerById(int id);


}
