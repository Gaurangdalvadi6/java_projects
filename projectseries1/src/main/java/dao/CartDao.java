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
	public static List<Cart> getCartByCusId(int id){
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
}
