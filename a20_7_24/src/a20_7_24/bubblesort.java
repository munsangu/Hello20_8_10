package a20_7_24;
import java.util.Scanner;

public class bubblesort 
{
	public static void main(String[] args) 
	{
		{
			int a[]=new int[5];
			int i,j,temp;
			Scanner sc = new Scanner(System.in);
			System.out.println("정렬할 숫자들을 입력하시오.");
			for(i=0;i<5;i++) 
			{
				a[i]=sc.nextInt();
			}
			for(i=0;i<4;i++) 
			{
				for(j=0;j<4-i;j++) 
				{
				
					if(a[j]>a[j+1]) 
					{
						temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
					else;
				}
			}
			System.out.print("결과는:");
			for(i=0;i<5;i++) 
			{
				System.out.print(a[i]+" ");
			}
		}
	}

}
