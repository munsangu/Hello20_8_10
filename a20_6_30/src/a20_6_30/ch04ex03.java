package a20_6_30;
// ����� ���ϰ�, ����� 90�̻��̸� "A����"
// ����� 80�� �̻��̸� "B����", ����� 70�� �̻��̸� "C����",����� 60�� �̻��̸� "D����",�׿� ���� "F����"
public class ch04ex03 {
	public static void main(String[] args) {
		int kor=100, mat=60,eng=55;
		int avg;
		avg  = (kor+mat+eng)/3;
		switch (avg/10) {
			case 10:
			case 9:
				System.out.println("A����");
				break;
			case 8:
				System.out.println("B����");
				break;
			case 7:
				System.out.println("C����");
				break;
			case 6:
				System.out.println("D����");
				break;
			default:
				System.out.println("F����");
			break;
		}
	}
}
