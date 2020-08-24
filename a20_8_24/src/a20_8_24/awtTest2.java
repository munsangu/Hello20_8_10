package a20_8_24;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.TextField;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class awtTest2 extends Applet implements AdjustmentListener
{
	Label lblr,lblg,lblb;
	TextField tf1,tf2,tf3;
	Scrollbar scr, scg, scb;
	int ir, ig, ib;
	public void init() 
	{
		this.setLayout(null);
		ir=ig=ib=0;
		lblr = new Label("RED");
		lblr.setBounds(10, 10, 50, 20);
		scr = new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,256);
		scr.setBounds(10, 30, 100, 20);
		this.add(scr);
		this.add(lblr);
		lblg = new Label("GREEN");
		lblg.setBounds(100, 10, 50, 20);
		scg = new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,256);
		scg.setBounds(100, 30, 100, 20);
		this.add(scg);
		this.add(lblg);
		lblb = new Label("BLUE");
		lblb.setBounds(200, 10, 50, 20);
		scb = new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,256);
		scb.setBounds(200, 30, 100, 20);
		this.add(scb);
		this.add(lblb);
		
		tf1 = new TextField(10);
		tf1.setBounds(10, 220, 80, 20);
		this.add(tf1);	
		tf2 = new TextField(10);
		tf2.setBounds(100, 220, 100, 20);
		this.add(tf2);	
		tf3 = new TextField(10);
		tf3.setBounds(200, 220, 100, 20);
		this.add(tf3);	
		scr.addAdjustmentListener(this);
		scg.addAdjustmentListener(this);
		scb.addAdjustmentListener(this);
	}
	public void start() 
	{
		
	}
	public void paint(Graphics g) 
	{
		g.setColor(new Color(ir,ig,ib));
		g.fillOval(100, 100, 100, 100);	
	}
	public void adjustmentValueChanged(AdjustmentEvent e) 
	{
		if(e.getSource()==scr) 
			{
			tf1.setText("RED: " +scr.getValue());
			ir = scr.getValue();
			}
		else if(e.getSource()==scg) 
			{
			tf2.setText("GREEN: " +scg.getValue());
			ig = scg.getValue();
			}
		else if(e.getSource()==scb) 
			{
			tf3.setText("BLUE: " +scb.getValue());
			ib = scb.getValue();
			}
		repaint();
	}
}
