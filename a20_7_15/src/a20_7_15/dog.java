package a20_7_15;

public class dog 
{
	private String name;
	private int age;
		public void show() 
		{
			System.out.println("강아지 이름 = "+name);
			System.out.println("강아지 나이 = "+age);
		}
		public void setName(String name) 
		{
			this.name = name;
		}
		public void setAge(int age) 
		{
			this.age = age;
		}
		// 생성자(Construtor) 메소드 만들기 -> 값을 초기화 
		public dog() 			// 디폴트 생성자메소드
		{
			name=null;
			age=0;
		}
		public dog(String name) // 한개짜리<()안에 있는 것의 갯수> 생성자메소드
		{
			this.name=name;
		}
		public dog(String name, int age) // 두개짜리<()안에 있는 것의 갯수> 생성자메소드
		{
			this.name=name;
			this.age=age;
		}
}
