import java.io.FileWriter;
import java.io.IOException;
//메소드 강의6
public class WhyMethod3 {
	//WhyMethod2를 복사해서 변형
	public static void main(String[] args) throws IOException {
		//연관된 코드를 그룹핑하는 방법
		 // 100000000 1억개의 코드가 있다고 극단적으로 상상하는 줄.
        printTwoTimes("a", "-"); //괄호안의 값에 따라 반응하게 변형
        System.out.println(twoTimes("a", "-")); //위의 코드와 같지만 쓰임새가 많음
        // 100000000
        writeFileTwoTimes("a", "*");
        
        FileWriter fw = new FileWriter("out.txt"); //이런식으로 쓰임
        fw.write(twoTimes("a", "*"));
        fw.close();
        // Email.send("egoing@a.com", "two times a", twoTimes("a", "&"));
        // EMail이라는 메소드는 없지만 있다고 상상하면..
        
        // 100000000
        printTwoTimes("b", "&");
        printTwoTimes("b", "!");
	}
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out+delimiter+"\n";
		out = out+text+"\n";
		out = out+text+"\n";
		
		return out;
	}
									// 이 안은 매개변수 (parameter)
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
	}
	
	public static void writeFileTwoTimes(String text, String delimiter) throws IOException {
		FileWriter fw= new FileWriter("output.txt");
		System.out.println(delimiter+"\n");
        System.out.println(text+"\n");
        System.out.println(text+"\n");
        fw.close();
	}

}
