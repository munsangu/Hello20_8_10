import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class branch implements ActionListener {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTable table;
	JButton btnInsert;
	JButton btnSave;
	JButton btnCancel;
	JLabel lblNewLabel;
	JLabel label;
	JLabel label_1;
	JLabel label_2;
	JLabel label_3;
	JScrollPane scrollPane;
	MyModel model;
	Connection conn = null;
	static ResultSet rs = null;
	static Statement stmt = null;
	PreparedStatement pstmt = null;
	PreparedStatement pstmtTotal, pstmtTotalScroll= null;
	Connection con = null;
	String sqlTotal= "select * from branch";
	String sqlInsert = "insert into branch values(?,?,?,?)";
	private String driver="oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user = "system";
	private String pwd = "123456";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					branch window = new branch();
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
	public branch() {
		initialize();
		dbConnect();
		init();
	}
	
	public void init() 
	{
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
		tf5.setText("");
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
	
	private void dbConnect() 
	{
		try 
		{
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
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
		frame.setTitle("\uC9C0\uC810 \uAD00\uB9AC");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnInsert = new JButton("\uCD94\uAC00");
		btnInsert.setBounds(31, 10, 97, 23);
		frame.getContentPane().add(btnInsert);
		
		btnSave = new JButton("\uC800\uC7A5");
		btnSave.setBounds(138, 10, 97, 23);
		frame.getContentPane().add(btnSave);
		
		btnCancel = new JButton("\uCDE8\uC18C");
		btnCancel.setBounds(247, 10, 97, 23);
		frame.getContentPane().add(btnCancel);
		
		lblNewLabel = new JLabel("\uC9C0\uC810\uBC88\uD638");
		lblNewLabel.setBounds(23, 51, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		label = new JLabel("\uC9C0\uC810\uBA85");
		label.setBounds(23, 76, 57, 15);
		frame.getContentPane().add(label);
		
		label_1 = new JLabel("\uC8FC\uC18C");
		label_1.setBounds(23, 104, 57, 15);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("\uC804\uD654\uBC88\uD638");
		label_2.setBounds(23, 131, 57, 15);
		frame.getContentPane().add(label_2);
		
		label_3 = new JLabel("\uC790\uC0B0\uCD1D\uC561");
		label_3.setBounds(23, 158, 57, 15);
		frame.getContentPane().add(label_3);
		
		tf1 = new JTextField();
		tf1.setBounds(92, 43, 116, 21);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(92, 73, 116, 21);
		frame.getContentPane().add(tf2);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(92, 101, 116, 21);
		frame.getContentPane().add(tf3);
		
		tf4 = new JTextField();
		tf4.setColumns(10);
		tf4.setBounds(92, 128, 116, 21);
		frame.getContentPane().add(tf4);
		
		tf5 = new JTextField();
		tf5.setColumns(10);
		tf5.setBounds(92, 155, 116, 21);
		frame.getContentPane().add(tf5);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 179, 383, 61);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setRowHeaderView(table);
		
		btnInsert.addActionListener(this);
		btnSave.addActionListener(this);
		btnCancel.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == btnInsert) 
			{
			add();
			} else if(e.getSource() == btnSave) 
			{
			save();
			} else if(e.getSource() == btnCancel) 
			{
			cancel();
			}
	}
	private void add() 
	{
		System.out.println("추가");
		try 
		{
			pstmt = con.prepareStatement(sqlInsert,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			pstmt.setInt(1, Integer.valueOf(tf1.getText()));
			pstmt.setString(2, tf2.getText());
			pstmt.setString(3, tf3.getText());
			pstmt.setString(4, tf4.getText());
			pstmt.setString(5, tf5.getText());
			int res = pstmt.executeUpdate();
			if(res==1)System.out.println("성공");
			else System.out.println("실패");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private void save() {}
	private void cancel() {}
	
}
