import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class mainBank  implements ActionListener{

	private JFrame frame;
	JMenuItem itemExit,itemCustomer,itemBranch;
	fCustomer ifCustomer;
	frmBranch ifBranch;
	frmDepositKind ifDepositKind;
	frmDepositOrder ifDepositOrder;
	frmDepositStatement ifDepositStatement;
	frmInOut ifInOut;
	frmLoanKind ifLoanKind;
	frmLoanOrder ifLoanOrder;
	frmPayBack ifPayBack;
	
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user = "system";
	private String pwd = "123456";
	
	static Connection conn = null;
	static ResultSet rs = null;
	static Statement stmt = null;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainBank window = new mainBank();
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
	public mainBank() {
		initialize();
		dbConnet();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	// DB연결
	public void dbConnet() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("DB연결");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
//		menuBar.setBounds(0, 0, 434, 21);
//		frame.getContentPane().add(menuBar);
		frame.setJMenuBar(menuBar);
	
		JMenu mnNewMenu = new JMenu("시스템");
		menuBar.add(mnNewMenu);
		
		
		itemExit = new JMenuItem("종료");  //종료
		mnNewMenu.add(itemExit);
		
		JMenu mnNewMenu_1 = new JMenu("고객/지점관리");
		menuBar.add(mnNewMenu_1);
		
		itemCustomer = new JMenuItem("고객관리"); //고객관리
		mnNewMenu_1.add(itemCustomer);
		
		itemBranch = new JMenuItem("지점관리");
		mnNewMenu_1.add(itemBranch);
		
		itemExit.addActionListener(this);
		itemCustomer.addActionListener(this);
		itemBranch.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()== itemCustomer) menuCustomer();
		if(e.getSource()== itemExit) menuExit();
		if(e.getSource()==itemBranch)	menuBranch();
	}
	public void menuBranch() 
	{
		ifBranch=new frmBranch("지점관리",conn, null);
		ifBranch.pack();
		ifBranch.setVisible(true);
		frame.getContentPane().add(ifBranch);
		try 
			{
			ifBranch.setSelected(true);
			} 
		catch (Exception e) 
			{
			e.printStackTrace();
			}
	}
	public void menuCustomer() 
	{
		ifCustomer=new fCustomer();
		ifCustomer.pack();
		ifCustomer.setVisible(true);
		frame.getContentPane().add(ifCustomer);
		try 
			{
			ifCustomer.setSelected(true);
			} 
		catch (Exception e) 
			{
			e.printStackTrace();
			}
	}
	public void menuExit() 
	{
		System.exit(0);
	}
}
