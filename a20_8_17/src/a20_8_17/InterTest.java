package a20_8_17;
public interface InterTest   
{
	public static final int r=1, g=2, b=3;     // ������� public static final ������ ����
	public abstract void draw();    // ����޼ҵ�� public abstract (�߻�޼ҵ�)  ������ ����	
}
// �������̽���, Ŭ������ �����ϰ� ��������� ����޼ҵ�� ������ ����
// �ڹٴ� ���ϻ�Ӹ� ����, �̷� ������ �����ϱ� ���� �������̽��� ����
// �������̽� �ڽ�Ŭ�������� ������ִ� ���Ҹ� ��.
// �����δ� new�� ���� ���� ����
// �������̽� ������� public static final ����
// �������̽� ����޼ҵ� public abstract ���� (���� ����, �ڽ��� �������̵��Ͽ� ����ؾ� ��)
// Class A{} 
// Class B{}
// Class C extends A,B{} (x) extends �ڿ��� ģ�θ�(Ŭ����) 1���� 
// Class D extends B{}	(o)
// interface X{}
// interface P{}
// Class Y extends X{}	(x) ���� ����
// Class Y implements X{}	(o)
// Class Z extends A implements X {} (o)
// Class Z extends A,B implements X {} (X)
// Class Z extends A implements X,P{}	(O)