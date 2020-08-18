import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class TestFrame extends JFrame 
{
	JLabel lbl = null;
	JButton btn=null;
	JTextField txt = null;
	static TestFrame frame;
	public static void main(String[] args) 
	{
		frame = new TestFrame();	
	}
	public TestFrame() 
	{
		this.setVisible(true);
		this.setBounds(10, 10, 300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		btn = new JButton("전송");
		lbl = new JLabel("이름");
		txt = new JTextField();
		this.add(btn);
		this.add(lbl);
		this.add(txt);
	}
}
