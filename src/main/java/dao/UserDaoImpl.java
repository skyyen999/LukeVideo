package dao;

import domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }
    public void addUser(User p){

    }
    public void updateUser(User p){

    }

    public List<User> list(){
        Session session = this.sessionFactory.getCurrentSession();
        List<User> list = session.createQuery("from User").list();
        return list;
    }
    public User getById(int id){
        return null;
    }
    public void removeUser(int id){

    }
}