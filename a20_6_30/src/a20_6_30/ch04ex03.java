package a20_6_30;
// 평균을 구하고, 평균이 90이상이면 "A학점"
// 평균이 80점 이상이면 "B학점", 평균이 70점 이상이면 "C학점",평균이 60점 이상이면 "D학점",그외 점수 "F학점"
public class ch04ex03 {
	public static void main(String[] args) {
		int kor=100, mat=60,eng=55;
		int avg;
		avg  = (kor+mat+eng)/3;
		switch (avg/10) {
			case 10:
			case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			default:
				System.out.println("F학점");
			break;
		}
	}
}
