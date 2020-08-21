package a20_8_21;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest extends Applet implements ActionListener
{
	Button btn1, btn2,btn3;  // ��ư���� ActionListener �������̽��� ��� �޾߾��� 
	TextArea ta;
	public void init() 
	{
		this.setLayout(null);
		btn1 = new Button("Java");
		btn2 = new Button("JSP");
		btn3 = new Button("DELETE");
		btn1.setBounds(2, 10, 50, 50);
		btn2.setBounds(70, 10, 50, 50);
		btn3.setBounds(140, 10, 50, 50);
		ta = new TextArea(5,20);
		ta.setBackground(Color.gray);
		ta.setBounds(2, 100, 200, 100);
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(ta);
		btn1.addActionListener(this); 	// btn1 ��ư�� �׼� �߰�
		btn2.addActionListener(this);   // btn2 ��ư�� �׼� �߰�
		btn3.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btn1) 
		{
			btn1.disable();
			ta.append("Java: ");
			ta.append(btn1.getLabel()+"\n");
			btn2.enable();
			btn3.enable();
		}
		else if(e.getSource()==btn2)
		{
			btn2.disable();
			ta.append("JSP: ");
			ta.append(btn2.getLabel()+"\n");
			btn1.enable();
			btn3.enable();
		}
		else
		{
			btn3.disable();
			ta.append("DELETE: ");
			ta.append(btn3.getLabel()+"\n");
			btn1.enable();
			btn2.enable();
		}
	}
}
