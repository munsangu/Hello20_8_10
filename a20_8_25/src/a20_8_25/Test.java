package a20_8_25;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Test implements ActionListener{

	private JFrame frame;
	private JTextField txtno;
	private JTextField txtname;
	private JTextField txtemail;
	private JTextField txttel;
	private JTable table;
	private JButton btnTotal, btnAdd, btnSearch, btnDel, btnCan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
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
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 634, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl1 = new JLabel("\uBC88\uD638");
		lbl1.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl1.setBounds(34, 36, 57, 15);
		frame.getContentPane().add(lbl1);
		
		JLabel lbl2 = new JLabel("\uC774\uB984");
		lbl2.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl2.setBounds(34, 64, 57, 15);
		frame.getContentPane().add(lbl2);
		
		JLabel lbl3 = new JLabel("\uC774\uBA54\uC77C");
		lbl3.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl3.setBounds(34, 92, 57, 15);
		frame.getContentPane().add(lbl3);
		
		JLabel lbl4 = new JLabel("\uC804\uD654\uBC88\uD638");
		lbl4.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl4.setBounds(34, 120, 57, 15);
		frame.getContentPane().add(lbl4);
		
		txtno = new JTextField();
		txtno.setBounds(103, 33, 116, 21);
		frame.getContentPane().add(txtno);
		txtno.setColumns(10);
		
		txtname = new JTextField();
		txtname.setColumns(10);
		txtname.setBounds(103, 61, 116, 21);
		frame.getContentPane().add(txtname);
		
		txtemail = new JTextField();
		txtemail.setColumns(10);
		txtemail.setBounds(103, 89, 116, 21);
		frame.getContentPane().add(txtemail);
		
		txttel = new JTextField();
		txttel.setColumns(10);
		txttel.setBounds(103, 117, 116, 21);
		frame.getContentPane().add(txttel);
		
		btnTotal = new JButton("\uC804\uCCB4\uBCF4\uAE30");  // 전체보기
		btnTotal.setBounds(122, 202, 80, 23);
		frame.getContentPane().add(btnTotal);
		
		btnAdd = new JButton("\uCD94\uAC00");				 // 추가
		btnAdd.setBounds(210, 202, 80, 23);
		frame.getContentPane().add(btnAdd);
		
		btnSearch = new JButton("\uAC80\uC0C9");		     // 검색
		btnSearch.setBounds(384, 202, 80, 23);
		frame.getContentPane().add(btnSearch);
		
		btnDel = new JButton("\uC0AD\uC81C");				 // 삭제
		btnDel.setBounds(296, 202, 80, 23);
		frame.getContentPane().add(btnDel);
		
		btnCan = new JButton("\uCDE8\uC18C");				 // 취소
		btnCan.setBounds(473, 202, 80, 23);
		frame.getContentPane().add(btnCan);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(247, 33, 304, 154);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		
		btnTotal.addActionListener(this);
		btnAdd.addActionListener(this);
		btnSearch.addActionListener(this);
		btnDel.addActionListener(this);
		btnCan.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btnTotal) 
		{
			System.out.print(txtno.getText()+"\t");
			System.out.print(txtname.getText()+"\t");
			System.out.print(txtemail.getText()+"\t");
			System.out.print(txttel.getText()+"\n");
		}
		else if(e.getSource()==btnAdd) 
		{
			System.out.println("추가");
		}
		else if(e.getSource()==btnDel) 
		{
			System.out.println("삭제");
		}
		else if(e.getSource()==btnSearch) 
		{
			System.out.println("검색");
		} 
		else if(e.getSource()==btnCan) 
		{
			System.out.println("취소");
			txtno.setText(" ");
			txtname.setText(" ");
			txtemail.setText(" ");
			txttel.setText(" ");
		}
	}
}
