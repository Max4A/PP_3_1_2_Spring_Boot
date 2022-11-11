package com.example.PP312.Dao;



import com.example.PP312.Model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public User getUserById(int id);

    public void saveUser(User user);

    public void updateUser(int id, User updatedUser);

    public void deleteUser(int id);
}
