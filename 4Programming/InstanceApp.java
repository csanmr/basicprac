import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws FileNotFoundException {
		//PrintWriter라는 클래스를 이용 p1은 PrintWirter라는 클래스의 인스턴스가 들어감
		PrintWriter p1=new PrintWriter("result1.txt");
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2=new PrintWriter("result2.txt");
		p2.write("Hello 1");
		p2.close();
		
		System.out.println(p1.toString());
        p2.toString();
        p2.write("Hello 2");
	}

}
