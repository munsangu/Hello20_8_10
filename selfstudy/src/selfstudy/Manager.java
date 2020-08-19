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
		System.out.println("이름: "+name+", 부서: "+department+", 연봉: "+salary);
	}
}
