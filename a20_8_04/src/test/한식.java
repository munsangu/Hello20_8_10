package test;
public class �ѽ� 
{
	private int ����;
	private int ��ġ;
	private int ���;
	private int �׸�;
	public �ѽ�() {}
	void �����(int ��) 
	{
		�׸� = �� + ���� + ��ġ + ���;
	}
	void show() 
	{
		System.out.println(�׸�);
	}
	public static �ѽ� getInstance() 
	{
		return new �ѽ�();
	}
	public static void main(String[] args)
	{
		�Ͻ� ilsik = new �Ͻ�(100,50);
		�߽� jungsik = new �߽�(50,30);
		�ѽ� hansik = �ѽ�.getInstance();	

		ilsik.ȸ����();
		ilsik.show();
		System.out.println("");
		jungsik.��ä();
		jungsik.show();
		System.out.println("");
		hansik.�����(50);
		hansik.show();
		
		�Ͻ� kim = new �Ͻ�(new �ѽ�());
		�Ͻ� lee = new �Ͻ�(new �߽�());
		
	}
}
