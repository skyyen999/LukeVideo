package dao;

import domain.User;

import javax.persistence.*;
import java.util.List;


public interface UserDao {
    public void addUser(User p);
    public void updateUser(User p);
    public List<User> list();
    public User getById(int id);
    public void removeUser(int id);
}