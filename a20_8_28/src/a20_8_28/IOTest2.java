package a20_8_28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IOTest2 
{

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("sample.txt");
		int data;
		while((data=fis.read())!=-1) 
		{
			System.out.print((char)data);
		}
		fis.close();
	}
}
