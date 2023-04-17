package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connectivity.DBConnection;

public class AdminDao {
public static void adminLogin(String email,String password) {
	try {
		Connection connection = DBConnection.createConnection();
		String sqlstString = "select * from admin where email=? and password=?";
		PreparedStatement pst = connection.prepareStatement(sqlstString);
		pst.setString(1, email);
		pst.setString(2, password);
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
