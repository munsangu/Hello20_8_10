package a20_8_20_awt;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonTest extends Applet implements ActionListener
{
	Button btn1, btn2, btn3;          // 버튼들은 ActionListener 와 세트
	public void init() 
	{
		btn1 = new Button();
		btn2 = new Button("C++");
		btn3 = new Button("Java");
		
		btn1.setLabel("C");
		btn2.setLabel("Cpp");
		btn1.setBackground(Color.GREEN);
		btn2.setBackground(Color.yellow);
		btn3.setBackground(new Color(255,0,0));
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		
		btn1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) 
	{
		System.out.println("Button1");
	}
}
