package a20_9_21;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class IpText 
{
	public static void main(String[] args) 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		InetAddress add[],myadd, add1;
		try {
		String url = br.readLine();
//		System.out.println(url);
		add1=InetAddress.getByName(url);
		add=InetAddress.getAllByName(url);
		myadd = InetAddress.getLocalHost();
		System.out.println("add1 = "+add1);
		for(Object xx : add) 
		{
			System.out.println("add = "+xx);
		}
		System.out.println("My IP = "+myadd);
//		for(int i =0; i<add.length;i++) 
//		{
//			System.out.println("add = "+add[i]);
//		}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
