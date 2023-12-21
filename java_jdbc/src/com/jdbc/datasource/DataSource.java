package com.jdbc.datasource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataSource {
	private static DataSource instance = new DataSource();
//	private DataSource() {}	//인스턴스의 추가 생성을 막음
	public static DataSource gatInstance() {
		return instance;
	}
	private String driverName = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String username = "mire001";
	private String password = "mire001";
	public static DataSource getInstance() {
		return instance;
	}
	public static void setInstance(DataSource instance) {
		DataSource.instance = instance;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Connection getConnection()throws Exception{
		Class.forName(driverName);
		Connection conn = DriverManager.getConnection(url,username,password);
		return conn;
	}
}