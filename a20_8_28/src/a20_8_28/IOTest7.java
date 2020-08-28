package a20_8_28;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
// iotest6.txt 읽어와서 화면에 출력
public class IOTest7 
{
	public static void main(String[] args) throws Exception 
	{
		File file = new File("iotest6.txt");
		FileInputStream fr = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fr);
		String name = dis.readUTF();		// 문자열 읽기(문자열만 읽을 수 있음)
		int kor = dis.readInt();			// 정수 읽기(정수만 읽을 수 있음)
		int eng = dis.readInt();
		int mat =dis.readInt();
		int tot = kor+eng+mat;
		System.out.println(name+"\t"+tot);
	}
}
