package a20_7_10;
public class aTest1 
{
	public static void sum(int a,int b) 
	{
		int i;
		int sum=0;
		for(i=a;i<b+1;i++) 
		{
			sum=sum+i;
		}
		System.out.println(a+" ���� "+b+" ������ �հ� = "+ sum);
	}
	public static void main(String[] args) 
	{
		sum(10,50);
	}
}
