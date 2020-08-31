package a20_7_29;
public class wrapperTest3 
// main 파라메타로 10과 20을 입력받아서 출력
{
 public static void main(String[] args) 
 {
	 String num1 = args[0];
	 String op = args[1];
	 String num2 = args[2];
	 // 두 수의 합, 차, 곱, 승을 각각 구하기
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

