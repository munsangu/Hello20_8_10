package selfstudy;

public class Snoopy extends Dog 
{
	public Snoopy() 
	{
		super("������",3);
	}
	
	public void bite(String name, int age) 
	{
		System.out.println(dog_name+"�� �� "+name+"�� "+age+"�� �Դϴ�.(�޼ҵ� �����ε�)");
	}
	public void bark() 
	{
		System.out.println("�ȳ��ϼ���. "+dog_name+"�Դϴ�.(�޼ҵ� �������̵�)");
	}
}
