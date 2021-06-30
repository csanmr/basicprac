
public class EqualsApp {

	public static void main(String[] args) {
		int p1=1;
		int p2=1;
		System.out.println(p1==p2); // true
		//원시데이터는 같은 값은 같은 id를 가진다.
		String o1="java";
		String o2=new String("java"); // new는 새로운 객체를 만드는 것
		System.out.println(o1==o2); // false
		System.out.println(o1.equals(o2));// true
		//원시데이터타입이 아닌 객체들은 equals라는 메소드를 가지고있다.
		
		String o3="java2";
		String o4="java2";
		System.out.println(o3==o4); //true String은 원시데이터 취급을 받는다.
		// ==은 같은 위치를 가르키고있는지 (id값)
		// equals는 들어있는 내용이 같은지 그래서 o1.equals(o2)가 true인것
	}
}
