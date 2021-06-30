class Greeting{
	//public, protected, default, private
	public static void hi() {
		System.out.println("Hi.");
	}
}
public class AccessLevelModifiersMethod {
	public static void main(String[] args) {
		//
		Greeting.hi();
		
		/*
		 * 접근제어자
		 * public :  어떤 클래스에서라도
		 * protected : 동일 패키지내의 클래스 또는 해당 클래스를 상속받은 외부 패키지의 클래스에서
		 * private : 같은 클래스 안에서
		 * default : 해당 패키지 내에서만
		 * 사용 가능.
		 * 
		 * */
	}

}
