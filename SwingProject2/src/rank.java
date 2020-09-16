import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class rank {

	private JFrame frame;
	private JTextField txtname;
	private JTextField txtkor;
	private JTextField txtmat;
	private JTextField txteng;
	private JTextField txtno;
	private JTextField txttot;
	private JTextField txtavg;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rank window = new rank();
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
	public rank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 841, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC774\uB984");
		lblNewLabel.setBounds(45, 87, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\uAD6D\uC5B4");
		label.setBounds(45, 136, 57, 15);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\uC218\uD559");
		label_1.setBounds(45, 180, 57, 15);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\uC601\uC5B4");
		label_2.setBounds(45, 223, 57, 15);
		frame.getContentPane().add(label_2);
		
		txtname = new JTextField();
		txtname.setBounds(136, 84, 116, 21);
		frame.getContentPane().add(txtname);
		txtname.setColumns(10);
		
		txtkor = new JTextField();
		txtkor.setColumns(10);
		txtkor.setBounds(136, 133, 116, 21);
		frame.getContentPane().add(txtkor);
		
		txtmat = new JTextField();
		txtmat.setColumns(10);
		txtmat.setBounds(136, 177, 116, 21);
		frame.getContentPane().add(txtmat);
		
		txteng = new JTextField();
		txteng.setColumns(10);
		txteng.setBounds(136, 220, 116, 21);
		frame.getContentPane().add(txteng);
		
		JButton btnCal = new JButton("\uACC4\uC0B0");
		btnCal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String kors = txtkor.getText();
				String engs = txteng.getText();
				String mats = txtmat.getText();
				int kor=Integer.valueOf(kors);
				int eng=Integer.valueOf(engs);
				int mat=Integer.valueOf(mats);
				int tot = kor+eng+mat;
				double avg = tot/3.0;
				String tots = String.valueOf(tot);
				String avgs = String.valueOf(avg);
				txttot.setText(tots);
				txtavg.setText(avgs);
			}
		});
		btnCal.setBounds(45, 412, 97, 23);
		frame.getContentPane().add(btnCal);
		
		JButton btnInsert = new JButton("\uCD94\uAC00");
		btnInsert.setBounds(168, 412, 97, 23);
		frame.getContentPane().add(btnInsert);
		
		JLabel label_3 = new JLabel("\uD559\uBC88");
		label_3.setBounds(45, 41, 57, 15);
		frame.getContentPane().add(label_3);
		
		txtno = new JTextField();
		txtno.setColumns(10);
		txtno.setBounds(136, 38, 116, 21);
		frame.getContentPane().add(txtno);
		
		JLabel label_4 = new JLabel("\uCD1D\uC810");
		label_4.setBounds(45, 266, 57, 15);
		frame.getContentPane().add(label_4);
		
		txttot = new JTextField();
		txttot.setEditable(false);
		txttot.setColumns(10);
		txttot.setBounds(136, 263, 116, 21);
		frame.getContentPane().add(txttot);
		
		JLabel label_5 = new JLabel("\uD3C9\uADE0");
		label_5.setBounds(45, 312, 57, 15);
		frame.getContentPane().add(label_5);
		
		txtavg = new JTextField();
		txtavg.setEditable(false);
		txtavg.setColumns(10);
		txtavg.setBounds(136, 309, 116, 21);
		frame.getContentPane().add(txtavg);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(298, 35, 498, 295);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnDel = new JButton("\uC0AD\uC81C");
		btnDel.setBounds(298, 412, 97, 23);
		frame.getContentPane().add(btnDel);
		
		JButton btnUpdate = new JButton("\uC218\uC815");
		btnUpdate.setBounds(425, 412, 97, 23);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnTotal = new JButton("\uC804\uCCB4\uBCF4\uAE30");
		btnTotal.setBounds(555, 412, 97, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnFirst = new JButton("");
		btnFirst.setIcon(new ImageIcon("C:\\git-hub\\munsangu\\Hello20_8_10\\TOOLBAR\\FIRST.GIF"));
		btnFirst.setBounds(45, 362, 24, 23);
		frame.getContentPane().add(btnFirst);
		
		JButton btnPreview = new JButton("");
		btnPreview.setIcon(new ImageIcon("C:\\git-hub\\munsangu\\Hello20_8_10\\TOOLBAR\\PREV.GIF"));
		btnPreview.setBounds(70, 362, 24, 23);
		frame.getContentPane().add(btnPreview);
		
		JButton btnNext = new JButton("");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNext.setIcon(new ImageIcon("C:\\git-hub\\munsangu\\Hello20_8_10\\TOOLBAR\\NEXT.GIF"));
		btnNext.setBounds(95, 362, 24, 23);
		frame.getContentPane().add(btnNext);
		
		JButton btnLast = new JButton("");
		btnLast.setIcon(new ImageIcon("C:\\git-hub\\munsangu\\Hello20_8_10\\TOOLBAR\\LAST.GIF"));
		btnLast.setBounds(120, 362, 24, 23);
		frame.getContentPane().add(btnLast);
	}
}
