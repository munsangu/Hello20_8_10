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
		rs.first();	// ù��° ���ڵ��� ���� ������
		System.out.print(rs.getString(1)+"\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.print(rs.getString(3)+"\t");
		System.out.print(rs.getString(4)+"\t");
		System.out.println(rs.getInt(5));
		System.out.println("");
		rs.absolute(3); // ����° ���ڵ��� ���� ������
		System.out.print(rs.getString(1)+"\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.print(rs.getString(3)+"\t");
		System.out.print(rs.getString(4)+"\t");
		System.out.println(rs.getInt(5));
		System.out.println("");
		rs.previous();	// ���� ���ڵ��� ���� ������
		System.out.print(rs.getString(1)+"\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.print(rs.getString(3)+"\t");
		System.out.print(rs.getString(4)+"\t");
		System.out.println(rs.getInt(5));
		System.out.println("");
		rs.last(); 	// ������ ���ڵ��� ���� ������
		System.out.print(rs.getString(1)+"\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.print(rs.getString(3)+"\t");
		System.out.print(rs.getString(4)+"\t");
		System.out.println(rs.getInt(5));
		System.out.println("");	
		
		rs.last();	// ������ ���ڵ��� ���� ������
		int rows = rs.getRow();	// ���ڵ� ������ ����
		System.out.println(rows);
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
}
