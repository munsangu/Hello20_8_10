package a20_7_15;
// setter : ���� �����Ͽ� ��������� ���¤� �����ϱ� ���� �뵵
// ������   �޼ҵ�  : ������(new - )�� ���� �ʱ�ȭ �ϱ� ���� �뵵
//              Ŭ������� ������ �޼ҵ���̰�, ���ϰ� ��ü�� ����(void�� ����) ex) public dog(){}
public class mainTest 
{
	public static void main(String[] args) 
	{
	Employee kim = new Employee();
	kim.setName("ȫ�浿");
	kim.setSal(3000);
	kim.show();
	System.out.println("=====================================");
	manager lee = new manager();
	lee.setName("�̹�ȣ");
	lee.setSal(5000);
	lee.setDep("ȫ����");
	lee.show();
	System.out.println("=====================================");
	lee.show("������");
	System.out.println("=====================================");
	dog happy = new dog("��Ű",2);
	happy.show();
	System.out.println("=====================================");
	dog Choi = new dog();
	Choi.setName("��");
	Choi.setAge(1);
	Choi.show();
	}
}