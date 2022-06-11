package com.example.demo.servise;

import com.example.demo.entity.User;
import org.springframework.web.servlet.ModelAndView;

public interface Handler {

    public void createUser(String name);
    public User searchById(long id);

    public void deleteUser(long id);

    public void editUserById(long id, String name);
}
