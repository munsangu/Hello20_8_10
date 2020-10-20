
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
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
	private JTextField id;
	private JPasswordField password2;
	private ImagePanel panel_1;
	private static final int NONE = 0;
	private static final int ADD = 1;
	private static final int DELETE = 2;
	private static final int SEARCH = 3;
	private static final int TOTAL = 4;
	private static final int UPDATE = 5;
	int cmd = NONE;
	MyModel model;
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String user = "system";
	String password = "123456";
	Connection con = null;
	PreparedStatement pstmt = null;
	PreparedStatement pstmtTotal, pstmtTotalScroll= null;
	PreparedStatement pstmtSearch, pstmtSearchScroll= null;
	String sqlTotal= "select * from customer";
	String sqlInsert= "insert into customer values(?,?,?,?)";
	String sqlDelete= "delete from customer where name=?";
	String sqlUpdate= "update customer set email=? , tel=? where code=?";
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
		
		ImagePanel panel = new ImagePanel(new ImageIcon("C:/git-hub/munsangu/Hello20_8_10/JDBCProStep1/image/welcome.jpg").getImage());
		panel.setBounds(0, 0, 956, 605);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setLayout(null);
		panel.setVisible(false);
		

		JLabel lblNewLabel = new JLabel("��ȣ");
		lblNewLabel.setBounds(238, 258, 56, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("�̸�");
		lblNewLabel_1.setBounds(238, 292, 63, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("�̸���");
		lblNewLabel_2.setBounds(229, 317, 72, 15);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("��ȭ��ȣ");
		lblNewLabel_3.setBounds(213, 348, 81, 15);
		panel.add(lblNewLabel_3);
		
		txtNo = new JTextField();
		txtNo.setBounds(270, 255, 116, 21);
		panel.add(txtNo);
		txtNo.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(270, 286, 116, 21);
		panel.add(txtName);
		txtName.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(270, 318, 116, 21);
		panel.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtTel = new JTextField();
		txtTel.setBounds(270, 345, 116, 21);
		panel.add(txtTel);
		txtTel.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(422, 201, 410, 230);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		// ��ü����
		btnTotal = new JButton("��ü����");
		btnTotal.setBounds(195, 471, 111, 23);
		panel.add(btnTotal);
		
		//�߰�
		btnAdd = new JButton("�߰�");
		btnAdd.setBounds(318, 471, 68, 23);
		panel.add(btnAdd);
		
		//����
		btnDel = new JButton("����");
		btnDel.setBounds(398, 471, 81, 23);
		panel.add(btnDel);
		
		//�˻�
		btnSearch = new JButton("�˻�");
		btnSearch.setBounds(500, 471, 81, 23);
		panel.add(btnSearch);
		
		//���
		btnCancel = new JButton("���");
		btnCancel.setBounds(688, 471, 72, 23);
		panel.add(btnCancel);
		
		//����
		btnUpdate = new JButton("����");
		btnUpdate.setBounds(593, 471, 83, 23);
		panel.add(btnUpdate);
		
		btnUpdate.setEnabled(true);
		btnUpdate.addActionListener(this);
		btnCancel.addActionListener(this);
		btnSearch.addActionListener(this);
		btnDel.addActionListener(this);
		btnAdd.addActionListener(this);
		btnTotal.addActionListener(this);
		
		ImagePanel panel_1_1 = new ImagePanel(new ImageIcon("C:/git-hub/munsangu/Hello20_8_10/JDBCProStep1/image/welcome.jpg").getImage());
		panel_1_1.setBounds(0, 0, 954, 605);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setBounds(0, 0, 954, 605);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		
		JLabel txtid = new JLabel("ID :");
		txtid.setFont(new Font("����", Font.BOLD, 20));
		txtid.setBounds(309, 291, 134, 55);
		panel_1_1.add(txtid);
		
		JLabel txtpw = new JLabel("PASSWORD :");
		txtpw.setFont(new Font("����", Font.BOLD, 20));
		txtpw.setBounds(222, 365, 134, 55);
		panel_1_1.add(txtpw);
		
		JLabel lblLogIn = new JLabel("Log In");
		lblLogIn.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblLogIn.setBounds(375, 211, 234, 33);
		panel_1_1.add(lblLogIn);
		
		id = new JTextField();
		id.setFont(new Font("����", Font.BOLD, 20));
		id.setBounds(354, 283, 194, 63);
		panel_1_1.add(id);
		id.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon("C:\\git-hub\\munsangu\\Hello20_8_10\\JDBCProStep1\\image\\login.jpg"));
		btnNewButton.setPressedIcon(new ImageIcon("C:\\git-hub\\munsangu\\Hello20_8_10\\JDBCProStep1\\image\\login_clicked.jpg"));
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(id.getText().equals("lcu")&&Arrays.equals(password2.getPassword(), "1234".toCharArray())) 
				{
					System.out.println("Welcome MSW");
					JOptionPane.showMessageDialog(null, "You have logged in successfully");
					panel_1_1.setVisible(false);
					panel.setVisible(true);
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "You failed to log in");
				}
			}
		});
		btnNewButton.setBounds(560, 365, 55, 55);
		panel_1_1.add(btnNewButton);
		
		password2 = new JPasswordField();
		password2.setBounds(357, 367, 191, 55);
		panel_1_1.add(password2);
		frame.setResizable(false);
		frame.setSize(964,599);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
	}
	// �߰���ư�� DB
	private void add() 
	{
		System.out.println("�߰�");
		try 
		{
			pstmt = con.prepareStatement(sqlInsert,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			pstmt.setInt(1, Integer.valueOf(txtNo.getText()));
			pstmt.setString(2, txtName.getText());
			pstmt.setString(3, txtEmail.getText());
			pstmt.setString(4, txtTel.getText());
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
		try 
		{
			pstmtSearchScroll=con.prepareStatement(sqlSearch,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			pstmtSearch=con.prepareStatement(sqlSearch);
			pstmtSearchScroll.setString(1, txtName.getText());
			pstmtSearch.setString(1, txtName.getText());
			ResultSet rsScroll=pstmtSearchScroll.executeQuery();
			ResultSet rs=pstmtSearch.executeQuery();
			
			if(model==null)model=new MyModel();
			model.getRowCount(rsScroll);
			model.setData(rs);
			table.setModel(model);
			table.updateUI();
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
		try 
		{
			pstmtTotalScroll=con.prepareStatement(sqlTotal,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			pstmtTotal=con.prepareStatement(sqlTotal);
			ResultSet rsScroll=pstmtTotalScroll.executeQuery();
			ResultSet rs=pstmtTotal.executeQuery();
			if(model==null)model=new MyModel();
			model.getRowCount(rsScroll);
			model.setData(rs);
			table.setModel(model);
			table.updateUI();
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
		try 
		{
			pstmt=con.prepareStatement(sqlUpdate);
			pstmt.setString(1, txtEmail.getText());
			pstmt.setString(2, txtTel.getText());
			pstmt.setInt(3, Integer.valueOf(txtNo.getText()));
			int res = pstmt.executeUpdate();
			if(res==1)System.out.println("����");
			else System.out.println("����");	
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
		else if(e.getSource()==btnUpdate) 
		{
			if(cmd!=UPDATE) 
			{
				call(UPDATE);
				return;
			}
			frame.setTitle("����");
			update();
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
			txtNo.setEditable(true);
			txtEmail.setEditable(true);
			txtTel.setEditable(true);
			btnUpdate.setEnabled(true);
			cmd = UPDATE;
			break;
		case NONE:
			cmd = NONE;
			break;		
		}		
	}
}
class ImagePanel extends JPanel
{
	private Image img;
	
	public ImagePanel(Image img) 
	{
		this.img = img;
		setSize(new  Dimension(img.getWidth(null),img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
	}
	
	public int getWidth() 
	{
		return img.getWidth(null);
	}
	public int getHeight() 
	{
		return img.getHeight(null);
	}
	
	public void paintComponent(Graphics g) 
	{
		g.drawImage(img,0,0,null);
	}
	
}
