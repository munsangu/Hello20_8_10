package selfstudy;
public class Animal 
{
	String name;
	int age;
	
	public Animal() 
	{
		this("����",0);
	}
	
	public Animal(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}
	public void print() 
	{
		System.out.println("�̸� = "+name);
		System.out.println("���� = "+age+"��");
	}
}
