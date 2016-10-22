package com.suman.bd.main;

import java.sql.*;

import com.suman.bd.db.*;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CreateDBAndTables.createDB();
		CreateDBAndTables.createTable();
		InsertAlot.insertLogs();
		Connection con = DBConnection.getConnection();
		Statement stmt = con.createStatement();
		ResultSet set = stmt.executeQuery("Select * from hivedemotable where entryDate like 'Aug 10%'");
		while(set.next()) {
			System.out.println(set.getString(2));
		}
	}
}
