// javaMethod의 예제를 클래스와 인스턴스를 사용해서 업그레이드 해보자.
class Accounting{
    public double valueOfSupply;
    public Accounting(double valueOfSupply) {
    	this.valueOfSupply=valueOfSupply;
    }
    public static double vatRate = 0.1;
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}
public class AccountingApp {
    
    public static void main(String[] args) {
    	//인스턴스화
    	Accounting a1=new Accounting(10000.0);
    	//a1.valueOfSupply=10000.0; 위에 생성자를 만들어줘서 인스턴스를만들 때
    	//기초값을 넣게 바꿈
    	
    	Accounting a2=new Accounting(20000.0);
    	//a2.valueOfSupply=20000.0;
    	
    	System.out.println("Value of supply : " + a1.valueOfSupply);
    	System.out.println("Value of supply : " + a2.valueOfSupply);
    	
    	System.out.println("VAT : " + a1.getVAT());
    	System.out.println("VAT : " + a2.getVAT());
    	
    	System.out.println("Total : " + a1.getTotal());
    	System.out.println("Total : " + a2.getTotal());
    	//아래는 클래스화만 한 경우
//    	Accounting.valueOfSupply=10000.0;
//        System.out.println("Value of supply : " + Accounting.valueOfSupply);
//        System.out.println("VAT : " + Accounting.getVAT());
//        System.out.println("Total : " + Accounting.getTotal());
//        // 아래의 상황처럼 계속 필요한 것이 바뀌게되면 인스턴스화가 필요하다.(위로)
//        Accounting.valueOfSupply=20000.0;
//        System.out.println("Value of supply : " + Accounting.valueOfSupply);
//        Accounting.valueOfSupply=10000.0;
//        System.out.println("VAT : " + Accounting.getVAT());
//        Accounting.valueOfSupply=20000.0;
//        System.out.println("Total : " + Accounting.getTotal());
        
    }
 
}