package a20_6_30;
import java.util.Scanner;
// �̸�(name), ����(kor), ����(mat), ����(eng)�Է¹޾Ƽ� ����(tot)�� ���(avg)���ϱ�
//����� 60�� �̻��̰� ��� ������ 40���̻��̸� "�հ�" �ƴϸ� "���հ�"
//����� 60�� �̸��̰ų� �Ѱ����̶� 40�� �̸��̸� "���հ�" �ƴϸ� "�հ�"
public class ch04ex01 {
	public static void main(String[] args) {
		String name;
		int kor, mat, eng, tot;
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		name=sc.next();
		
		System.out.println("���� ���� ���� ������ �Է��ϼ���");
		kor=sc.nextInt();
		mat=sc.nextInt();
		eng=sc.nextInt();
		
		tot=kor+mat+eng;
		avg=tot/3.;    // avg = tot/3 -> ��Ȯ���� �������Ƿ� �Ǽ��� �ٲ�� �� -> double ���� 
		if(avg>=60&&kor>=40&&mat>=40&&eng>=40)System.out.println("�հ�");
		else System.out.println("���հ�");
		System.out.println("��� �Ϸ�");
	}

}
