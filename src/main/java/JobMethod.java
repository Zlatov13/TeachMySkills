
import java.lang.reflect.InvocationTargetException;
import java.sql.*;


public class JobMethod implements Hanler {
    private String NEW_SQL = "INSERT INTO person.person (`id`, `login`, `password`) VALUES ";
    private Connection conn = null;

    public Connection getConn() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/person", "root", "1234");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    @Override
    public void newLogin() {
    }

    @Override
    public void entrance() {

    }

    @Override
    public void newLogin(String login, String password) {
        String SQL_Max = "SELECT MAX(id) FROM person;";
        long id;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try {
                Statement statement = getConn().createStatement();
                ResultSet resultSet = statement.executeQuery(SQL_Max);
                while (resultSet.next()) {
                    id = resultSet.getLong("MAX(id)");
                    id = id + 1;
                    String SQL_Two = "('" + id + "', '" + login + "', ' " + password + "');";
                    int resultset = statement.executeUpdate(NEW_SQL + SQL_Two);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }


    boolean react = false;

    @Override
    public boolean entrance(String login, String password) {
        String SQL_Login = "SELECT * FROM person.person WHERE login = '" + login + "';";
        String sql2 = "SELECT * FROM person.person;";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try {

                Statement statement = getConn().createStatement();
                ResultSet resultSet = statement.executeQuery(SQL_Login);

                while (resultSet.next()) {
                    String passwordNow = resultSet.getString("password");
                    if (password.equals(passwordNow.trim())) {
                        react = true;
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return react;
    }


}
