package a20_7_15;

public class dog 
{
	private String name;
	private int age;
		public void show() 
		{
			System.out.println("������ �̸� = "+name);
			System.out.println("������ ���� = "+age);
		}
		public void setName(String name) 
		{
			this.name = name;
		}
		public void setAge(int age) 
		{
			this.age = age;
		}
		// ������(Construtor) �޼ҵ� ����� -> ���� �ʱ�ȭ 
		public dog() 			// ����Ʈ �����ڸ޼ҵ�
		{
			name=null;
			age=0;
		}
		public dog(String name) // �Ѱ�¥��<()�ȿ� �ִ� ���� ����> �����ڸ޼ҵ�
		{
			this.name=name;
		}
		public dog(String name, int age) // �ΰ�¥��<()�ȿ� �ִ� ���� ����> �����ڸ޼ҵ�
		{
			this.name=name;
			this.age=age;
		}
}
