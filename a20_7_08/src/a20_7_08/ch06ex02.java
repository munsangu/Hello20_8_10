package a20_7_08;
public class ch06ex02 
{
	public static void main(String[] args) 
	{
		int a[]= {90,88,77,67,89,54,99,30};
		int len=a.length;
		int i=0, max, min;
	    max=min=a[0];
	    for(i=1;i<len;i++) 
	    {
	    	if(a[i]>max)max=a[i];
	    	if(a[i]<min)min=a[i];
	    }
	    System.out.println("최대값 = "+max);
	    System.out.println("최소값 = "+min);
	}
}
