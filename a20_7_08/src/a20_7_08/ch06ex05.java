package a20_7_08;
public class ch06ex05 
{
	public static void main(String[] args) 
	{
		int a[][]= {{99,88,77},{67,89,54},{99,30,100},{0,0,0}};
		int i,j;
		int sum=0;
		System.out.println("번호\t국어\t수학\t영어\t합계");
		for(i=0;i<a.length-1;i++) 
		{
			sum=0;
			System.out.print((i+1)+"\t");
			for(j=0;j<a[i].length;j++) 
			{
				System.out.print(a[i][j]+"\t");
				sum=sum+a[i][j];
				a[3][j]=a[3][j]+a[i][j];
			}System.out.println(sum);
		}System.out.print("합계\t");
		for(j=0;j<3;j++) 
		{
			System.out.print(a[3][j]+"\t");
		}
	}
}
