package a20_6_26;

public class ch03ex01 {
	public static void main(String[] args) {
		int a=5, b=3;
		System.out.println(a/(double)b); // �� ���� �� �� ������ ��� ��(double); ������ �Ǽ�ȭ ; ��Ȯ�� ����
		System.out.println(a%b);
		System.out.println(a==b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a>b && b==3);
		System.out.println(a<b && b==3);
		System.out.println(a>b || b==3);
		System.out.println(a<b || b==3); // '&&' = and '||' = or '!' = not
		System.out.println(!(5>3));
		
	}

}
