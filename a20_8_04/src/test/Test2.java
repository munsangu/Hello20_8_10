package test;

class A
{
public A() {}
public A(Object obj) {if(obj instanceof Test2) {Test2 kim =(Test2) obj;}}
}
class B
{
public B() {}
public B(Object obj) {if(obj instanceof Test2) {Test2 kim =(Test2) obj;}}
}
public class Test2 
{   public static Test2 getTest2() 
	{
		return new Test2();
	}
	public static void main(String[] args) 
	{
		B bki = new B(getTest2());
		A aki = new A(getTest2());
	}
}
