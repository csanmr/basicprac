
public class EqualsApp {

	public static void main(String[] args) {
		int p1=1;
		int p2=1;
		System.out.println(p1==p2); // true
		//���õ����ʹ� ���� ���� ���� id�� ������.
		String o1="java";
		String o2=new String("java"); // new�� ���ο� ��ü�� ����� ��
		System.out.println(o1==o2); // false
		System.out.println(o1.equals(o2));// true
		//���õ�����Ÿ���� �ƴ� ��ü���� equals��� �޼ҵ带 �������ִ�.
		
		String o3="java2";
		String o4="java2";
		System.out.println(o3==o4); //true String�� ���õ����� ����� �޴´�.
		// ==�� ���� ��ġ�� ����Ű���ִ��� (id��)
		// equals�� ����ִ� ������ ������ �׷��� o1.equals(o2)�� true�ΰ�
	}
}
