
public class WhyMethod {
	public static void printTwoTimesA() {
		System.out.println("-");
        System.out.println("A");
        System.out.println("A");
	}

	public static void main(String[] args) {
		//������ �ڵ带 �׷����ϴ� ���
		 // 100000000 1�ﰳ�� �ڵ尡 �ִٰ� �ش������� ����ϴ� ��.
        printTwoTimesA(); // �Ʒ��� 3���� ����� �޼ҵ带 ����ؼ� ������
        // 100000000
        printTwoTimesB();
        // 100000000
        printTwoTimesA();
	}

	public static void printTwoTimesB() {
		//�����͸� ����ؼ� �ڵ����� ���� �޼ҵ�
		System.out.println("-");
        System.out.println("B");
        System.out.println("B");
	}

}
