package selfstudy;
public class Dog 
{
	String dog_name;
	int dog_age;
	
	public Dog(String name, int age) 
	{
		dog_name = name;
		dog_age = age;
	}
	public void bite() 
	{
		System.out.println(dog_name+"�� �ƹ��� ���� �ʾҽ��ϴ�.");
	}
	public void bite(String name) 
	{
		System.out.println(dog_name+"�� "+name+"�� �������ϴ�.");
	}
	public void bark() 
	{
		System.out.println("�۸�");
	}
}
