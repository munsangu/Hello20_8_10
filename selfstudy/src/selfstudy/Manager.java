package selfstudy;

public class Manager extends Employee 
{
	String department;
	
	public Manager(String n, int s, String d) 
	{
		super(n,s);
		department = d;
	}
	public void getInformation() 
	{
		System.out.println("�̸�: "+name+", �μ�: "+department+", ����: "+salary);
	}
}
