package com.example.springDataJPA.servise;

import com.example.springDataJPA.entity.User;

public interface Handler {

    public void createUser(String name);
    public User searchById(long id);

    public void deleteUser(long id);

    public void editUserById(long id, String name);
}
