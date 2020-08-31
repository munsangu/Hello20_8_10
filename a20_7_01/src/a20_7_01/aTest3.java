package a20_7_01;

public class aTest3 {
	public static void main(String[] args) {
		int i, j, k, n=0, sum=0;
		for(i=1;i<=10;i=i+1)   // 'for(초기값;조건식;증감여부)' -> 반복문
		{
			System.out.println(i);
		}
		System.out.println("=========================================");
		for(j=10;j>=1;j=j-1) 
		{
			System.out.println(j);
		}
		System.out.println("=========================================");
		for(k=1;k<=100;k=k+1) 
		{
			System.out.println(k);
			sum=sum+k;   				// 합계 sum+=k; (축약형)
		}
		System.out.println( "합계 = "+sum);
	}
	}	
	