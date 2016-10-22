package com.suman.bd.db;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertAlot {
	public static void insertLogs() throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		Statement stmt = con.createStatement();
		stmt.execute("LOAD DATA LOCAL INPATH '/home/cloudera/HiveEG/yum.log' INTO TABLE HiveDemoTable");
		System.out.println("done inserting things");
		con.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		InsertAlot.insertLogs();
	}
	
}
