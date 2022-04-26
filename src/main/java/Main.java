import dao.ConnectDB;

import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws Exception {

ConnectDB ff = ConnectDB.getInstance();
Statement statement = ff.connection.createStatement();
int result = statement.executeUpdate(ff.sql);


    }


}
