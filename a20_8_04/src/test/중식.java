package test;
public class 중식 
{	
	protected int x,y;
	protected int 짜장;
	protected int 당면;
	protected int 버섯;
	protected int 돼지기름;
	protected int 그릇;
	public 중식() {}
	public 중식(int 짜장,int 돼지기름) 
	{
		this.짜장=짜장;
		this.돼지기름=돼지기름;
		
	}
	void 짜장면()
	{
		그릇 =  짜장+버섯+돼지기름;
	}
	void 잡채()
	{
		그릇 =  당면+버섯+돼지기름;
	}
	void show() 
	{
		System.out.println(그릇);
	}
}
