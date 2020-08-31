package a20_6_29;

import java.util.Scanner;

// 1개의 숫자를 입력 받아서 양수이면 "양수" 음수이면 "음수" o 이면"o"으로 출력
public class ch04ex03 {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num>0) System.out.println("양수");
			else if(num==0) System.out.println("0");
		else System.out.println("음수");
		System.out.println("끝");
	}

}
