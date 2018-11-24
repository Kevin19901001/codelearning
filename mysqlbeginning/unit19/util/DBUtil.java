package start.unit19.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {

	private final static String URL = "jdbc:mysql://localhost:3306/javaweb?characterEncoding=UTF-8";
	private final static String USER_NAME = "root";
	private final static String PASSWORD = "Fhq19901001";
	
	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public static void closeConnection(Connection conn, Statement ps, ResultSet rs){
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(ps != null){
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static ResultSet query(Connection conn, String sqlHead, String sqlBody){
		ResultSet rs = null;
		sqlHead = "select ";
		if(conn != null){
			try {
				PreparedStatement ps = conn.prepareStatement(sqlHead + sqlBody);
				rs = ps.executeQuery();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rs;
	}
	
	
	public static boolean exec(String sql){
		Connection conn = getConnection();
		PreparedStatement ps;
		boolean result;
		try {
			ps = conn.prepareStatement(sql);
			result = ps.execute();
		} catch (SQLException e) {
			result = false;
			e.printStackTrace();
		}
		return result;
	}
	
}
