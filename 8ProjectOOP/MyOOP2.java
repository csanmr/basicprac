//MyOOP를 클래스를 사용해서 변경
public class MyOOP2 {
	public static void main(String args[]) {
		/*
		 * 인스턴스 사용하는 것으로 바꿈
		Print.delimiter="----";
		//.. 1억줄 상상
		Print.A();
		Print.A();
		//1억
		Print.B();
		Print.B();
		
		Print.delimiter="****";
		Print.A();
		Print.A();
		Print.B();
		Print.B();
		*/
		
		//인스턴스를 사용
		Print p1=new Print();
		p1.delimiter="*++*";
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		Print p2=new Print();
		p2.delimiter="-++-";
		p2.A();
		p2.A();
		p2.B();
		p2.B();
	}
	
}
