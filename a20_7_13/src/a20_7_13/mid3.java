package a20_7_13;
import java.util.Scanner;
public class mid3 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		int k;
		int s[]=new int[100];
		while(n>=2) 
		{
			c=0;
			do 
			{
				k=2;
				do 
				{
					k++;
				}while(n%k!=0);
				c++;
				s[c]=k;
				n=n/k;
			}while(n!=1);
			if(c!=1) break;
			System.out.println("¼Ò¼ö");
		}
		for(int y=1;y<c;y++) 
		{
			System.out.println(s[y]+",");
		}
	}
}


