package a20_9_08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class exJDBC_Select2 
{
	public static void main(String[] args) 
	{
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String password = "123456";
		String sql = "select * from member";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, password);
		pstmt = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = pstmt.executeQuery();
		rs.next();	
		System.out.print(rs.getString(1)+"\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.print(rs.getString(3)+"\t");
		System.out.print(rs.getString(4)+"\t");
		System.out.println(rs.getInt(5));
		System.out.println("");
		rs.first();	// 첫번째 레코드의 값을 가져옴
		System.out.print(rs.getString(1)+"\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.print(rs.getString(3)+"\t");
		System.out.print(rs.getString(4)+"\t");
		System.out.println(rs.getInt(5));
		System.out.println("");
		rs.absolute(3); // 세번째 레코드의 값을 가져옴
		System.out.print(rs.getString(1)+"\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.print(rs.getString(3)+"\t");
		System.out.print(rs.getString(4)+"\t");
		System.out.println(rs.getInt(5));
		System.out.println("");
		rs.previous();	// 이전 레코드의 값을 가져옴
		System.out.print(rs.getString(1)+"\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.print(rs.getString(3)+"\t");
		System.out.print(rs.getString(4)+"\t");
		System.out.println(rs.getInt(5));
		System.out.println("");
		rs.last(); 	// 마지막 레코드의 값을 가져옴
		System.out.print(rs.getString(1)+"\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.print(rs.getString(3)+"\t");
		System.out.print(rs.getString(4)+"\t");
		System.out.println(rs.getInt(5));
		System.out.println("");	
		
		rs.last();	// 마지막 레코드의 값을 가져옴
		int rows = rs.getRow();	// 레코드 갯수를 구함
		System.out.println(rows);
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
}
