import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod2 {
	//WhyMethod�� �����ؼ� �Է��ϴ� ���� �ް� ����
	public static void main(String[] args) {
		//������ �ڵ带 �׷����ϴ� ���
		 // 100000000 1�ﰳ�� �ڵ尡 �ִٰ� �ش������� ����ϴ� ��.
        printTwoTimes("a", "-"); //��ȣ���� ���� ���� �����ϰ� ����
        // 100000000
        printTwoTimes("a", "*");
        // 100000000
        printTwoTimes("b", "&");
        			 //�� ���� ����(argument)
        printTwoTimes("b", "!");
	}
									// �� ���� �Ű����� (parameter)
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
