package a20_7_07;
import java.util.Scanner;

public class MID2_1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int A[]=new int[100];
		System.out.println("숫자를 입력하시오");
		int B=sc.nextInt();
		int C=0, D=0;
		while(C<=B) 
		{
			C++;
			if(B%C==0) 
			{
				A[D]=C;
				D++;
			}
		}for(int i=0;i<D;i++) 
		{
			System.out.println(A[i]);
		}
	}

}
