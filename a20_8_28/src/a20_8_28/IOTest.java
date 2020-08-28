package a20_8_28;

import java.io.File;
import java.util.Date;

public class IOTest 
{
	public static void main(String[] args) throws Exception
	{
		File file = new File("sample.txt");
		if(file.exists()) 
		{
			System.out.println(file.getPath());
			System.out.println(file.isFile());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length());
			System.out.println(file.lastModified());
			System.out.println(new Date(file.lastModified()));
		}
		else 
		{
			file.createNewFile();
			System.out.println("파일이 존재하지 않습니다.");
		}
	}
}
