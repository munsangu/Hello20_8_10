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
			mySocket = new Socket("127.0.0.1",2587); // IP ��Ʈ��ȣ�� ���� ��Ĺ ����
			out = new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream(),"KSC5601"),true);	// ��Ĺ�� ���� ��½�Ʈ�� ����
			in = new BufferedReader(new InputStreamReader(mySocket.getInputStream(),"KSC5601"),1024);   // ��Ĺ�� ���� �Է½�Ʈ�� ����
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
	setLayout(new BorderLayout());//��ġ������; ���巹�̾ƿ� ����(��,��,��,��,�߾�)
	memo = new TextArea(10,55);	// memo -> textarea
	add("Center",memo);			// �߾ӿ� memo�� �߰�
	
	myPanel = new Panel();	// �г� ����
	name = new TextField(8); // �ؽ�Ʈ�ʵ� 8ĭ ����
	name.setText("��ȭ��");	// name�� ��ȭ���̶�� ���� ����
	myPanel.add(name);	// �гο� name�� �߰�
	input = new TextField(40); // �ؽ�Ʈ�ʵ� 40ĭ ���� 
	input.addActionListener(this); // �� input�� �׼Ǹ����ʸ� �߰�
	myPanel.add(input); // �гο� input �߰�
	add("South",myPanel); // ���ø� �߰�(myPanelä��)
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
		memo.append("[����] "+getCodeBase().toString()+"\n");
	
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
