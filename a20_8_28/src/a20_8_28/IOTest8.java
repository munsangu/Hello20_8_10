package a20_8_28;


import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

// �ַܼ� �Է��� ���� Object���� iotest8.txt�� ����
public class IOTest8 
{
	public static void main(String[] args) throws Exception 
	{
		File file = new File("iotest8.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream ob = new ObjectOutputStream(fos);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��Ͻÿ�.");
		String name = sc.next();
		System.out.println("���� ������ �Է��Ͻÿ�.");
		int kor = sc.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�.");
		int eng = sc.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�.");
		int mat = sc.nextInt();
		
		ob.writeObject(name);
		ob.writeObject(kor);
		ob.writeObject(eng);
		ob.writeObject(mat);
		ob.close();
	}
}
