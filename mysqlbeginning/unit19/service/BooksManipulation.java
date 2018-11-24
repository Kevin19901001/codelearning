package start.unit19.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import start.unit19.entity.Book;
import start.unit19.util.DBUtil;

public class BooksManipulation {

	public static void main(String[] args) {
		//addBook();
		//deleteBook(10010004);
		//updateBook(10010001, "Harry Poter");
		String bookInfo = queryBookById(10010001);
		System.out.println(bookInfo);
	}
	
	
	public static void addBook(){
		String sql = "insert into book (name, sn, price, remark) values (" + "'lala', " + "'456123789', " + 25.55 + ", '987654321'" + ")";
		System.out.println(sql);
		
		DBUtil.exec(sql);
	}
	
	
	public static void deleteBook(int id){
		String sql = "delete from book where book_id=" + id;
		System.out.println(sql);
		DBUtil.exec(sql);
	}
	
	
	public static void updateBook(int id, String name){
		String sql = "update book set name=" + "'" + name + "'" + " where book_id=" + id;
		System.out.println(sql);
		DBUtil.exec(sql);
	}
	
	
	public static String queryBookById(int id){
		String sql = "* from book where book_id=" + id;
		System.out.println(sql);
		Connection conn = DBUtil.getConnection();
		ResultSet rs = DBUtil.query(conn, "select", sql);
		try {
			if(rs.next()){
				Book b = new Book();
				b.setId(rs.getInt("book_id"));
				b.setName(rs.getString("name"));
				b.setSn(rs.getString("sn"));
				b.setPrice(rs.getDouble("price"));
				b.setRemark(rs.getString("remark"));
				return b.getId() + " " + b.getName() + " " + b.getSn() +" " +  b.getPrice() + " " + b.getRemark();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		return null;
	}

}
