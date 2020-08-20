package a20_8_20_awt;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Label;
public class LabelTest extends Applet 
{

	Label lbl1, lbl2, lbl3;
	public void init() 
	{
		lbl1 = new Label("C");
		lbl2 = new Label();
		lbl3 = new Label("JSP",Label.RIGHT);
		
		lbl2.setText("JAVA");
		lbl1.setBackground(Color.BLUE);
		lbl2.setBackground(Color.YELLOW);
		lbl3.setBackground(new Color(255,0,0));
		
		lbl1.setAlignment(Label.CENTER);
		lbl2.setAlignment(Label.CENTER);
		lbl3.setAlignment(Label.CENTER);
		
		
		this.add(lbl1);
		this.add(lbl2);
		this.add(lbl3);
	}

	public void start() 
	{

	}
	
}
