public class ����� extends �ؾ 
{
	private int ���Ʋ;  // �ؾ�Ʋ, ����, ��, show(), �����() �� ���� ���
	private int ���;
	public void show() // if(��ӵ� �޼ҵ� = �ڽ��� �޼ҵ�) -> �ڽ��� �޼ҵ尡 �����(������;overriding)
	{
		System.out.println(���Ʋ);
	}
	public void �����2() 
	{
		���Ʋ = ���� + ��� + ����;
	}
	public �����() 
	{
		System.out.println("�ȳ� �����(�ڽ�)");
	}
	public �����(int ���, int ����) 
	{
		this.��� = ���;
		this.���� = ����;
	}
}
