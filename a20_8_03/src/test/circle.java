package test;
public class circle extends shape 
{
	private int r;
	public void area()   // �������̵�
	{
		res=r*r*Math.PI;
	}
	public circle() {}   // �����ڸ޼ҵ��� �����ε�
	public circle(int r) // �����ڸ޼ҵ��� �����ε�
	{
		this.r=r;
	}
}
// �������̵�(������): ��ӵ� �޼ҵ�� �ڽ� �޼ҵ尡 ������ �� �ڽ��� �޼ҵ�� ������ �Ǵ� ��
//* �����ε�: ������ �޼ҵ尡 ���� �� ���ǰ����� ��
          //��, ���� �μ��� �޶�� ��(�����Ķ��Ÿ)*//