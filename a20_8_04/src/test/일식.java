package test;
public class �Ͻ� 
{
	protected int x,y;
	protected int ��ġ;
	protected int ����;
	protected int �췰;
	protected int ����;
	protected int �׸�;
	public �Ͻ�() { }
	public �Ͻ�(int �췰, int ����) 
	{
		this.�췰=�췰;
		this.����=����;
	}
	public �Ͻ�(Object obj) 
	{
		if(obj instanceof �߽�) 
		{�߽� ch=(�߽�) obj; ch.��ä(); ch.¥���();}
		else if(obj instanceof �ѽ�) 
		{�ѽ� han = (�ѽ�) obj; han.�����(100);}
	}
	void ȸ����() 
	{
		�׸� = �췰+����+����;
	}
	void �ʹ�(int ��) 
	{
		�׸� = �� +�췰+��ġ+����;
	}
	void show() 
	{
		System.out.println(�׸�);
	}
}
