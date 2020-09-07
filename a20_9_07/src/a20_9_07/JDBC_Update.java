package a20_9_07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBC_Update
{
	public static void main(String[] args) 
	{
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String password = "123456";
		String sql = "update member set pwd = ? where id =?";
		Scanner sc = new Scanner(System.in);
		try 
		{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user,password);
			PreparedStatement pstmt = con.prepareStatement(sql);
			System.out.println("바꾸고자할 비밀번호의 ID 입력");
			pstmt.setString(2, sc.next());
			System.out.println("바꿀 비밀번호 입력");
			pstmt.setString(1, sc.next());
			int res = pstmt.executeUpdate();
			if(res==1)System.out.println("성공");
			else System.out.println("실패");
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
}
