package a20_7_13;
public class Rank 
{
	int kor, mat, eng;
	int tot=0;
	double avg=0;
    char ����;
    void hap() 
    {
    	tot = kor + mat + eng;
    }
    void average() 
    {
    	avg=tot/3.0;
    }
    void rank() 
    {
    	if(avg>=90) ����='A';
    	else if(avg>=80) ����='B';
    	else if(avg>=70) ����='C';
    	else if(avg>=60) ����='D';
    	else ����='F';
    }
    void show() 
    {
    	System.out.println("����, ����, ������ �հ� = "+tot+"��");
    	System.out.println("����, ����, ������ ��� = "+avg+"��");
    	System.out.println(����+"����");
    }
}



