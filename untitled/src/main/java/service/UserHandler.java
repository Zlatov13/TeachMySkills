package service;

import entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserHandler implements Handler {
    @Autowired
    private SessionFactory sessionFactory;

    public User user = new User();

    @Transactional
    @Override
    public User search(long id) {
        sessionFactory.getCurrentSession().load(user, id);
        return user;
    }

    @Transactional
    @Override
    public void delete(long id) {
        user.setId(id);
        sessionFactory.getCurrentSession().delete(user);
    }

    @Transactional
    @Override
    public void newName(String newName) {
        long idRandom = (long) (Math.random() * 100000);
        user.setId(idRandom);
        user.setName(newName);
        sessionFactory.getCurrentSession().save(user);
    }

    @Transactional
    @Override
    public void edit(long id, String name) {
        user.setId(id);
        user.setName(name);
        sessionFactory.getCurrentSession().update(user);
    }
}


