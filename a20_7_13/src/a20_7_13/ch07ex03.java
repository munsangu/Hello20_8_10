package a20_7_13;
import java.util.Scanner;
public class ch07ex03 
{
	public static void main(String[] args) 
	{
		Circle lee = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է��Ͻÿ�");
		lee.r=sc.nextInt();
		lee.result();
		lee.show();
	}
}
