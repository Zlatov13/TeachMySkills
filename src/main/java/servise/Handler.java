package servise;

import entity.Person;

public interface Handler {
Person search(long id) ;


    void delete(long id);

void newName(String string);

void edit();


}
