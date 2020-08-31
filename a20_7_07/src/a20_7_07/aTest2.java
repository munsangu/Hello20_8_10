package a20_7_07;
public class aTest2 
{	
	public static void main(String[] args) 
	{
		double num[]= {90.5, 88.5, 60,75.0,80.5};
		double sum=0;
		int len = num.length;
		for(int i=0;i<len;i++) 
		{
			System.out.println((i+1)+"¹øÂ° num["+i+"] = "+ num[i]);
			sum=sum+num[i];
		}System.out.println("ÃÑ ÇÕ = "+sum);
		 System.out.println("Æò±Õ = "+(sum/len));
	}
}
