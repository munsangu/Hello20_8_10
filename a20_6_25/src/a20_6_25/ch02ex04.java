package a20_6_25;

public class ch02ex04 {
	public static void main(String[] args) {
		char a,b,c,d;
		a = 'A';  // �ƽ�Ű�ڵ�(�̱�ǥ���ڵ�) A(65), B(66), ...
		b = 'a';  // �ƽ�Ű�ڵ� a(97)
		c = '1';  // �ƽ�Ű�ڵ� 1(45)
		d = '��';
		System.out.println(a+""+b+""+c);
		System.out.println(d);
		System.out.println((int) d);
		System.out.println((int) 'a');
		System.out.println((int) 'A');
		System.out.println((int) '��');
	}

}
