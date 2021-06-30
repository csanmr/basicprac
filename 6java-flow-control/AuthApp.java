
public class AuthApp {

	public static void main(String[] args) {
		//강의2 == 과 equals id 값만 비교
		System.out.println(args[0]);
		
		String id="egoing";
		String inputId=args[0];
		//강의3 비밀번호 추가
		String pass="1111";
		String inputPass=args[1];
		
		System.out.println("Hi.");
		
		if(inputId==id) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}
		//Who are you가 나옴
		
		if(inputId.equals(id)) {
			if(inputPass.equals(args[1])) {
				System.out.println("Master2!");
			} else {
				System.out.println("Wrong password");
			}
		} else {
			System.out.println("Who are you2?");
		}
		//Master2! 가 나옴
		
		//위의 코드를 응용해서 단순화
		if(inputId.equals(id) && inputPass.equals(args[1])) {
			System.out.println("Master3!");
		} else {
			System.out.println("Who are you3?");
		}
		
	}

}
