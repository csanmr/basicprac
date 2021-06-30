/*
 *  static : class method
 *  non static : instance method
 * 
 * */
class Print{
	//Print��� Ŭ������ �޼ҵ� grouping
	public String delimiter;
	//�޼ҵ尡 instance�� �Ҽ��� ���� static�� �������.
	//�޼ҵ尡 class�� �Ҽ��� ���� static�� �־����.
	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
	public static void c(String delimiter) {
        System.out.println(delimiter);
        System.out.println("b");
        System.out.println("b");
    }
}
public class staticMethod {
	public static void main(String[] args) {
//		Print.a("-"); // a�� �ι� ���
//		Print.b("-"); // b�� �ι� ���
		//���� �ΰ��� �ڵ带 �ٲٸ�
			//t1, t2���� �͵��� Print��� Ŭ������ instance�����.
		Print t1 = new Print();
		t1.delimiter = "-";
		t1.a();
		t1.b();
		//Print.a(); �̰��� ���� ����
		//a�� class�� �Ҽ��� �ƴ϶� instance�� �Ҽ��̱� ����.
		Print.c("$");
		
		
//		Print.a("*"); // a�� �ι� ���
//		Print.b("*"); // b�� �ι� ���
		Print t2 = new Print();
		t2.delimiter = "*";
		t2.a();
		t2.b();
	}
}
