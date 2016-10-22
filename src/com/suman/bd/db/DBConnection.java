package com.suman.bd.db;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
//import org.apache.hadoop.hive.jdbc.HiveDriver;

public class DBConnection {
   private static String driverName = "org.apache.hive.jdbc.HiveDriver";
   
   public static Connection getConnection() throws SQLException, ClassNotFoundException {
      Class.forName(driverName);
      
      Connection con = DriverManager.getConnection("jdbc:hive2://localhost:10000/hivedemo", "", "");
      return con;
   }
   
   public static void closeConnection(Connection con) throws SQLException {
	   con.close();
   }
}