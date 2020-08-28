package a20_8_28;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.InputStreamReader;

public class IOTest4 
{

	public static void main(String[] args) throws Exception 
	{
		InputStreamReader  isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// byte[Syetem.in] -> 문자로 바꿈 -> 버퍼통(문자열을 담기 위함)
		
		String name = br.readLine();
		String id = br.readLine();
		String pwd = br.readLine();
		String age = br.readLine();
		String tel = br.readLine();
//		System.out.print(name+"\t"+id+"\t"+pwd+"\t"+age+"\t"+tel);
		File file = new File("iotest4.txt");
		FileWriter fw = new FileWriter(file);
		fw.write(name);
		fw.write(id);
		fw.write(pwd);
		fw.write(age);
		fw.write(tel);
		fw.close();
		
	}
}
