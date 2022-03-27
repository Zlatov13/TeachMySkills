import java.sql.*;
import java.util.Scanner;

public class ReliseMethods implements Methods {
    private Connection conn = null;
    private final String sql = "SELECT * FROM bookstore where number =";
    private final String sqlDELETE = "update book.bookstore set count = 0 where number = ";
    private final String AUTHOR_SQL = "SELECT * FROM bookstore where author =";
    private final String COUNT_SQL = "SELECT * FROM bookstore where count >=";
    private final String COUNT_SUM_SQL = "SELECT count FROM bookstore;";
    private final String MAX_SQL_ID = "SELECT  MAX(id) FROM bookstore;";

    public Connection getConn() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/book", "root", "1234");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    @Override
    public void add() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер книги");
        long numberBook = scan.nextLong();
        System.out.println("Введите наименование книги");
        String nameBook = scan.next();
        System.out.println("Введите автора книги");
        String authorBook = scan.next();
        System.out.println("Введите количество книг");
        int countBook = scan.nextInt();



    }

    @Override
    public void getByNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер книги");
        long number = scan.nextLong();
        try {
            Statement statement = getConn().createStatement();
            ResultSet resultSet = statement.executeQuery(sql + number);
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                int number1 = (int) resultSet.getLong("number");
                String author = resultSet.getString("author");
                int count = resultSet.getInt("count");
                Book obj = new Book();
                obj.setId((int) id);
                obj.setName(name);
                obj.setNumber(number1);
                obj.setAuthor(author);
                obj.setCount(count);
                System.out.println(obj);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteByNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер кнги");
        long number = scan.nextLong();
        try {
            Statement statement = getConn().createStatement();
            int resultSet = statement.executeUpdate(sqlDELETE + number);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getCountByNumber() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введте необходимое колчество книг");
            int countBook = scan.nextInt();
            Statement statement = getConn().createStatement();
            ResultSet resultSet = statement.executeQuery(COUNT_SQL + countBook);
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                int number1 = (int) resultSet.getLong("number");
                String author = resultSet.getString("author");
                int count = resultSet.getInt("count");
                Book obj = new Book();
                obj.setId((int) id);
                obj.setName(name);
                obj.setNumber(number1);
                obj.setAuthor(author);
                obj.setCount(count);
                System.out.println(obj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getByAuthor() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введте автора");
        String author = scan.nextLine();
        try {
            Statement statement = getConn().createStatement();
            ResultSet resultSet = statement.executeQuery(AUTHOR_SQL + "\"" + author + "\"");
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                long number = resultSet.getLong("number");
                String author1 = resultSet.getString("author");
                int count = resultSet.getInt("count");
                Book obj = new Book();
                obj.setId((int) id);
                obj.setName(name);
                obj.setNumber(number);
                obj.setAuthor(author1);
                obj.setCount(count);
                System.out.println(obj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getCountAllBooks() {

        try {
            Statement statementn = getConn().createStatement();
            ResultSet resultset = statementn.executeQuery(COUNT_SUM_SQL);
            int countSum = 0;
            while (resultset.next()) {
                int count = resultset.getInt("count");
                countSum += count;
            }
            System.out.println("Общее колчиество книг " + countSum);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}