//생성자와 this  MyOOP3에서 넘어옴
//this는 클래스가 인스턴스화 되었을 때 생성된 인스턴스를 가리킨다.
public class MyOOP3 {
	public static void main(String args[]) {

		//인스턴스를 사용
		Print2 p1=new Print2("----");
		//p1.delimiter="*++*";
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		Print2 p2=new Print2("+-+-");
		//p2.delimiter="-++-";
		p2.A();
		p2.A();
		p2.B();
		p2.B();
	}
	
}
