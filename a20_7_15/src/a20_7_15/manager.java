package a20_7_15;
public class manager 
{
	private String name;						   // ��� ����
	private int sal;							   
	private String dep;        
		public manager() 
		{
			this.name=null;
			this.sal=0;
			this.dep=null;
		}
		public void show() 						   // ��� �޼ҵ�
		{
			System.out.println("�Ŵ��� �� = "+name);
			System.out.println("���� = "+sal);
			System.out.println("�μ��� = "+dep);
		}
		public void show(String man) 			   // �����ε�(overloading): �̸��� ������ �޼ҵ带 2�� �̻� ������ ��
		{										   //   ��, 100% ��ġ�ϴ� ���� �ȵ�. show(), show(String name)
			System.out.println(man+"�� = "+name);
			System.out.println(man+"���� = "+sal);
			System.out.println(man+"�μ� = "+dep);
		}
		public void setName(String name) 		   
		{
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public int getSal() {
			return sal;
		}
		public String getDep() {
			return dep;
		}
		public void setSal(int sal) 			
		{
			this.sal = sal;
		}
		public void setDep(String dep) 		       
		{
			this.dep = dep;
		}
}
