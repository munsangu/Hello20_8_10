import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JDBCProStep1 implements ActionListener {

	private JFrame frame;
	private JTextField txtNo;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtTel;
	private JTable table;
	private JButton btnTotal, btnAdd, btnSearch, btnDel, btnCancel,btnUpdate;
	private JScrollPane scrollPane;
	private static final int NONE = 0;
	private static final int ADD = 1;
	private static final int DELETE = 2;
	private static final int SEARCH = 3;
	private static final int TOTAL = 4;
	private static final int UPDATE = 5;
	int cmd = NONE;
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String user = "system";
	String password = "123456";
	Connection con = null;
	PreparedStatement pstmt = null;
	String sqlTotal= "select * from customer";
	String sqlInsert= "insert into customer values(?,?,?,?)";
	String sqlDelete= "delete from customer where name=?";
	String sqlUpdate= "update customer set email=? tel=? where code=?";
	String sqlSearch= "select * from customer where name=?";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JDBCProStep1 window = new JDBCProStep1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws Exception 
	 */
	public JDBCProStep1(){
		initialize();
		init();
		dbcon();
	}
	
	public void dbcon() 
	{

		try 
		{
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, password);
		System.out.println("����");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\uACE0\uAC1D\uAD00\uB9AC\uD504\uB85C\uADF8\uB7A8");
		frame.setBounds(100, 100, 787, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("��ȣ");
		lblNewLabel.setBounds(100, 66, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("�̸�");
		lblNewLabel_1.setBounds(100, 111, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("�̸���");
		lblNewLabel_2.setBounds(100, 156, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("��ȭ��ȣ");
		lblNewLabel_3.setBounds(100, 199, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtNo = new JTextField();
		txtNo.setBounds(169, 60, 116, 21);
		frame.getContentPane().add(txtNo);
		txtNo.setColumns(10);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(169, 105, 116, 21);
		frame.getContentPane().add(txtName);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(169, 150, 116, 21);
		frame.getContentPane().add(txtEmail);
		
		txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(169, 193, 116, 21);
		frame.getContentPane().add(txtTel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(328, 60, 376, 246);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		// ��ü����
		btnTotal = new JButton("��ü����");
		btnTotal.setBounds(28, 351, 97, 23);
		frame.getContentPane().add(btnTotal);
		
		//�߰�
		btnAdd = new JButton("�߰�");
		btnAdd.setBounds(137, 351, 97, 23);
		frame.getContentPane().add(btnAdd);
	
		//����
		btnDel = new JButton("����");
		btnDel.setBounds(246, 351, 97, 23);
		frame.getContentPane().add(btnDel);

		//�˻�
		btnSearch = new JButton("�˻�");
		btnSearch.setBounds(355, 351, 97, 23);
		frame.getContentPane().add(btnSearch);
		
		//���
		btnCancel = new JButton("���");
		btnCancel.setBounds(573, 351, 97, 23);
		frame.getContentPane().add(btnCancel);
		
		//����
		btnUpdate = new JButton("����");
		btnUpdate.setEnabled(true);
		btnUpdate.setBounds(464, 351, 97, 23);
		frame.getContentPane().add(btnUpdate);
		
		btnTotal.addActionListener(this);
		btnAdd.addActionListener(this);
		btnSearch.addActionListener(this);
		btnDel.addActionListener(this);
		btnCancel.addActionListener(this);
		btnUpdate.addActionListener(this);
		
	}
	// �߰���ư�� DB
	private void add() 
	{
		System.out.println("�߰�");
/*		System.out.print(txtNo.getText()+"  ");	
		System.out.print(txtName.getText()+"  ");
		System.out.print(txtEmail.getText()+"  ");
		System.out.print(txtTel.getText()+"  ");*/
		String no = txtNo.getText();
		String name = txtName.getText();
		String email = txtEmail.getText();
		String tel = txtTel.getText();
		try 
		{
			pstmt = con.prepareStatement(sqlInsert,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			pstmt.setInt(1, Integer.valueOf(no));
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, tel);
			int res = pstmt.executeUpdate();
			if(res==1)System.out.println("����");
			else System.out.println("����");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	// ������ư�� DB
	private void del() 
	{
		System.out.println("����");
/*		System.out.print(txtNo.getText()+"  ");	
		System.out.print(txtName.getText()+"  ");
		System.out.print(txtEmail.getText()+"  ");
		System.out.print(txtTel.getText()+"  ");*/
		try 
		{
			pstmt = con.prepareStatement(sqlDelete,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			pstmt.setString(1,txtName.getText());
			int res = pstmt.executeUpdate();
			if(res==1)System.out.println("����");
			else System.out.println("����");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	// �˻���ư�� DB
	private void search() 
	{
		System.out.println("�˻�");
/*		System.out.print(txtNo.getText()+"  ");	
		System.out.print(txtName.getText()+"  ");
		System.out.print(txtEmail.getText()+"  ");
		System.out.print(txtTel.getText()+"  ");*/
		try 
		{

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	// ��ü�����ư�� DB
	private void total() 
	{
		System.out.println("��ü����");
/*		System.out.print(txtNo.getText()+"  ");	
		System.out.print(txtName.getText()+"  ");
		System.out.print(txtEmail.getText()+"  ");
		System.out.print(txtTel.getText()+"  ");*/
		try 
		{

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	// ������ư�� DB
	private void update() 
	{
		System.out.println("����");
/*		System.out.print(txtNo.getText()+"  ");	
		System.out.print(txtName.getText()+"  ");
		System.out.print(txtEmail.getText()+"  ");
		System.out.print(txtTel.getText()+"  ");*/
		try 
		{

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btnAdd) 
		{
			if(cmd!=ADD) 
			{   
				call(ADD);
				return;
			}
			frame.setTitle("�߰�");
			add();	// db�� �����Ͽ� �߰� �۾��� ��
		}
		else if(e.getSource()==btnDel)
		{		
		if(cmd!=DELETE) 
		{
			call(DELETE);
			return;
		}
			frame.setTitle("����");
			del();
		}
		else if(e.getSource()==btnSearch) 
		{		
		if(cmd!=SEARCH) 
		{
			call(SEARCH);
			return;
		}
			frame.setTitle("�˻�");
			search();
		}
		else if(e.getSource()==btnTotal) 
		{
			if(cmd!=TOTAL) 
			{
				call(TOTAL);
			}
			frame.setTitle("��ü����");
			total();
		}
		else if(e.getSource()==btnUpdate) 
		{
			if(cmd!=UPDATE) 
			{
				call(UPDATE);
			}
			frame.setTitle("����");
			total();
		}	
		System.out.println("���");
		call(NONE);
		init();
	}

	public void init() 
	{
		txtNo.setText("");
		txtName.setText("");
		txtEmail.setText("");
		txtTel.setText("");
		txtNo.setEditable(false);
		txtName.setEditable(false);
		txtEmail.setEditable(false);
		txtTel.setEditable(false);
		btnTotal.setEnabled(true);
		btnAdd.setEnabled(true);
		btnDel.setEnabled(true);
		btnSearch.setEnabled(true);
		btnUpdate.setEnabled(true);
		btnCancel.setEnabled(true);
	}
	public void call(int command) 
	{	// �ؽ�Ʈ �ʵ��� ���� ���� on/off
		btnTotal.setEnabled(false);
		btnAdd.setEnabled(false);
		btnDel.setEnabled(false);
		btnSearch.setEnabled(false);
		btnUpdate.setEnabled(false);
		btnCancel.setEnabled(true);
		switch(command) 
		{
		case ADD:
			txtNo.setEditable(true);
			txtName.setEditable(true);
			txtEmail.setEditable(true);
			txtTel.setEditable(true);
			btnAdd.setEnabled(true);
			cmd = ADD;
			break;
		case DELETE:
			txtName.setEditable(true);
			btnDel.setEnabled(true);
			cmd = DELETE;
			break;
		case SEARCH:
			txtName.setEditable(true);
			btnSearch.setEnabled(true);
			cmd = SEARCH;
			break;
		case TOTAL:
			cmd = TOTAL;
			break;
		case UPDATE:
			cmd = UPDATE;
			break;
		case NONE:
			cmd = NONE;
			break;		
		}		
	}	
}
