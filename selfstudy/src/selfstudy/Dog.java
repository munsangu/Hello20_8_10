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
		System.out.println(dog_name+"가 아무도 물지 않았습니다.");
	}
	public void bite(String name) 
	{
		System.out.println(dog_name+"가 "+name+"을 물었습니다.");
	}
	public void bark() 
	{
		System.out.println("멍멍");
	}
}
