package selfstudy;

public class SubClass extends SuperClass 
{
	public void print() 
	{
		System.out.println("���� Ŭ����");
	}
	public void callSuperThis() 
	{
		super.print();
		this.print();
	}
}
