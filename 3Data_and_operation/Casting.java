
public class Casting {

	public static void main(String[] args) {
		//Casting 데이터 타입의 변화
		double a=1.1;
		double b=1;
		double b2=(double)1; //위의 것과 같은 것이란 걸 알게된다.
		System.out.println(b);
		
		//int c= 1.1; 에러 double형이 int타입으로 바꿔지지않음
		//Casting의 사용
		double d = 1.1;
		int e = (int) 1.1;
		System.out.println(e); // 1 -> 0.1을 잃어버림
		
		// 1 to String
		//검색 java int to string casting
		String f=Integer.toString(1); 
		System.out.println(f); //1 (String type)
		System.out.println(f.getClass()); //class java.lang.String
	}

}
