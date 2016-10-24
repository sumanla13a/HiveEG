package com.suman.bd.main;

import java.sql.*;

import com.suman.bd.db.*;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CreateDBAndTables.createDB();
		CreateDBAndTables.createTable();
		InsertAlot.insertLogs();
	}
}
