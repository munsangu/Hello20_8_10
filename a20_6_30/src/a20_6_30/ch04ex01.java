package a20_6_30;
import java.util.Scanner;
// 이름(name), 국어(kor), 수학(mat), 영어(eng)입력받아서 총점(tot)와 평균(avg)구하기
//평균이 60점 이상이고 모든 과목이 40점이상이면 "합격" 아니면 "불합격"
//평균이 60점 미만이거나 한과목이라도 40점 미만이면 "불합격" 아니면 "합격"
public class ch04ex01 {
	public static void main(String[] args) {
		String name;
		int kor, mat, eng, tot;
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name=sc.next();
		
		System.out.println("국어 수학 영어 점수를 입력하세요");
		kor=sc.nextInt();
		mat=sc.nextInt();
		eng=sc.nextInt();
		
		tot=kor+mat+eng;
		avg=tot/3.;    // avg = tot/3 -> 정확도가 떨어지므로 실수로 바꿔야 함 -> double 선언 
		if(avg>=60&&kor>=40&&mat>=40&&eng>=40)System.out.println("합격");
		else System.out.println("불합격");
		System.out.println("계산 완료");
	}

}
