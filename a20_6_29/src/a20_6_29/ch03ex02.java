package a20_6_29;

public class ch03ex02 {
	public static void main(String[] args) {
		int a=10,b=3;           //(4byte)  ������(int, byte, short, long)
		double c;          //(8byte)  �Ǽ���(float)
		char x;            //(2byte)
		String name;
		boolean t;         //(1byte)
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a/(double)b);
		System.out.println(a%b);
		a++;               // a=a+1, a++, ++a
		b--;			   // b=b-1, b--, --b
		a=a+b;             // (�����) a+=b
		System.out.println(a+","+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+","+b);
		System.out.println(a);
		System.out.println(b);
	}

}
