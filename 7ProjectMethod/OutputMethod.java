
public class OutputMethod {

	public static String a() {
		//...
		return "a";
	}
				  //�޼ҵ�� ���ϰ��� ���¸� ��������Ѵ�. String, int, void(����) ��.
	public static int one() {
		return 1; //���� ���� �� �޼ҵ��� ���� �ǰ� �޼ҵ尡 ������ �����̴�.
	}
	
	public static void main(String[] args) {
		System.out.println(a()); //a
		System.out.println(one()); //1
	}

}
