package a20_6_29;

import java.util.Scanner;

public class ch03ex04 {
	public static void main(String[] args) {
		int a,b,c, max;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		// (a>b)? "예": "아니요";
		//삼항연산자 ((조건)?"참일 때 출력값":"거짓일 때 출력값")
		System.out.println((a>b)?"예":"아니요");
		max = (a>b)?a:b;
		max = (max>c)?max:c;
		System.out.println("최대값="+max);
		
	}

}
