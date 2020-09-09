import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDBCProStep1 implements ActionListener {

	private JFrame frame;
	private JTextField txtNo;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtTel;
	private JTable table;
	private JButton btnTotal, btnAdd, btnSearch, btnDel, btnCancel;
	private static final int NONE = 0;
	private static final int ADD = 1;
	private static final int DELETE = 2;
	private static final int SEARCH = 3;
	private static final int TOTAL = 4;
	int cmd = NONE;
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
	 */
	public JDBCProStep1() {
		initialize();
		init();
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(328, 60, 376, 246);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		// ��ü����
		btnTotal = new JButton("��ü����");
		btnTotal.setBounds(81, 351, 97, 23);
		frame.getContentPane().add(btnTotal);
		
		//�߰�
		btnAdd = new JButton("�߰�");
		btnAdd.setBounds(202, 351, 97, 23);
		frame.getContentPane().add(btnAdd);
	
		//����
		btnDel = new JButton("����");
		btnDel.setBounds(328, 351, 97, 23);
		frame.getContentPane().add(btnDel);

		//�˻�
		btnSearch = new JButton("�˻�");
		btnSearch.setBounds(454, 351, 97, 23);
		frame.getContentPane().add(btnSearch);
		
		//���
		btnCancel = new JButton("���");
		btnCancel.setBounds(580, 351, 97, 23);
		frame.getContentPane().add(btnCancel);
		
		btnTotal.addActionListener(this);
		btnAdd.addActionListener(this);
		btnSearch.addActionListener(this);
		btnDel.addActionListener(this);
		btnCancel.addActionListener(this);
		
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
		}
		else if(e.getSource()==btnDel)
			
		{		
		if(cmd!=DELETE) 
		{
			call(DELETE);
			return;
		}
			frame.setTitle("����");
		}
		else if(e.getSource()==btnSearch) 
		{		if(cmd!=SEARCH) 
		{
			call(SEARCH);
			return;
		}
			frame.setTitle("�˻�");
		}
		else if(e.getSource()==btnTotal) 
		{
			if(cmd!=TOTAL) 
			{
				call(TOTAL);
			}
			
			frame.setTitle("��ü����");
		}	
		System.out.println("���");
		call(NONE);
		cmd=NONE;
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
	}
	public void call(int cmd) 
	{	// �ؽ�Ʈ �ʵ��� ���� ���� on/off
		switch(cmd) 
		{
		case ADD:
			txtNo.setEditable(true);
			txtName.setEditable(true);
			txtEmail.setEditable(true);
			txtTel.setEditable(true);
			break;
		case DELETE:
		case SEARCH:
			txtName.setEditable(true);
			break;
		}
		// ��ư�� ���� on/off
		btnTotal.setEnabled(false);
		btnAdd.setEnabled(false);
		btnSearch.setEnabled(false);
		btnDel.setEnabled(false);
		switch(cmd) 
		{
		case ADD:
			btnAdd.setEnabled(true);
			cmd = ADD;
			break;
		case DELETE:
			btnDel.setEnabled(true);
			cmd = DELETE;
			break;
		case SEARCH:
			btnSearch.setEnabled(true);
			cmd = SEARCH;
			break;
		case TOTAL:
			btnTotal.setEnabled(true);
			cmd = TOTAL;
			break;
		case NONE:
		btnTotal.setEnabled(true);
		btnAdd.setEnabled(true);
		btnSearch.setEnabled(true);
		btnDel.setEnabled(true);
		btnCancel.setEnabled(true);
		cmd=NONE;
		break;
		}
	}
}
