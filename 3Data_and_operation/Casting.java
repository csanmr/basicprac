
public class Casting {

	public static void main(String[] args) {
		//Casting ������ Ÿ���� ��ȭ
		double a=1.1;
		double b=1;
		double b2=(double)1; //���� �Ͱ� ���� ���̶� �� �˰Եȴ�.
		System.out.println(b);
		
		//int c= 1.1; ���� double���� intŸ������ �ٲ���������
		//Casting�� ���
		double d = 1.1;
		int e = (int) 1.1;
		System.out.println(e); // 1 -> 0.1�� �Ҿ����
		
		// 1 to String
		//�˻� java int to string casting
		String f=Integer.toString(1); 
		System.out.println(f); //1 (String type)
		System.out.println(f.getClass()); //class java.lang.String
	}

}
