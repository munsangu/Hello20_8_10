package a20_8_28;
//Object���� iotest8.txt�� ���
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class IOTest9 
{
	public static void main(String[] args) throws Exception 
	{
		File file = new File("iotest8.txt");
		FileInputStream fr = new FileInputStream(file);
		ObjectInputStream dis = new ObjectInputStream(fr);
		System.out.println(dis.readObject());
		System.out.println(dis.readObject());
		System.out.println(dis.readObject());
		System.out.println(dis.readObject());
		dis.close();
	}
}
