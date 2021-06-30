import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		//다른 사람이 만들어놓은 클래스와 인스턴스
		//Math라는 클래스에 pi라는 변수, floor,ceil과 같은 메소드도 있음.
		
		// class : System, Math, FileWriter
		// instance : f1, f2
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));
		
		//Hello와 java가 적힌 txt파일 생성
		//f1이라는 변수에 담기는 복제본 생성
		FileWriter f1=new FileWriter("data.txt");
		f1.write("Hello");
		f1.write("java");
		f1.close();
		//f1과는 다른 복제본
		FileWriter f2=new FileWriter("data2.txt");
		f2.write("Hello2");
		f2.write("java2");
		f2.close();
	}

}
