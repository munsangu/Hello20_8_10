package a20_8_25;
import java.awt.Frame;       //  awt ��Ű���� Frame

public class FrameTest 
{
	public static void main(String[] args)
	{
		Frame f = new Frame();
		f.setVisible(true);  // frame�� ���̵��� ��
		f.setTitle("Great Java");
		f.setBounds(10, 20, 500, 300);		
		// ���� �ڵ���� �ۼ� �� ������ ��� â�� �� �� ���� ���� �߻�(�ݱ� ��ư �۵� X) -> �θ� Ŭ������ Ȱ���� ����� �Ѱ�
	}
}
