package a20_7_03;
//*******
//******
//*****
//****
//***
//**
//**
public class ch05Test2 
{
	public static void main(String[] args)
	{
		int a,b,c;
		for(a=7;a>=1;a--) 
		{   
			if(a<=2) c=2;
			else c=a;
			for(b=1;b<=c;b++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
