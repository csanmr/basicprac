//MyOOP�� Ŭ������ ����ؼ� ����
public class MyOOP2 {
	public static void main(String args[]) {
		/*
		 * �ν��Ͻ� ����ϴ� ������ �ٲ�
		Print.delimiter="----";
		//.. 1���� ���
		Print.A();
		Print.A();
		//1��
		Print.B();
		Print.B();
		
		Print.delimiter="****";
		Print.A();
		Print.A();
		Print.B();
		Print.B();
		*/
		
		//�ν��Ͻ��� ���
		Print p1=new Print();
		p1.delimiter="*++*";
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		Print p2=new Print();
		p2.delimiter="-++-";
		p2.A();
		p2.A();
		p2.B();
		p2.B();
	}
	
}
