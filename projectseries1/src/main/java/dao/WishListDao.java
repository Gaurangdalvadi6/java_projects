package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connectivity.DBConnection;
import model.WishList;

public class WishListDao {
	public static void insertWishList(WishList w) {
		try {
			Connection connection = DBConnection.createConnection();
			String sqlString = "insert into wishlist(pid,cusid) values(?,?)";
			PreparedStatement pst = connection.prepareStatement(sqlString);
			pst.setInt(1, w.getPid());
			pst.setInt(2, w.getCusid());
			pst.executeUpdate();
			System.out.println("your data is updated in wishlist...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<WishList> getWishListByCusId(int id){
		List<WishList> list = new ArrayList<WishList>();
		try {
			Connection connection = DBConnection.createConnection();
			String sqlString = "select * from wishlist where cusid=?";
			PreparedStatement pst = connection.prepareStatement(sqlString);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				WishList w = new WishList();
				w.setWid(rs.getInt("wid"));
				w.setPid(rs.getInt("pid"));
				w.setCusid(rs.getInt("cusid"));
				list.add(w);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static void removeFromWishList(int wid) {
		try {
			Connection connection = DBConnection.createConnection();
			String sqlString = "delete from wishlist where wid=?";
			PreparedStatement pst = connection.prepareStatement(sqlString);
			pst.setInt(1, wid);
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean checkProductexits(int cusid,int pid) {
		boolean flag = false;
		try {
			Connection connection = DBConnection.createConnection();
			String sqlString = "select * from wishlist where cusid=? and pid=?";
			PreparedStatement pst = connection.prepareStatement(sqlString);
			pst.setInt(1, cusid);
			pst.setInt(2, pid);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
}
