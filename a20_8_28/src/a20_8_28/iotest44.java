package a20_8_28;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class iotest44 
{

	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("이름을 입력하시오.");
		String name = br.readLine();
		System.out.println("아이디를 입력하시오.");
		String id = br.readLine();
		System.out.println("비밀번호를 입력하시오.");
		String pwd = br.readLine();
		System.out.println("나이를 입력하시오.");
		String age = br.readLine();
		System.out.println("전화번호를 입력하시오.");
		String tel = br.readLine();
		
		File file = new File("iotest44.txt");
		FileWriter fw = new FileWriter(file);
		fw.write(name+"/");
		fw.write(id+"/");
		fw.write(pwd+"/");
		fw.write(age+"/");
		fw.write(tel);
		fw.close();
	}
}
