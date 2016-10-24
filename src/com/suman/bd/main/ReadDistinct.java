package com.suman.bd.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.suman.bd.db.DBConnection;

public class ReadDistinct {
	// Reads distinct dates
	public static void readDistinct() throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		Statement stmt = con.createStatement();
		String query = "Select distinct(entryDate) from hivedemotable";
		ResultSet set = stmt.executeQuery(query);
		while(set.next()) {
			System.out.println(set.getString(1));
		}
		con.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ReadDistinct.readDistinct();
	}
}
