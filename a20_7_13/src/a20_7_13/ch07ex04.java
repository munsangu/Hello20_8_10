package a20_7_13;
import java.util.Scanner;
public class ch07ex04 
{
	public static void main(String[] args) 
	{
		System.out.println("�簢���� ����, ������ ���̸� �Է��Ͻÿ�");
		�簢�� park = new �簢��();
		Scanner sc = new Scanner(System.in);
		System.out.print("���� = ");
		park.a=sc.nextInt();
		System.out.print("���� = ");
		park.b=sc.nextInt();
		park.����();
	}
}
