package a20_7_01;

public class aTest1 {
	public static void main(String[] args) {
		int a,b,c,d,e,max,min;
		a=10;b=20;c=40;d=45;e=80;
		max=min=a;
		if(b>max) max=b; 
		if(c>max) max=c; 
		if(d>max) max=d; 
		if(e>max) max=e; 
			System.out.println("최대값 = "+max);
		if(b<min) min=b;
		if(c<min) min=c;
		if(d<min) min=d;
		if(e<min) min=e;
			System.out.println("최소값 = "+min);
		
	}

}
