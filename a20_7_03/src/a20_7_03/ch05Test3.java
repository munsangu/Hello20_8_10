package a20_7_03;
//������ 3�ܾ� 3��
public class ch05Test3 
{
	public static void main(String[] args) 
	{
		int l, n;
		for(l=1;l<=7;l+=3) 
		{
			for(n=1;n<=9;n++) 
			{
			 System.out.print(l+"*"+n+"="+(l*n)+'\t');
			 System.out.print((l+1)+"*"+n+"="+((l+1)*n)+'\t');
			 System.out.println((l+2)+"*"+n+"="+((l+2)*n));
			}System.out.println();
		}
	}
}
