package selfstudy;
public class SwitchTest 
{
	public static void main(String[] args) 
	{
		int num = 2;
		
		 switch(num) 
		 {
		 case 1:
			 System.out.println("����� 1 �Դϴ�.");
		 case 2:
		 case 3:
			 System.out.println("����� 2 �Ǵ� 3 �Դϴ�.");
			 break;
	     default:
	    	 System.out.println("����� 1, 2, 3 �� �ƴմϴ�.");
	    	 break;			 
		 }
	}
}
