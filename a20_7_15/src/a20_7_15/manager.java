package a20_7_15;
public class manager 
{
	private String name;						   // 멤버 변수
	private int sal;							   
	private String dep;        
		public manager() 
		{
			this.name=null;
			this.sal=0;
			this.dep=null;
		}
		public void show() 						   // 멤버 메소드
		{
			System.out.println("매니저 명 = "+name);
			System.out.println("연봉 = "+sal);
			System.out.println("부서명 = "+dep);
		}
		public void show(String man) 			   // 오버로딩(overloading): 이름이 동일한 메소드를 2개 이상 가지는 것
		{										   //   단, 100% 일치하는 것은 안됨. show(), show(String name)
			System.out.println(man+"명 = "+name);
			System.out.println(man+"연봉 = "+sal);
			System.out.println(man+"부서 = "+dep);
		}
		public void setName(String name) 		   
		{
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public int getSal() {
			return sal;
		}
		public String getDep() {
			return dep;
		}
		public void setSal(int sal) 			
		{
			this.sal = sal;
		}
		public void setDep(String dep) 		       
		{
			this.dep = dep;
		}
}
