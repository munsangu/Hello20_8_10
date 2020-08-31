package a20_7_15;
// setter : 값을 전달하여 멤버변수에 갑승ㄹ 저장하기 위한 용도
// 생성자   메소드  : 생성시(new - )에 값을 초기화 하기 위한 용도
//              클래스명과 동일한 메소드명이고, 리턴값 자체가 없음(void가 없음) ex) public dog(){}
public class mainTest 
{
	public static void main(String[] args) 
	{
	Employee kim = new Employee();
	kim.setName("홍길동");
	kim.setSal(3000);
	kim.show();
	System.out.println("=====================================");
	manager lee = new manager();
	lee.setName("이민호");
	lee.setSal(5000);
	lee.setDep("홍보부");
	lee.show();
	System.out.println("=====================================");
	lee.show("연예인");
	System.out.println("=====================================");
	dog happy = new dog("몽키",2);
	happy.show();
	System.out.println("=====================================");
	dog Choi = new dog();
	Choi.setName("쫑");
	Choi.setAge(1);
	Choi.show();
	}
}