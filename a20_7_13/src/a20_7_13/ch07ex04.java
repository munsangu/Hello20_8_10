package a20_7_13;
import java.util.Scanner;
public class ch07ex04 
{
	public static void main(String[] args) 
	{
		System.out.println("사각형의 가로, 세로의 길이를 입력하시오");
		사각형 park = new 사각형();
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 = ");
		park.a=sc.nextInt();
		System.out.print("세로 = ");
		park.b=sc.nextInt();
		park.넓이();
	}
}
