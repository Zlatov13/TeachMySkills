package servise;

import dao.ConnectDB;
import entity.Person;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JobDBHandler implements Handler {
    private static final String SQL_SEARCH_WRITE = "SELECT * FROM user where id =";
    public Person person = new Person();

    public Person search(long id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try {
                ConnectDB connect = ConnectDB.getInstance();
                Statement statement = connect.connection.createStatement();
                ResultSet resultSet = statement.executeQuery(SQL_SEARCH_WRITE + id);
                while (resultSet.next()) {
                    long idSearch = resultSet.getLong("id");
                    String name = resultSet.getString("name");
                    person.setName(name);
                    person.setId(idSearch);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return person;

    }

    @Override
    public void delete() {

    }

    @Override
    public void newPerson() {

    }

    @Override
    public void edit() {

    }
}
