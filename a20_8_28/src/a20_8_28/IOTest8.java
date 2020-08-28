package a20_8_28;


import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

// 콘솔로 입력한 값을 Object형의 iotest8.txt로 생성
public class IOTest8 
{
	public static void main(String[] args) throws Exception 
	{
		File file = new File("iotest8.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream ob = new ObjectOutputStream(fos);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하시오.");
		String name = sc.next();
		System.out.println("국어 점수를 입력하시오.");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하시오.");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하시오.");
		int mat = sc.nextInt();
		
		ob.writeObject(name);
		ob.writeObject(kor);
		ob.writeObject(eng);
		ob.writeObject(mat);
		ob.close();
	}
}
