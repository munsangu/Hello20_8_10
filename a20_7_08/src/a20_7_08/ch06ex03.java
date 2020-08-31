package a20_7_08;
public class ch06ex03 
{
	public static void main(String[] args) 
	{
		int a[]= {90,88,77,67,89,54,99,30};
		int len=a.length;
		int i, sum=0;
		double avg=0;
		for(i=0;i<len;i++) 
		{
			sum=sum+a[i];
			avg=(double)sum/len;
		}System.out.println("ÇÕ°è = "+sum);
		 System.out.println("Æò±Õ = "+avg);
	}
}