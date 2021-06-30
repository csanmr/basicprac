
public class OutputMethod {

	public static String a() {
		//...
		return "a";
	}
				  //메소드는 리턴값의 형태를 정해줘야한다. String, int, void(없음) 등.
	public static int one() {
		return 1; //리턴 값은 그 메소드의 값이 되고 메소드가 끝나는 지점이다.
	}
	
	public static void main(String[] args) {
		System.out.println(a()); //a
		System.out.println(one()); //1
	}

}
