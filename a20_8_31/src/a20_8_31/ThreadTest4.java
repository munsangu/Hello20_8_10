package a20_8_31;

public class ThreadTest4 
{
	public static void main(String[] args) 
	{
		Thread k = new Thread(new Runnable() 
		{
			int num=0;
			public void run() 
			{
				while(true) 
				{
					System.out.println(num++);
					try 
					{
						Thread.sleep(1000);         // 1000ms -> 1초 (1초단위로 쉬어줌)
					} 
					catch (Exception e) 
					{
						e.printStackTrace();
					} 
				}
			}
		});
		k.start();
		
		
	}
}
