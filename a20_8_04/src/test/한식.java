package test;
public class 한식 
{
	private int 마늘;
	private int 김치;
	private int 계란;
	private int 그릇;
	public 한식() {}
	void 비빔밥(int 밥) 
	{
		그릇 = 밥 + 마늘 + 김치 + 계란;
	}
	void show() 
	{
		System.out.println(그릇);
	}
	public static 한식 getInstance() 
	{
		return new 한식();
	}
	public static void main(String[] args)
	{
		일식 ilsik = new 일식(100,50);
		중식 jungsik = new 중식(50,30);
		한식 hansik = 한식.getInstance();	

		ilsik.회덮밥();
		ilsik.show();
		System.out.println("");
		jungsik.잡채();
		jungsik.show();
		System.out.println("");
		hansik.비빔밥(50);
		hansik.show();
		
		일식 kim = new 일식(new 한식());
		일식 lee = new 일식(new 중식());
		
	}
}
