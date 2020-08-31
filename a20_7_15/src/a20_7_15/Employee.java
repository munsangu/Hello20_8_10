package a20_7_15;
public class Employee
{
	private String name;
	private int sal;
	 	public Employee() 
	 	{
	 		this.name=null;
	 		this.sal=0;
	 	}
		public void show() 
		{
			System.out.println("¿Ã∏ß = "+name+","+"ø¨∫¿ = "+sal);
		}
		public void setName(String name) 
		{
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public int getSal() {
			return sal;
		}
		public void setSal(int sal) 
		{
			this.sal = sal;
		}
}
