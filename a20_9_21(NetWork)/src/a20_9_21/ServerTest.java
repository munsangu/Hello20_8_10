package a20_9_21;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest 
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(9000);
		Socket socket = ss.accept();
		
		//Input Stream
		BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		// Output Stream
		PrintWriter output = new PrintWriter(socket.getOutputStream());
		
		String str = input.readLine();
		System.out.println(str);
		
		output.println("나는 서버다");
		output.flush();
		
		socket.close();
		ss.close();
		
	}
}
