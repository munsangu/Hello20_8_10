package a20_8_28;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteTest 
{

	public static void main(String[] args) throws IOException 
	{
		int data;
		InputStream input=System.in;
		OutputStream output = System.out;
		while((data = System.in.read())!=-1)				// -1�� ������ �ǹ�	
		{				
		output.write((char)data);
		/*System.out.print(data); */							// �ƽ�Ű�ڵ�
		}
	}
}
