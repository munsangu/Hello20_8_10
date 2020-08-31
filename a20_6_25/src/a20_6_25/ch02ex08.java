package a20_6_25;

public class ch02ex08 {
	public static void main(String[] args) {
		byte b1 = -128;
		// byte b2 = 128;
		// Type mismatch: cannot convert from int to byte
		System.out.println(b1);
		
		int i1 = 15;
		int i2 = 0b1111;
		int i3 = 017;
		int i4 = 0xf;
		System.out.println(i1+","+i2+","+i3+","+i4);
		
		int i5 = 1_000_000_000;
		System.out.println(i5);
		
		//long l1 = 10000000000;
		// the literal 10000000000 of type int is out of range
		long l2 = 1000000000L;
		// int a=1234 -> ���� int (4 byte) ; �ڿ� L ���̸� �뷮 ����
		// long b=1234L -> ���� long(8 byte) ; L �����ص� �� -> ������ L�� ���� �ʴ´�.
		System.out.println(l2);
	}

}
