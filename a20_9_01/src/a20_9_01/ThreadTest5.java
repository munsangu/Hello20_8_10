package a20_9_01;

import java.awt.EventQueue;

class mythread5 extends Thread
{
	int num = 0;
	String name;
	public mythread5() {}
	public mythread5(String name) 
	{
		this.name=name;
	}
	public void run() 
	{
		while(true) 
		{
			System.out.println(name+":"+num++);
			try 
			{
				sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest5 
{
	public static void main(String[] args) 
	{
		mythread5 my5 = new mythread5("KIM");
		mythread5 my6 = new mythread5("PARK");
		EventQueue.invokeLater(my5);
		EventQueue.invokeLater(my6);				// 프로그램 하나에 한 번만 사용가능하므로 의미가 없는 코드
		my5.start();
		my6.start();
	}
}
