package a20_8_28;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

//(기본자료형태; int, double, char)로 파일 저장
// 콜솔로 입력데이터 그대로
//  저장
public class IOTest6 
{
	public static void main(String[] args) throws Exception 
	{
		File file = new File("iotest6.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하시오.");
		String name = sc.next();
		System.out.println("국어 점수를 입력하시오.");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하시오.");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하시오.");
		int mat = sc.nextInt();
		
		dos.writeUTF(name);
		dos.writeInt(kor);
		dos.writeInt(eng);
		dos.writeInt(mat);
		dos.close();
	}
}
