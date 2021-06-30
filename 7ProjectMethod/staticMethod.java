/*
 *  static : class method
 *  non static : instance method
 * 
 * */
class Print{
	//Print라는 클래스에 메소드 grouping
	public String delimiter;
	//메소드가 instance의 소속일 때는 static을 떼줘야함.
	//메소드가 class의 소속일 때는 static이 있어야함.
	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
	public static void c(String delimiter) {
        System.out.println(delimiter);
        System.out.println("b");
        System.out.println("b");
    }
}
public class staticMethod {
	public static void main(String[] args) {
//		Print.a("-"); // a를 두번 출력
//		Print.b("-"); // b를 두번 출력
		//위의 두개의 코드를 바꾸면
			//t1, t2같은 것들은 Print라는 클래스의 instance라고함.
		Print t1 = new Print();
		t1.delimiter = "-";
		t1.a();
		t1.b();
		//Print.a(); 이것은 이제 오류
		//a가 class의 소속이 아니라 instance의 소속이기 때문.
		Print.c("$");
		
		
//		Print.a("*"); // a를 두번 출력
//		Print.b("*"); // b를 두번 출력
		Print t2 = new Print();
		t2.delimiter = "*";
		t2.a();
		t2.b();
	}
}
