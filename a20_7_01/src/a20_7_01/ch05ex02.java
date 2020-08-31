package a20_7_01;
import java.util.Scanner;

//5회 점수(jumsu)를 입력 받은 후 총점과 갯수를 받아서 평균 구하기
public class ch05ex02 
{
	public static void main(String[] args) 
	{
		int i, jumsu, cn=0, sum=0;
		double avg;
		Scanner sc=new Scanner(System.in);
		for(i=1;i<=5;i++) 
		{
			jumsu=sc.nextInt();
			sum=sum+jumsu;
			cn=cn+1;
		}
		avg=(double) sum/cn;
		System.out.println("총점: "+sum+"점");
		System.out.println("평균: "+avg+"점");
		System.out.println("갯수: "+cn+"개");
	}
}
