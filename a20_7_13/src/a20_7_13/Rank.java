package a20_7_13;
public class Rank 
{
	int kor, mat, eng;
	int tot=0;
	double avg=0;
    char 학점;
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
    	if(avg>=90) 학점='A';
    	else if(avg>=80) 학점='B';
    	else if(avg>=70) 학점='C';
    	else if(avg>=60) 학점='D';
    	else 학점='F';
    }
    void show() 
    {
    	System.out.println("국어, 수학, 영어의 합계 = "+tot+"점");
    	System.out.println("국어, 수학, 영어의 평균 = "+avg+"점");
    	System.out.println(학점+"학점");
    }
}



