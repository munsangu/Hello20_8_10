package a20_8_28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IOTest1 
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fos = new FileOutputStream("sample.txt");
		for(int i ='A';i<='z';i++) 
		{
		fos.write(i);			// write()란 byte 단위 출력
		}
		fos.close();		
	}
}
