package a20_6_29;

import java.util.Scanner;

// 90점 이상이면 "A" 80점이상이면 "B" ..... C,D,F
public class ch04ex02 {
	public static void main(String[] args) {
		int jumsu;
		Scanner sc=new Scanner(System.in);
		jumsu=sc.nextInt();
		if(jumsu>=90) System.out.println("A학점");
			else if(jumsu>=80) System.out.println("B학점");
				else if(jumsu>=70) System.out.println("C학점");
					else if(jumsu>=60) System.out.println("D학점");
		else
			System.out.println("F학점");
		System.out.println("끝");
	}

}
