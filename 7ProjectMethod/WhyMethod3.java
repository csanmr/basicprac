import java.io.FileWriter;
import java.io.IOException;
//�޼ҵ� ����6
public class WhyMethod3 {
	//WhyMethod2�� �����ؼ� ����
	public static void main(String[] args) throws IOException {
		//������ �ڵ带 �׷����ϴ� ���
		 // 100000000 1�ﰳ�� �ڵ尡 �ִٰ� �ش������� ����ϴ� ��.
        printTwoTimes("a", "-"); //��ȣ���� ���� ���� �����ϰ� ����
        System.out.println(twoTimes("a", "-")); //���� �ڵ�� ������ ���ӻ��� ����
        // 100000000
        writeFileTwoTimes("a", "*");
        
        FileWriter fw = new FileWriter("out.txt"); //�̷������� ����
        fw.write(twoTimes("a", "*"));
        fw.close();
        // Email.send("egoing@a.com", "two times a", twoTimes("a", "&"));
        // EMail�̶�� �޼ҵ�� ������ �ִٰ� ����ϸ�..
        
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
