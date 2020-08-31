package a20_7_13;
import java.util.Scanner;
public class ch07ex03 
{
	public static void main(String[] args) 
	{
		Circle lee = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하시오");
		lee.r=sc.nextInt();
		lee.result();
		lee.show();
	}
}
