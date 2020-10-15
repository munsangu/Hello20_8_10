
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
		System.out.println("성공");
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
			
		JPanel panel = new JPanel();
		panel.setBounds(-2, 0, 771, 417);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("번호");
		lblNewLabel.setBounds(91, 95, 36, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setBounds(91, 120, 57, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이메일");
		lblNewLabel_2.setBounds(82, 158, 57, 15);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("전화번호");
		lblNewLabel_3.setBounds(71, 185, 68, 15);
		panel.add(lblNewLabel_3);
		
		txtNo = new JTextField();
		txtNo.setBounds(151, 92, 116, 21);
		panel.add(txtNo);
		txtNo.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(151, 123, 116, 21);
		panel.add(txtName);
		txtName.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(151, 155, 116, 21);
		panel.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtTel = new JTextField();
		txtTel.setBounds(151, 182, 116, 21);
		panel.add(txtTel);
		txtTel.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(320, 38, 393, 230);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		// 전체보기
		btnTotal = new JButton("전체보기");
		btnTotal.setBounds(106, 308, 81, 23);
		panel.add(btnTotal);
		
		//추가
		btnAdd = new JButton("추가");
		btnAdd.setBounds(210, 308, 57, 23);
		panel.add(btnAdd);
		
		//삭제
		btnDel = new JButton("삭제");
		btnDel.setBounds(286, 308, 57, 23);
		panel.add(btnDel);
			
		//검색
		btnSearch = new JButton("검색");
		btnSearch.setBounds(381, 308, 57, 23);
		panel.add(btnSearch);
					
		//취소
		btnCancel = new JButton("취소");
		btnCancel.setBounds(569, 308, 57, 23);
		panel.add(btnCancel);
					
		//수정
		btnUpdate = new JButton("수정");
		btnUpdate.setBounds(474, 308, 57, 23);
		panel.add(btnUpdate);
		
		btnUpdate.setEnabled(true);
		btnUpdate.addActionListener(this);
		btnCancel.addActionListener(this);
		btnSearch.addActionListener(this);
		btnDel.addActionListener(this);
		btnAdd.addActionListener(this);
		btnTotal.addActionListener(this);
		
	}
	// 추가버튼의 DB
	private void add() 
	{
		System.out.println("추가");
		try 
		{
			pstmt = con.prepareStatement(sqlInsert,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			pstmt.setInt(1, Integer.valueOf(txtNo.getText()));
			pstmt.setString(2, txtName.getText());
			pstmt.setString(3, txtEmail.getText());
			pstmt.setString(4, txtTel.getText());
			int res = pstmt.executeUpdate();
			if(res==1)System.out.println("성공");
			else System.out.println("실패");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	// 삭제버튼의 DB
	private void del() 
	{
		System.out.println("삭제");
		try 
		{
			pstmt = con.prepareStatement(sqlDelete,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			pstmt.setString(1,txtName.getText());
			int res = pstmt.executeUpdate();
			if(res==1)System.out.println("성공");
			else System.out.println("실패");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	// 검색버튼의 DB
	private void search() 
	{
		System.out.println("검색");
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
	// 전체보기버튼의 DB
	private void total() 
	{
		System.out.println("전체보기");
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
	// 수정버튼의 DB
	private void update() 
	{
		System.out.println("수정");
		try 
		{
			pstmt=con.prepareStatement(sqlUpdate);
			pstmt.setString(1, txtEmail.getText());
			pstmt.setString(2, txtTel.getText());
			pstmt.setInt(3, Integer.valueOf(txtNo.getText()));
			int res = pstmt.executeUpdate();
			if(res==1)System.out.println("성공");
			else System.out.println("실패");	
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
			frame.setTitle("추가");
			add();	// db에 연결하여 추가 작업이 됨
		}
		else if(e.getSource()==btnDel)
		{		
		if(cmd!=DELETE) 
		{
			call(DELETE);
			return;
		}
			frame.setTitle("삭제");
			del();
		}
		else if(e.getSource()==btnSearch) 
		{		
		if(cmd!=SEARCH) 
		{
			call(SEARCH);
			return;
		}
			frame.setTitle("검색");
			search();
		}
		else if(e.getSource()==btnUpdate) 
		{
			if(cmd!=UPDATE) 
			{
				call(UPDATE);
				return;
			}
			frame.setTitle("수정");
			update();
		}	
		else if(e.getSource()==btnTotal) 
		{
			if(cmd!=TOTAL) 
			{
				call(TOTAL);
			}
			frame.setTitle("전체보기");
			total();
		}

		System.out.println("취소");
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
	{	// 텍스트 필드의 편집 상태 on/off
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
