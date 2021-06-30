
public class WhyMethod {
	public static void printTwoTimesA() {
		System.out.println("-");
        System.out.println("A");
        System.out.println("A");
	}

	public static void main(String[] args) {
		//연관된 코드를 그룹핑하는 방법
		 // 100000000 1억개의 코드가 있다고 극단적으로 상상하는 줄.
        printTwoTimesA(); // 아래의 3줄의 결과를 메소드를 사용해서 나오게
        // 100000000
        printTwoTimesB();
        // 100000000
        printTwoTimesA();
	}

	public static void printTwoTimesB() {
		//리팩터를 사용해서 자동으로 만든 메소드
		System.out.println("-");
        System.out.println("B");
        System.out.println("B");
	}

}
