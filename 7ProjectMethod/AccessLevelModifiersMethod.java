class Greeting{
	//public, protected, default, private
	public static void hi() {
		System.out.println("Hi.");
	}
}
public class AccessLevelModifiersMethod {
	public static void main(String[] args) {
		//
		Greeting.hi();
		
		/*
		 * ����������
		 * public :  � Ŭ����������
		 * protected : ���� ��Ű������ Ŭ���� �Ǵ� �ش� Ŭ������ ��ӹ��� �ܺ� ��Ű���� Ŭ��������
		 * private : ���� Ŭ���� �ȿ���
		 * default : �ش� ��Ű�� ��������
		 * ��� ����.
		 * 
		 * */
	}

}
