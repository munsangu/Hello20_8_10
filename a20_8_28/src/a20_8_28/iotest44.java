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
		System.out.println("�̸��� �Է��Ͻÿ�.");
		String name = br.readLine();
		System.out.println("���̵� �Է��Ͻÿ�.");
		String id = br.readLine();
		System.out.println("��й�ȣ�� �Է��Ͻÿ�.");
		String pwd = br.readLine();
		System.out.println("���̸� �Է��Ͻÿ�.");
		String age = br.readLine();
		System.out.println("��ȭ��ȣ�� �Է��Ͻÿ�.");
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
