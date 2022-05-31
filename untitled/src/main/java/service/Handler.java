package service;
import entity.User;

public interface Handler {

        User search(long id);

        void delete(long id);

        void create(String string);

        void edit(long id, String name);

    }
