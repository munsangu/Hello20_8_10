package a20_7_10;
import java.util.Scanner;
public class a문상우 
{
	public static void add(int a, int b) 
	{
		int sum=0;
		sum=a+b;
		System.out.println(a+" 와(과) "+b+" 의 합 = "+sum);
	}
	public static void sign(int a) 
	{
		int res=0;
		if(a>0) res=1;
		else if(a<0) res=-1;
		System.out.println(res);
	}
	public static void ads(int a) 
	{
		int res2=0;
		if(a<0) res2=-a;
		else res2=a;
		System.out.println(res2);	
	}
	public static void prime(int a) 
	{
		int res3=0;
		int J=0;
		for(J=2;(a%J)!=0;J++){}
		if(a==J) res3=1;
		else res3=-1;
		System.out.println(res3);
	}
	public static void operator(int a, char op, int b) 
	{
		double res4=0;
		switch(op) 
		{
		case '+':
			res4 = a+b;
			break;
		case '-':
			res4 = a-b;
			break;
		case '*':
			res4 = a*b;
		case '/':
			res4 = a/b;
			break;
		}System.out.println(res4);
	}
	public static void hak(int a, int b, int c) 
	{
		double res5=0;
		res5= (double) (a+b+c)/3;
		if(res5>=90)System.out.println("A");
		else if(res5>=80)System.out.println("B");
		else if(res5>=70)System.out.println("C");
		else System.out.println("F");
	}
	public static void primes(int a) 
	{
		int res6[]=new int[a];
		int cnt=0;
		System.out.print(a+"의 약수: ");
		for(int i=1;i<=a;i++) 
		{
			if(a%i==0) 
			{res6[cnt]=i;
			cnt++;}
		}
		for(int i=0;i<cnt;i++) 
		{
			System.out.print(res6[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int x,y;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하시오");
		x=sc.nextInt();
		y=sc.nextInt();
		add(x,y);
		System.out.println("====================================");
		sign(-10);
		sign(0);
		sign(10);
		System.out.println("====================================");
		ads(-10);
		ads(10);
		ads(0);
		System.out.println("====================================");
		prime(5);
		prime(6);
		System.out.println("====================================");
		operator(10,'+',20);
		operator(10,'-',20);
		operator(10,'*',20);
		operator(20,'/',10);
		System.out.println("====================================");
		hak(80,70,60);
		System.out.println("====================================");
		primes(10);
		primes(2);
	}
}
