
public class BooleanApp {

	public static void main(String[] args) {
		System.out.println("One"); //string
		System.out.println(1);//integer
		
		System.out.println(true); //boolean
		System.out.println(false); //boolean
		
		String foo="Hello World";
		//String true="Hello World";
		//reserved word( true, false 와 같이 이미 사용이 약속되어있는 단어 )
		System.out.println(foo.contains("World")); //true World가 있기때문
		System.out.println(foo.contains("egoing")); //false egoing이 없음
	}

}
