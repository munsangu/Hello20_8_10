package a20_6_29;

import java.util.Scanner;

// 90�� �̻��̸� "A" 80���̻��̸� "B" ..... C,D,F
public class ch04ex02 {
	public static void main(String[] args) {
		int jumsu;
		Scanner sc=new Scanner(System.in);
		jumsu=sc.nextInt();
		if(jumsu>=90) System.out.println("A����");
			else if(jumsu>=80) System.out.println("B����");
				else if(jumsu>=70) System.out.println("C����");
					else if(jumsu>=60) System.out.println("D����");
		else
			System.out.println("F����");
		System.out.println("��");
	}

}
