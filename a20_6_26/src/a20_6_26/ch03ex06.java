package a20_6_26;

public class ch03ex06 {
	public static void main(String[] args) {
		int a=10,b=3;
		
//		System.out.println(a&&b);      // error (�������� -> t/f�� ����)
// 		System.out.println(a||b);      // error (�������� -> t/f�� ����) 
		System.out.println(a&b);       // (��Ʈ������ and->&) <2�������� 1=t, 0=f> �� �� ���̸� �� 
		System.out.println(a|b);       // (��Ʈ������ or ->|)  <2�������� 1=t, 0=f> �� �� �ϳ��� ���̿��� ��
		System.out.println(a>b&&b==3);
	}

}
