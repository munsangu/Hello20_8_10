package a20_8_05;
class A
{
	
}
class B extends A
{
	
}
public class C 
{
	public static C getC() 
	{
		return new C();
	}
	public static void main(String[] args) 
	{
	A a = new A();
	B b = new B();
	C c = new C();  // �ڽ��� Ŭ������ ��üȭ
	C c2 = getC();  // 
	}
}
