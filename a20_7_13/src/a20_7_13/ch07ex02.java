package a20_7_13;
import java.util.Scanner;
public class ch07ex02 
{
	public static void main(String[] args) 
	{
		Rank kim = new Rank();
		Scanner sc=new Scanner(System.in);
		System.out.println("국어, 수학, 영어의 성적을 입력하시오");
		kim.kor=sc.nextInt();
		kim.mat=sc.nextInt();
		kim.eng=sc.nextInt();
		kim.hap();
		kim.average();
		kim.rank();
		kim.show();
	}
}
