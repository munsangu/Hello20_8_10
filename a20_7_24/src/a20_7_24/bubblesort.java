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
			System.out.println("������ ���ڵ��� �Է��Ͻÿ�.");
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
			System.out.print("�����:");
			for(i=0;i<5;i++) 
			{
				System.out.print(a[i]+" ");
			}
		}
	}

}
