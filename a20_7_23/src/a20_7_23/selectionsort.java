package a20_7_23;
import java.util.Scanner;
public class selectionsort 
{
	public static void main(String[] args) 
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
			for(j=i+1;j<5;j++) 
			{
				if(a[i]>a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
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
