import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		//�ٸ� ����� �������� Ŭ������ �ν��Ͻ�
		//Math��� Ŭ������ pi��� ����, floor,ceil�� ���� �޼ҵ嵵 ����.
		
		// class : System, Math, FileWriter
		// instance : f1, f2
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));
		
		//Hello�� java�� ���� txt���� ����
		//f1�̶�� ������ ���� ������ ����
		FileWriter f1=new FileWriter("data.txt");
		f1.write("Hello");
		f1.write("java");
		f1.close();
		//f1���� �ٸ� ������
		FileWriter f2=new FileWriter("data2.txt");
		f2.write("Hello2");
		f2.write("java2");
		f2.close();
	}

}
