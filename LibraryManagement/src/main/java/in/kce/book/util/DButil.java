package in.kce.book.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DButil{
public static Connection getConnection() {
try {
Class.forName("oracle.jdbc.driver.OracleDriver");
String url = "jdbc:oracle:thin:@localhost:1522:xe";
String user = "system";   // or your schema
String password = "root";

Connection connection = DriverManager.getConnection(url, user, password);
return connection;
} catch (ClassNotFoundException |SQLException  e) {
e.printStackTrace();
return null;
}
}

}