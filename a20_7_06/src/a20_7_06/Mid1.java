package a20_7_06;
import java.util.Scanner;

public class Mid1 
{
	public static void main(String[] args) 
	{
	/*	int A,J=2;
		Scanner sc= new Scanner(System.in);
		System.out.println("�Ҽ� �Ǻ��� ���� �Է��Ͻÿ�.");
		A=sc.nextInt();
	       while(A%J != 0)
	        {
	            J = J+1;           
	        }
	        	if(A==J)
	        	{          
	        		System.out.println("�Ҽ�");
	        	}
		        else
		        {
		        	System.out.println("�Ҽ� �ƴ�");           
		        }*/
		int A;
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ҽ� �Ǻ��� ���� �Է��Ͻÿ�.");
		A=sc.nextInt();
		int J;
		for(J=2;(A%J)!=0;J++){}
		if(A==J) System.out.println("�Ҽ�");
		else System.out.println("�Ҽ� �ƴ�");
		
		
	}
}


