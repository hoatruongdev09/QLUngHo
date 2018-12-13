package config;

import java.sql.*;

public class Database {
	 public static Connection KetNoi() throws Exception {
			Connection cn;
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("Da xac dinh");
			cn =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLUngHo;user=sa; password=123456");
			System.out.println("Da ket noi");
			return cn;
		}
}
