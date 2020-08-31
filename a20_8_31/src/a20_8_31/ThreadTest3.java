package a20_8_31;

class mythread3 implements Runnable
{
	int num = 0;
	String name;
	public mythread3(String name) 
	{
		this.name = name;
	}
	public void run() 
	{
		while(true) 
		{
			System.out.println(name+" = "+num);
			num++;
			try 
			{
				Thread.sleep(1000);         // 1000ms -> 1�� (1�ʴ����� ������)
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			} 
		}
	}
}

public class ThreadTest3 
{
	public static void main(String[] args) 
	{
		mythread3 k = new mythread3("KIM");
		Thread x = new Thread(k);			// �θ� Ŭ���� Ȱ��
		x.start(); 
		mythread3 k2 = new mythread3("LEE");
		Thread x2 = new Thread(k2);			// �θ� Ŭ���� Ȱ��
		x2.start();  
		mythread3 k3 = new mythread3("PARK");
		Thread x3 = new Thread(k3);			// �θ� Ŭ���� Ȱ��
		x3.start();  
	}
}
