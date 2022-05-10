package servise;

import com.mysql.cj.xdevapi.SessionFactory;
import dao.ConnectDB;
import dao.ConnectHibernate;
import entity.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.sql.ResultSet;
import java.sql.Statement;

public class JobDBHandler implements Handler {
    private static final String SQL_SEARCH_WRITE = "SELECT * FROM user where id =";
    public Person person = new Person();

    public Person search(long id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            ConnectDB connect = ConnectDB.getInstance();
            Statement statement = connect.connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SEARCH_WRITE + id);
            while (resultSet.next()) {
                long idSearch = resultSet.getLong("id");
                String name = resultSet.getString("name");
                person.setName(name);
                person.setId(idSearch);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return person;
    }

    @Override
    public void delete(long id) {
        String SQL_DELETE = "DELETE FROM `user`.`user` WHERE (`id` = '" + id + "');";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try {
                ConnectDB connect = ConnectDB.getInstance();
                Statement statement = connect.connection.createStatement();
                statement.executeUpdate(SQL_DELETE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        String editSQL = " UPDATE `user`.`user` SET `name` = '" + name + "' WHERE (`id` = '" + id + "');";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            ConnectDB connect = ConnectDB.getInstance();
            Statement statement = connect.connection.createStatement();
            statement.executeUpdate(editSQL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
