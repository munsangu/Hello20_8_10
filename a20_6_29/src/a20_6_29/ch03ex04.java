package a20_6_29;

import java.util.Scanner;

public class ch03ex04 {
	public static void main(String[] args) {
		int a,b,c, max;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		// (a>b)? "��": "�ƴϿ�";
		//���׿����� ((����)?"���� �� ��°�":"������ �� ��°�")
		System.out.println((a>b)?"��":"�ƴϿ�");
		max = (a>b)?a:b;
		max = (max>c)?max:c;
		System.out.println("�ִ밪="+max);
		
	}

}
