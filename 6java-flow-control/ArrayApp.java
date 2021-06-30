
public class ArrayApp {

	public static void main(String[] args) {
		//배열
		//회원 egoing jinhuck youbin 이 있다고 치자.
		//String users="egoing, jinhuck, youbin";
		String[] users=new String[3];
		users[0]="egoing";
		users[1]="jinhuck";
		users[2]="youbin";
		//배열을 사용하면 사용하기 유용하다.
		System.out.println(users[2]);
		System.out.println(users.length);
		
		//배열을 만들 때 값을 넣어서 만드는 방법 10, 100, 100이런 것들은 element라고함
		int[] scores= {10, 100, 100};
		System.out.println(scores[1]);
		System.out.println(scores.length);
	}
}
