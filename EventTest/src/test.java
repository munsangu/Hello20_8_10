import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class test implements ActionListener {

	private JFrame frmFrameOfPractice;
	private JTextField txtname;
	private JTextField txtid;
	private JTextField txtpassword;
	JButton btninsert, btndelete, btncancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
					window.frmFrameOfPractice.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFrameOfPractice = new JFrame();
		frmFrameOfPractice.setTitle("Frame of Practice");
		frmFrameOfPractice.setBounds(100, 100, 450, 300);
		frmFrameOfPractice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFrameOfPractice.getContentPane().setLayout(null);
		
		txtname = new JTextField();
		txtname.setBounds(206, 38, 116, 21);
		frmFrameOfPractice.getContentPane().add(txtname);
		txtname.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		lblNewLabel.setBounds(78, 41, 57, 15);
		frmFrameOfPractice.getContentPane().add(lblNewLabel);
		
		txtid = new JTextField();
		txtid.setColumns(10);
		txtid.setBounds(206, 91, 116, 21);
		frmFrameOfPractice.getContentPane().add(txtid);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		lblId.setBounds(78, 94, 57, 15);
		frmFrameOfPractice.getContentPane().add(lblId);
		
		txtpassword = new JTextField();
		txtpassword.setColumns(10);
		txtpassword.setBounds(206, 142, 116, 21);
		frmFrameOfPractice.getContentPane().add(txtpassword);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		lblPassword.setBounds(78, 145, 57, 15);
		frmFrameOfPractice.getContentPane().add(lblPassword);
		
		btninsert = new JButton("INSERT");
		btninsert.setFont(new Font("±¼¸²", Font.PLAIN, 8));
		btninsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btninsert.setBounds(78, 199, 66, 23);
		frmFrameOfPractice.getContentPane().add(btninsert);
		
		btndelete = new JButton("DELETE");
		btndelete.setFont(new Font("±¼¸²", Font.PLAIN, 8));
		btndelete.setBounds(165, 199, 66, 23);
		frmFrameOfPractice.getContentPane().add(btndelete);
		
		btncancel = new JButton("CANCEL");
		btncancel.setFont(new Font("±¼¸²", Font.PLAIN, 8));
		btncancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btncancel.setBounds(256, 199, 66, 23);
		frmFrameOfPractice.getContentPane().add(btncancel);
		
		btninsert.addActionListener(this);
		btndelete.addActionListener(this);
		btncancel.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btninsert) 
		{
			
		}
		else if(e.getSource()==btndelete) 
		{
			
		}
		else 
		{
			
		}
		
	}
}
