package selfstudy;
public class SuperThisTest 
{
	public static void main(String[] args) 
	{
		SuperClass superclass = new SuperClass();
		superclass.print();
		
		SubClass subclass = new SubClass();
		
		System.out.println("SubClass�� print() �޼ҵ�: ");
		subclass.print();
		
		System.out.println("SubClass���� super, this�� ȣ��: ");
		subclass.callSuperThis();
	}
}
