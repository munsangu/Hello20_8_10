package a20_6_30;

import java.util.Scanner;

// 1 - �Ͽ��� 2 - ������ ..... 6 - �ݿ���  7 - �����
// 1~7������ ���� �ܿ� �Է� �� ���� ���
public class ch04ex02 {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		switch (num) {						// switch()-> ��ȣ ���� �ݵ�� ���� ���� �Ǵ� ������
			case 1:							// case �ڿ��� �ݵ�� ���� ��
				System.out.println("�Ͽ���");
				break;
			case 2:
				System.out.println("������");
				break;
			case 3:
				System.out.println("ȭ����");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("�����");
				break;
			case 6:
				System.out.println("�ݿ���");
				break;
			case 7:
				System.out.println("�����");
				break;
			default:
				System.out.println("�Է� ����");
				break;
		}
	}

}
