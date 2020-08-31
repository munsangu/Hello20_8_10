package a20_8_31;

class mythread extends Thread
{
	int num = 0;
	String name;
	public mythread() {}
	public mythread(String name) 
	{
		this.name=name;
	}
	public void run() 
	{
		while(true) 
		{
			System.out.println(name+"="+num);
			num++;
			try 
			{
				sleep(1000);          // 1초동안 쉬는 시간
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}			
		}		
	}
}

public class ThreadTest 
{
	public static void main(String[] args) 
	{
		mythread t = new mythread("김");
		t.start();
		mythread t2 = new mythread("이");
		t2.start();
		mythread t3 = new mythread("박");
		t3.start();
	}
}
