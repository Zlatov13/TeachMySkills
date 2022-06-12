package com.example.springDataJPA.servise;

import com.example.springDataJPA.dao.HandlerCrudRepository;
import com.example.springDataJPA.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class HandlerUser implements Handler {

    @Autowired
    private HandlerCrudRepository handlerCrudRepository;

    private User user = new User();

    @Override
    public void createUser(String name) {
        long idRandom = (long) (Math.random() * 100000);
        user.setId(idRandom);
        user.setName(name);
        handlerCrudRepository.save(user);
    }

    @Override
    public User searchById(long id) {
        handlerCrudRepository.findById(id);
        Optional<User> users = handlerCrudRepository.findById(id);
        user.setName(users.get().getName());
        user.setId(id);
        return user;
    }

    @Override
    public void deleteUser(long id) {
        handlerCrudRepository.deleteById(id);
    }

    @Override
    public void editUserById(long id, String name) {
        user.setId(id);
        user.setName(name);
        handlerCrudRepository.save(user);

    }
}
