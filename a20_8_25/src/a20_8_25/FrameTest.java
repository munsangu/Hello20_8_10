package a20_8_25;
import java.awt.Frame;       //  awt 패키지의 Frame

public class FrameTest 
{
	public static void main(String[] args)
	{
		Frame f = new Frame();
		f.setVisible(true);  // frame이 보이도록 함
		f.setTitle("Great Java");
		f.setBounds(10, 20, 500, 300);		
		// 위의 코드까지 작성 후 실행할 경우 창을 끌 수 없는 문제 발생(닫기 버튼 작동 X) -> 부모 클래스로 활용할 경우의 한계
	}
}
