package a20_6_30;

import java.util.Scanner;

// 1�� 3�� �Է��ϸ� "���ѹα� ����"
// 2�� 4�� �Է��ϸ� "���ѹα� ����"
public class ch04ex05 {
	public static void main(String[] args) {
	int num;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	switch (num) {
		case 1:
		case 3:
			System.out.println("���ѹα� ����");
			break;
		case 2:
		case 4:
			System.out.println("���ѹα� ����");
			break;
		default:
			System.out.println("��ȿ�� ���ڰ� �ƴմϴ�.");
			break;
		}
	}

}
