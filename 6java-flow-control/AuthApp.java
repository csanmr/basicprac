
public class AuthApp {

	public static void main(String[] args) {
		//����2 == �� equals id ���� ��
		System.out.println(args[0]);
		
		String id="egoing";
		String inputId=args[0];
		//����3 ��й�ȣ �߰�
		String pass="1111";
		String inputPass=args[1];
		
		System.out.println("Hi.");
		
		if(inputId==id) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}
		//Who are you�� ����
		
		if(inputId.equals(id)) {
			if(inputPass.equals(args[1])) {
				System.out.println("Master2!");
			} else {
				System.out.println("Wrong password");
			}
		} else {
			System.out.println("Who are you2?");
		}
		//Master2! �� ����
		
		//���� �ڵ带 �����ؼ� �ܼ�ȭ
		if(inputId.equals(id) && inputPass.equals(args[1])) {
			System.out.println("Master3!");
		} else {
			System.out.println("Who are you3?");
		}
		
	}

}
