
public class ArrayApp {

	public static void main(String[] args) {
		//�迭
		//ȸ�� egoing jinhuck youbin �� �ִٰ� ġ��.
		//String users="egoing, jinhuck, youbin";
		String[] users=new String[3];
		users[0]="egoing";
		users[1]="jinhuck";
		users[2]="youbin";
		//�迭�� ����ϸ� ����ϱ� �����ϴ�.
		System.out.println(users[2]);
		System.out.println(users.length);
		
		//�迭�� ���� �� ���� �־ ����� ��� 10, 100, 100�̷� �͵��� element�����
		int[] scores= {10, 100, 100};
		System.out.println(scores[1]);
		System.out.println(scores.length);
	}
}
