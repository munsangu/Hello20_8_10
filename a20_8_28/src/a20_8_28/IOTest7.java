package a20_8_28;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
// iotest6.txt �о�ͼ� ȭ�鿡 ���
public class IOTest7 
{
	public static void main(String[] args) throws Exception 
	{
		File file = new File("iotest6.txt");
		FileInputStream fr = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fr);
		String name = dis.readUTF();		// ���ڿ� �б�(���ڿ��� ���� �� ����)
		int kor = dis.readInt();			// ���� �б�(������ ���� �� ����)
		int eng = dis.readInt();
		int mat =dis.readInt();
		int tot = kor+eng+mat;
		System.out.println(name+"\t"+tot);
	}
}
