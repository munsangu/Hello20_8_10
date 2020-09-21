package a20_9_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientText 
{
	public static void main(String[] args) throws Exception
	{
		Socket socket = new Socket("127.0.0.1", 9000);
		
		//Input Stream
		BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		// Output Stream
		PrintWriter output = new PrintWriter(socket.getOutputStream());
		output.println("¼­¹ö");
		output.flush();
		
		String str = input.readLine();
		System.out.println(str);
	}
}
