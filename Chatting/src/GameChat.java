import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class GameChat extends Applet implements ActionListener, Runnable 
{
	Socket mySocket = null;
	PrintWriter out = null;
	BufferedReader in = null;
	
	Thread clock;
	TextArea memo;
	TextField name;
	TextField input;
	Panel myPanel;
	
	public void init() 
	{
		try 
		{
			mySocket = new Socket("127.0.0.1",2587); // IP 포트번호를 통해 소캣 생성
			out = new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream(),"KSC5601"),true);	// 소캣을 통한 출력스트림 만듦
			in = new BufferedReader(new InputStreamReader(mySocket.getInputStream(),"KSC5601"),1024);   // 소캣을 통한 입력스트림 만듦
		}
		catch(UnknownHostException e) 
		{
			System.out.println(e.toString());
		}
		catch(IOException e) 
		{
			System.out.println(e.toString());
		}
	
	
	//GUI
	setLayout(new BorderLayout());//배치관리자; 보드레이아웃 설정(동,서,남,북,중앙)
	memo = new TextArea(10,55);	// memo -> textarea
	add("Center",memo);			// 중앙에 memo를 추가
	
	myPanel = new Panel();	// 패널 생성
	name = new TextField(8); // 텍스트필드 8칸 생성
	name.setText("대화명");	// name에 대화명이라는 글을 생성
	myPanel.add(name);	// 패널에 name을 추가
	input = new TextField(40); // 텍스트필드 40칸 생성 
	input.addActionListener(this); // ★ input에 액션리스너를 추가
	myPanel.add(input); // 패널에 input 추가
	add("South",myPanel); // 애플릿 추가(myPanel채널)
	}
	public void start() 
	{
		if(clock==null) 
		{
			clock = new Thread(this);
			clock.start();
		}
	}
	public void run() 
{
		out.println("LOGIN|"+mySocket);
		memo.append("[접속] "+getCodeBase().toString()+"\n");
	
	try 
	{
		while(true) 
		{
			String msg = in.readLine();
			if(!msg.equals("")&& !msg.equals(null)) 
			{
				memo.append(msg+"\n");
			}
		}
	}catch(IOException e) 
	{
		memo.append(e.toString()+"\n");
	}
}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==input) 
		{
			String data = input.getText();
			input.setText("");
			out.println("TALK|"+name.getText()+": "+data);
			out.flush();	
		}
	}
	public void stop() 
	{
		if((clock!=null)&&(clock.isAlive())) 
		{
			clock = null;
		}
		out.println("LOGOUT|"+ name.getText());
		out.flush();
		try 
		{
			out.close();
			in.close();
			mySocket.close();
		}
		catch(IOException e) 
		{
			memo.append(e.toString()+"\n");
		}
	}

}
