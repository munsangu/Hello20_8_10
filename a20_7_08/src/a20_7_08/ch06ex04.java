package a20_7_08;
public class ch06ex04 
{
	public static void main(String[] args) 
	{
		int a[][]=new int[5][3];
		int i,j;
		int cnt=0;
		for(i=0;i<5;i++) 
		{
			for(j=0;j<3;j++) 
			{
				cnt++;
			a[i][j]=cnt;
			}
		}
		for(i=0;i<5;i++) 
		{
			for(j=0;j<3;j++) 
			{
			System.out.print(a[i][j]+"\t");
			}System.out.println();
		}
	}
}
