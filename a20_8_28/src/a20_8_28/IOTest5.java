package a20_8_28;

import java.io.File;
import java.io.FileReader;

public class IOTest5 
{
// iotest4.txt ���Ͽ��� �о����
	public static void main(String[] args) throws Exception
	{
		File file = new File("iotest4.txt");
		FileReader fr = new FileReader(file);
		int data;
		while((data = fr.read())!=-1) 
		{
			System.out.print((char)data);
		}
	}
}
