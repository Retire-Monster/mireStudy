package com.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertMain {
	// DB에 데이터를 쓰기
	public static void main(String[] args)throws Exception {
		String driverName = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String username = "mire001";
		String password = "mire001";

		// 1. Driver loading
		Class.forName(driverName);

		// 2. connection
		Connection conn = DriverManager.getConnection(url, username, password);

		String sql = "insert into 고객(고객아이디,고객이름,나이,등급,직업,적립금) " + "values('mama','mama',21,'gold','학생',100)";
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(sql);

		
		// 6. close()
		if(stmt!=null) stmt.close();
		if(conn!=null) conn.close();
			
	}

}
