package selfstudy;
public class StaticTest 
{
	public static void main(String[] args) 
	{
		MyClass[] mc = new MyClass[10];
		
		for(int i=0;i<10;i++) 
		{
			mc[i]=new MyClass();
			System.out.println("MyClass InstanceÀÇ ¼ö"+mc[0].getObjectNum()+"°³");
		}
		System.out.println(MyClass.getObjectNum());
	}
}
class MyClass
{
	static	int object_num=0;
	
	public MyClass() 
	{
		object_num++;
	}
	public static int getObjectNum() 
	{
		return object_num;
	}
}
