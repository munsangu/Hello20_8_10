package a20_9_07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_Insert 
{
	public static void main(String[] args) throws Exception 
	{
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String password = "123456";
		String sql = "insert into member(code, name, id, pwd, age) values(?,?,?,?,?) ";
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		try
		{
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, password);
		pstmt = con.prepareStatement(sql);
		System.out.println("CODE 입력");
		pstmt.setString(1, sc.next());
		System.out.println("NAME 입력");
		pstmt.setString(2, sc.next());
		System.out.println("ID 입력");
		pstmt.setString(3, sc.next());
		System.out.println("PWD 입력");
		pstmt.setString(4, sc.next());
		System.out.println("AGE 입력");
		pstmt.setInt(5, sc.nextInt());
		int res = pstmt.executeUpdate();
		if(res==1)System.out.println("성공");
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		try {
		pstmt.close();
		con.close();}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
}
