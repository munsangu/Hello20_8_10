package a20_9_07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBC_Delete 
{
	public static void main(String[] args) 
	{
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String password = "123456";
		String sql = "delete from member where id = ? and pwd = ?";
		Scanner sc = new Scanner(System.in);
		try 
		{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user,password);
			PreparedStatement pstmt = con.prepareStatement(sql);
			System.out.println("지우실 정보의 ID를 입력하시오.");
			pstmt.setString(1, sc.next());
			System.out.println("지우실 정보의 PWD를 입력하시오.");
			pstmt.setString(2, sc.next());
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
