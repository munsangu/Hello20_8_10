package selfstudy;

public class SubClass extends SuperClass 
{
	public void print() 
	{
		System.out.println("서브 클래스");
	}
	public void callSuperThis() 
	{
		super.print();
		this.print();
	}
}
