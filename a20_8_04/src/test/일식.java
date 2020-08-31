package test;
public class 일식 
{
	protected int x,y;
	protected int 참치;
	protected int 간장;
	protected int 우럭;
	protected int 광어;
	protected int 그릇;
	public 일식() { }
	public 일식(int 우럭, int 간장) 
	{
		this.우럭=우럭;
		this.간장=간장;
	}
	public 일식(Object obj) 
	{
		if(obj instanceof 중식) 
		{중식 ch=(중식) obj; ch.잡채(); ch.짜장면();}
		else if(obj instanceof 한식) 
		{한식 han = (한식) obj; han.비빔밥(100);}
	}
	void 회덮밥() 
	{
		그릇 = 우럭+광어+간장;
	}
	void 초밥(int 밥) 
	{
		그릇 = 밥 +우럭+참치+간장;
	}
	void show() 
	{
		System.out.println(그릇);
	}
}
