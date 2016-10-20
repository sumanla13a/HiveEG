import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
//import org.apache.hadoop.hive.jdbc.HiveDriver;

public class HiveCreateDb {
   private static String driverName = "org.apache.hive.jdbc.HiveDriver";
   
   public static void main(String[] args) throws SQLException, ClassNotFoundException {
      // Register driver and create driver instance
   
      Class.forName(driverName);
      // get connection
      
      Connection con = DriverManager.getConnection("jdbc:hive2://localhost:10000/default", "", "");
      Statement stmt = con.createStatement();
      
      stmt.execute("CREATE DATABASE sumanKoDB");
      System.out.println("Database userdb created successfully.");
      
      con.close();
   }
}