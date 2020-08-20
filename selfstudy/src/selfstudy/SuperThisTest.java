package selfstudy;
public class SuperThisTest 
{
	public static void main(String[] args) 
	{
		SuperClass superclass = new SuperClass();
		superclass.print();
		
		SubClass subclass = new SubClass();
		
		System.out.println("SubClass의 print() 메소드: ");
		subclass.print();
		
		System.out.println("SubClass에서 super, this로 호출: ");
		subclass.callSuperThis();
	}
}
