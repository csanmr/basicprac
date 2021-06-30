
public class IfApp {

	public static void main(String[] args) {
		//조건문
		/*
		System.out.println("a");
		if(false) {
			System.out.println(1);
		} else {
			if(true) {
				System.out.println(2);
			} else {
				System.out.println(3);
			}
		}
		*/
		//위의 코드를 더 간단화시키면
		if(false) {
				System.out.println(1);	
		} else if(true) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}

		System.out.println("b");
		
		
	}

}
