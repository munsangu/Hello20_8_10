package a20_8_28;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

//(�⺻�ڷ�����; int, double, char)�� ���� ����
// �ݼַ� �Էµ����� �״��
//  ����
public class IOTest6 
{
	public static void main(String[] args) throws Exception 
	{
		File file = new File("iotest6.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��Ͻÿ�.");
		String name = sc.next();
		System.out.println("���� ������ �Է��Ͻÿ�.");
		int kor = sc.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�.");
		int eng = sc.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�.");
		int mat = sc.nextInt();
		
		dos.writeUTF(name);
		dos.writeInt(kor);
		dos.writeInt(eng);
		dos.writeInt(mat);
		dos.close();
	}
}
