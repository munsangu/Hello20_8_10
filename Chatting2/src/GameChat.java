import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;

public class GameChat implements ActionListener{

	private JFrame frame;
	private JTextField name;
	private JTextField input;
	private JTextArea memo;
	Socket mySocket = null;
	PrintWriter out = null;
	BufferedReader in = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameChat window = new GameChat();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameChat() {
		initialize();
		init();
	}

	public void init() 
	{
		try 
		{
			mySocket = new Socket("127.0.0.1",2587); // IP 포트번호를 통해 소캣 생성
			out = new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream(),"KSC5601"),true);	// 소캣을 통한 출력스트림 만듦
			in = new BufferedReader(new InputStreamReader(mySocket.getInputStream(),"KSC5601"),1024);   // 소캣을 통한 입력스트림 만듦
			out.println("LOGIN|"+mySocket);
			memo.append("[접속] \n");
		}
		catch(UnknownHostException e) 
		{
			System.out.println(e.toString());
		}
		catch(IOException e) 
		{
			System.out.println(e.toString());
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		memo = new JTextArea();
		memo.setBackground(Color.LIGHT_GRAY);
		memo.setLineWrap(true);
		memo.setBounds(12, 10, 410, 187);
		frame.getContentPane().add(memo);
		
		name = new JTextField();
		name.setBounds(81, 204, 73, 21);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		input = new JTextField();
		input.setColumns(10);
		input.setBounds(157, 204, 254, 21);
		frame.getContentPane().add(input);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setBounds(22, 207, 47, 15);
		frame.getContentPane().add(lblNewLabel);
		
		input.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==input) 
		{
			String str ="TALK|"+name.getText()+":"+input.getText();
			System.out.println(str);
			input.setText("");
		}
	}
}
