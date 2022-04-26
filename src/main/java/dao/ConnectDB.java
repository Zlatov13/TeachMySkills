package dao;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectDB {

    private static ConnectDB instance ;
   public Connection connection;
    private String user = "root";
    private String password = "130995";
    private String url = "jdbc:mysql://127.0.0.1:3306/user";

    public String sql = "INSERT INTO `user` (`id`, `name`) VALUES ('1', 'Andr');";

    ConnectDB() {
        try {
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static ConnectDB getInstance() {
        try {
            if (ConnectDB.instance == null) {
               ConnectDB.instance = new ConnectDB();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ConnectDB.instance;

    }}









