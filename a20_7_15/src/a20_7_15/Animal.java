package a20_7_15;
public class Animal 
{
	private String name;
	private int age;
		public void show() 
		{
			System.out.println("동물의 이름 = "+name+" , "+"동물의 나이 = "+age);
		}
	    public Animal() 
	    {
	    	this.name=null;
	    	this.age=0;
	    }
	    public Animal(String name) 
	    {
	    	this.name=name;
	    }
	    public Animal(String name, int age) 
	    {
	    	this.name=name;
	    	this.age=age;
	    }
		public void setName(String name) 
		{
			this.name = name;
		}
		public void setAge(int age) 
		{
			this.age = age;
		}
}
