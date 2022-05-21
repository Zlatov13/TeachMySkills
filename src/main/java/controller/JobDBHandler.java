package controller;

import dao.ConnectHibernate;
import entity.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class JobDBHandler implements Handler {
    public Person person = new Person();

    public Person search(long id) {
        ConnectHibernate.getInstance();
        Session sessCreat = ConnectHibernate.getSessionFactory().openSession();
        Transaction trans = sessCreat.beginTransaction();
        try {
            sessCreat.load(person, id);
            trans.commit();
            sessCreat.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return person;
    }

    @Override
    public void delete(long id) {
        person.setId(id);
        ConnectHibernate.getInstance();
        Session ssesCreat = ConnectHibernate.getSessionFactory().openSession();
        Transaction transaction = ssesCreat.beginTransaction();
        ssesCreat.delete(person);
        transaction.commit();
        ssesCreat.close();
    }

    @Override
    public void newName(String newName) {
        long idRandom = (long) (Math.random() * 100000);
        person.setId(idRandom);
        person.setName(newName);
        ConnectHibernate.getInstance();
        Session sessCreat = ConnectHibernate.getSessionFactory().openSession();
        Transaction trans = sessCreat.beginTransaction();
        sessCreat.save(person);
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
