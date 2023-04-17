package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connectivity.DBConnection;
import model.Cart;

public class CartDao {
	public static void insertCart(Cart c) {
		try {
			Connection connection = DBConnection.createConnection();
			String sqlString = "insert into cart(cusid,pid,pname,pprice,pqty,payment_status,total) values(?,?,?,?,?,?,?)";
			PreparedStatement pst = connection.prepareStatement(sqlString);
			pst.setInt(1, c.getCusid());
			pst.setInt(2, c.getPid());
			pst.setString(3, c.getPname());
			pst.setInt(4, c.getPprice());
			pst.setInt(5, c.getPqty());
			pst.setString(6, c.getPayment_status());
			pst.setInt(7, c.getTotal());
			pst.executeUpdate();
			System.out.println("added");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static List<Cart> getCartByCusId(int id) {
		List<Cart> list = new ArrayList<Cart>();
		try {
			Connection connection = DBConnection.createConnection();
			String sqlString = "select * from cart where cusid=?";
			PreparedStatement pst = connection.prepareStatement(sqlString);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Cart c = new Cart();
				c.setCid(rs.getInt("cid"));
				c.setCusid(rs.getInt("cusid"));
				c.setPid(rs.getInt("pid"));
				c.setPname(rs.getString("pname"));
				c.setPprice(rs.getInt("pprice"));
				c.setPqty(rs.getInt("pqty"));
				c.setPayment_status(rs.getString("payment_status"));
				c.setTotal(rs.getInt("total"));
				list.add(c);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	public static Cart getCartByCid(int cid) {
		Cart c= null;
		try {
			Connection connection = DBConnection.createConnection();
			String sqlString = "select * from cart where cid=?";
			PreparedStatement pst = connection.prepareStatement(sqlString);
			pst.setInt(1, cid);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				c = new Cart();
				c.setCid(rs.getInt("cid"));
				c.setCusid(rs.getInt("cusid"));
				c.setPid(rs.getInt("pid"));
				c.setPname(rs.getString("pname"));
				c.setPprice(rs.getInt("pprice"));
				c.setPqty(rs.getInt("pqty"));
				c.setPayment_status(rs.getString("payment_status"));
				c.setTotal(rs.getInt("total"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return c;
	}
	
	public static void updateCart(Cart c) {
		try {
			Connection connection = DBConnection.createConnection();
			String sqlString = "update cart set pqty=?,total=? where cid=?";
			PreparedStatement pst = connection.prepareStatement(sqlString);
			pst.setInt(1, c.getPqty());
			pst.setInt(2, c.getTotal());
			pst.setInt(3, c.getCid());
			pst.executeUpdate();
			System.out.println("cart updated");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static boolean checkProductexits(int cusid,int pid) {
		boolean flag = false;
		try {
			Connection connection = DBConnection.createConnection();
			String sqlString = "select * from cart where cusid=? and pid=?";
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
