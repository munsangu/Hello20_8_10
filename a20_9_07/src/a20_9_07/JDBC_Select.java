package a20_9_07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBC_Select 
{
	public static void main(String[] args) throws Exception 
	{
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String password = "123456";
		String sql = "select * from member where id = ? and pwd = ? ";
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt = null;
		System.out.println("조회하실 ID를 입력");
		String id = sc.next();
		System.out.println("조회하실 비밀번호를 입력");
		String pwd = sc.next();
		try
		{
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, password);
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, pwd);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) 
			{
			System.out.print(rs.getString(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getString(3)+" ");
			System.out.print(rs.getString(4)+" ");
			System.out.println(rs.getInt(5)+" ");
			}		
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
    }
}
