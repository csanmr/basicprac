import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod2 {
	//WhyMethod를 복사해서 입력하는 값을 받게 변형
	public static void main(String[] args) {
		//연관된 코드를 그룹핑하는 방법
		 // 100000000 1억개의 코드가 있다고 극단적으로 상상하는 줄.
        printTwoTimes("a", "-"); //괄호안의 값에 따라 반응하게 변형
        // 100000000
        printTwoTimes("a", "*");
        // 100000000
        printTwoTimes("b", "&");
        			 //이 안은 인자(argument)
        printTwoTimes("b", "!");
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
