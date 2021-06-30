
public class MyOOP {
	
	public static void main(String args[]) {
		delimiter="----";
		//.. 1억줄 상상
		printA();
		printA();
		//1억
		printB();
		printB();
		
		delimiter="****";
		printA();
		printA();
		printB();
		printB();
	}
	public static String delimiter="";
	public static void printA() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public static void printB() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}
