package a20_6_30;
import java.util.Scanner;

// ������ ���� �Է¹޾Ƽ� �� ���� 3�� ����̸� "3�� ���" ��� �ƴϸ� "��"
public class atest01 {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int na = num-(num/3)*3;
		if(na==0)System.out.println("3�� ���");
		else
			System.out.println("��");
		
		
		// ������ ���ϱ�
		// na=10%3             ->  1
		// na=10-int(10/3)*3   ->  1 JAVE������ int��� ��������� �������(�ʱ⿡ ���� ������ �����Ƿ�)
		// na=10-10/3*3 	   ->  1
		
		// 100/6�� ������
		// na = 100-int(100/6)*6
	}

}
