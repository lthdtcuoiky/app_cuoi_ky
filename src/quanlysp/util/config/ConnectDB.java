package util.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {
	private static String url = "jdbc:mysql://localhost:3306/quanlysanpham?seUnicode=true&characterEncoding=utf-8";
	private static String user = "root";
	private static String password = "";
	private static Connection connect = null;
	private static PreparedStatement ps;

	static {
		try {
			initConnection();
		} catch (ClassNotFoundException e) {
			System.out.println("lỗi khởi tạo Driver MySQL");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("lỗi khởi tạo kết nối MySQL");
			e.printStackTrace();
		}
	}

	private static void initConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		connect = DriverManager.getConnection(url, user, password);
		System.out.println("Kết nối thành công");
	}

	public static Connection getConnection() {
		return connect;
	}

	// Thực thi câu lệnh SELECT
	public ResultSet excuteQuerySelect(String sql) {
		try {
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("truy vấn select thành công");
			return rs;
		} catch (SQLException e) {
			System.out.println("Truy vấn select thất bại");
			e.printStackTrace();

		}

		return null;
	}

	// Thực thi INSERT, DELETE, UPDATE
	public void excuteQueryUpdate(String sql) {

		try {
			Statement stmt = connect.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("truy vấn thành công");
		} catch (SQLException e) {
			System.out.println("Truy vấn thất bại");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ConnectDB();
	}
}
