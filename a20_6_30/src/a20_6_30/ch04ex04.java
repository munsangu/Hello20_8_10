package a20_6_30;

public class ch04ex04 {
	public static void main(String[] args) {
		int a=10, b=5,c=0 ;
		char op='+';							//���ڴ� ������ ���Ǳ� ������<�ƽ�Ű�ڵ�> switch - case���� ��밡��
		switch(op) {
			case'+': System.out.println(c=a+b); break;
			case'-': System.out.println(c=a-b); break;
			case'*': System.out.println(c=a*b); break;
			case'/': System.out.println(c=a/b); break;
			default: 
				System.out.println("�߸��� ��ȣ");
			 break;
		}
	}

}
