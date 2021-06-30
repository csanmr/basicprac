
public class AccountingApp {
	// 공급가액
    public static double valueOfSupply = 10000.0;
    
    // 부가가치세율
    public static double vatRate = 0.1;
    //부가세
    public static double getVAT() {
        return valueOfSupply * vatRate;
    }
    //합계
    public static double getTotal() {
        return valueOfSupply + getVAT();
    }
 
    public static void main(String[] args) {
    	//double vat = valueOfSupply * vatRate; => double vat = getVAT();
    	//double total = valueOfSupply + vat; => double total = getTotal();
    	
        System.out.println("Value of supply : " + valueOfSupply);
        //System.out.println("VAT : " + vat); 메소드를 사용해서 아래의 코드로 변화
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + getTotal());
 
    }

}
