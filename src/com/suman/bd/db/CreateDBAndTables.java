package com.suman.bd.db;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateDBAndTables {
	public static void createDB() throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		Statement stmt = con.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS HiveDemo");
		DBConnection.closeConnection(con);
		System.out.println("Database userdb created successfully.");
	}
	
	public static void createTable() throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		Statement stmt = con.createStatement();
		stmt.execute("CREATE TABLE IF NOT EXISTS HiveDemoTable (entryDate String, logInfo String) "
					+ " ROW FORMAT SERDE 'org.apache.hadoop.hive.contrib.serde2.RegexSerDe'"
					+ " WITH SERDEPROPERTIES ( "
					+ "'input.regex' = '(^[a-zA-Z]{3}\\\\s+\\\\d{2}\\\\s+\\\\d{2}:\\\\d{2}:\\\\d{2})\\\\s+(.*)',"
					+ "'output.format.string' = '%1$s %2$s'"
					+ ") "
					+ "STORED AS TEXTFILE");
		DBConnection.closeConnection(con);
		System.out.println("Table userdb created successfully.");
	}
	
}
