package a20_7_29;
public class wrapperTest3 
// main �Ķ��Ÿ�� 10�� 20�� �Է¹޾Ƽ� ���
{
 public static void main(String[] args) 
 {
	 String num1 = args[0];
	 String op = args[1];
	 String num2 = args[2];
	 // �� ���� ��, ��, ��, ���� ���� ���ϱ�
	 char ch;
	 int n1, n2, c=0;
	 n1 = Integer.valueOf(num1);
	 n2 = Integer.valueOf(num2);
	 for(int i=0;i<4;i++) 
	 {
	 ch = op.charAt(i);
	 switch(ch) 
	  {
	 case '+':
		 c = n1 + n2;
		 break;
	 case '-':
		 c = n1 - n2;
		 break;
	 case '*':
		 c = n1 * n2;
		 break;
	 case '/':
		 c = n1/n2;
		 break;
	 default: 
		 break;
	  }System.out.println(c);
	 }
     }
 }

