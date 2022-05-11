package servise;

import dao.ConnectDB;
import dao.ConnectHibernate;
import entity.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Statement;

public class JobDBHandler implements Handler {
    private static final String SQL_SEARCH_WRITE = "SELECT * FROM user where id =";
    public Person person = new Person();

    public Person search(long id) {
        ConnectHibernate.getInstance();
        Session sessCreat = ConnectHibernate.getSessionFactory().openSession();
        Transaction trans = sessCreat.beginTransaction();
        sessCreat.load(person, id);
        trans.commit();
        sessCreat.close();
        return person;
    }

    @Override
    public void delete(long id) {
        Person pers = new Person();
        pers.setId(id);
        ConnectHibernate.getInstance();
        Session ssesCreat = ConnectHibernate.getSessionFactory().openSession();
        Transaction transaction = ssesCreat.beginTransaction();
        ssesCreat.delete(pers);
        transaction.commit();
        ssesCreat.close();
    }

    @Override
    public void newName(String string) {
        long idRandom = (long) (Math.random() * 100000);
        Person pers = new Person();
        pers.setName(string);
        pers.setId(idRandom);
        ConnectHibernate.getInstance();
        Session sessCreat = ConnectHibernate.getSessionFactory().openSession();
        Transaction trans = sessCreat.beginTransaction();
        sessCreat.save(pers);
        trans.commit();
        sessCreat.close();
    }

    @Override
    public void edit(long id, String name) {
       person.setId(id);
       person.setName(name);
        ConnectHibernate.getInstance();
        Session sessCreat = ConnectHibernate.getSessionFactory().openSession();
        Transaction trans = sessCreat.beginTransaction();
        sessCreat.update(person);
        trans.commit();
        sessCreat.close();
    }
}
