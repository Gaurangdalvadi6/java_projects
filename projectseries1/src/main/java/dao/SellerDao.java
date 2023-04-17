package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connectivity.DBConnection;
import model.Seller;

public class SellerDao {
	public static void insertSeller(Seller s) {
		try {
			Connection connection = DBConnection.createConnection();
			String sqlString="insert into seller(name,contact,address,email,password) values(?,?,?,?,?)";
			PreparedStatement pst = connection.prepareStatement(sqlString);
			pst.setString(1, s.getName());
			pst.setLong(2, s.getContact());
			pst.setString(3, s.getAddress());
			pst.setString(4, s.getEmail());
			pst.setString(5, s.getPassword());
			pst.executeUpdate();
			System.out.println("data inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean checkEmail(String email) {
		boolean flag = false;
		try {
			Connection connection = DBConnection.createConnection();
			String sqlString = "select * from seller where email=?";
			PreparedStatement pst = connection.prepareStatement(sqlString);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}
	public static Seller loginSeller(Seller s) {
		Seller s1 = null;
		try {
			Connection connection = DBConnection.createConnection();
			String sqString = "select * from seller where email=? and password=?";
			PreparedStatement pst = connection.prepareStatement(sqString);
			pst.setString(1, s.getEmail());
			pst.setString(2, s.getPassword());
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				s1 = new Seller();
				s1.setId(rs.getInt("id"));
				s1.setName(rs.getString("name"));
				s1.setContact(rs.getLong("contact"));
				s1.setAddress(rs.getString("address"));
				s1.setEmail(rs.getString("email"));
				s1.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return s1;
	}
	public static void updateProfile(Seller s) {
		try {
			Connection  connection = DBConnection.createConnection();
			String sqString = "update seller set name=?,contact=?,address=?,email=? where id=?";
			PreparedStatement pst = connection.prepareStatement(sqString);
			pst.setString(1, s.getName());
			pst.setLong(2, s.getContact());
			pst.setString(3, s.getAddress());
			pst.setString(4, s.getEmail());
			pst.setInt(5, s.getId());
			pst.executeUpdate();
			System.out.println("data updated");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static boolean checkOldPassword(int id,String op) {
		boolean flag = false;
		try {
			Connection connection = DBConnection.createConnection();
			String sqlString = "select * from seller where id=? and password=?";
			PreparedStatement pst = connection.prepareStatement(sqlString);
			pst.setInt(1, id);
			pst.setString(2, op);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public static void changePassword(int id,String np) {
		try {
			Connection connection = DBConnection.createConnection();
			String sqlString="update seller set password=? where id=?";
			PreparedStatement pst = connection.prepareStatement(sqlString);
			pst.setString(1, np);
			pst.setInt(2, id);
			pst.executeUpdate();
			System.out.println("password changed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void changeNewPasswrod(String email,String np) {
		try {
			Connection connection = DBConnection.createConnection();
			String sqlString="update seller set password=? where email=?";
			PreparedStatement pst = connection.prepareStatement(sqlString);
			pst.setString(1, np);
			pst.setString(2, email);
			pst.executeUpdate();
			System.out.println("password will changed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<Seller> getAllSellers(){
		List<Seller> list = new ArrayList<Seller>();
		try {
			Connection connection = DBConnection.createConnection();
			String sqlString = "select * from seller";
			PreparedStatement pst = connection.prepareStatement(sqlString);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Seller s1 = new Seller();
				s1.setId(rs.getInt("id"));
				s1.setName(rs.getString("name"));
				s1.setContact(rs.getLong("contact"));
				s1.setAddress(rs.getString("address"));
				s1.setEmail(rs.getString("email"));
				s1.setPassword(rs.getString("password"));
				list.add(s1);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	public static Seller getSellerById(int id) {
		Seller s1 = null;
		try {
			Connection connection = DBConnection.createConnection();
			String sqlstString = "select * from seller where id=?";
			PreparedStatement pst = connection.prepareStatement(sqlstString);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				s1 = new Seller();
				s1.setId(rs.getInt("id"));
				s1.setName(rs.getString("name"));
				s1.setContact(rs.getLong("contact"));
				s1.setAddress(rs.getString("address"));
				s1.setEmail(rs.getString("email"));
				s1.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return s1;
	}
	public static void deleteSeller(int id) {
		try {
			Connection connection = DBConnection.createConnection();
			String sqlstString = "delete from seller where id=?";
			PreparedStatement pst = connection.prepareStatement(sqlstString);
			pst.setInt(1, id);
			pst.executeUpdate();
			System.out.println("data deleted...");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
