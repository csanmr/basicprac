class Accounting2 {
	//강의11 인스턴스 강의에서는 AccountingClassApp.java를 개선시키지만 나는 분류를 위해 새로생성 instance를 사용하기위해 static을 지움
		public double valueOfSupply;
	    public double vatRate;
		public double expenseRate;
		
		public void print() {
			System.out.println("Value of supply : " + valueOfSupply);
	        System.out.println("VAT : " + getVAT());
	        System.out.println("Total : " + getTotal());
	        System.out.println("Expense : " + getExpense());
	        System.out.println("Income : " + getIncome());
	        System.out.println("Dividend 1 : " + getDividend1());
	        System.out.println("Dividend 2 : " + getDividend2());
	        System.out.println("Dividend 3 : " + getDividend3());
		}

		public double getDividend1() {
			return getIncome() * 0.5;
		}
		public double getDividend2() {
			return getIncome() * 0.3;
		}
		public double getDividend3() {
			return getIncome() * 0.2;
		}

		public double getIncome() {
			return valueOfSupply - getExpense();
		}

		public double getExpense() {
			return valueOfSupply * expenseRate;
		}

		public double getTotal() {
			return valueOfSupply + getVAT();
		}

		public double getVAT() {
			return valueOfSupply * vatRate;
		}
}
class Accounting3 {
	// instance를 사용함으로 이처럼 클래스를 복사하는 등의 비효율을 막음.
		public double valueOfSupply;
	    public double vatRate;
		public double expenseRate;
		
		public void print() {
			System.out.println("Value of supply : " + valueOfSupply);
	        System.out.println("VAT : " + getVAT());
	        System.out.println("Total : " + getTotal());
	        System.out.println("Expense : " + getExpense());
	        System.out.println("Income : " + getIncome());
	        System.out.println("Dividend 1 : " + getDividend1());
	        System.out.println("Dividend 2 : " + getDividend2());
	        System.out.println("Dividend 3 : " + getDividend3());
		}

		public double getDividend1() {
			return getIncome() * 0.5;
		}
		public double getDividend2() {
			return getIncome() * 0.3;
		}
		public double getDividend3() {
			return getIncome() * 0.2;
		}

		public double getIncome() {
			return valueOfSupply - getExpense();
		}

		public double getExpense() {
			return valueOfSupply * expenseRate;
		}

		public double getTotal() {
			return valueOfSupply + getVAT();
		}

		public double getVAT() {
			return valueOfSupply * vatRate;
		}
}

public class AccountingInstanceApp {
	
    
	public static void main(String[] args) {
		//instance를 사용하기 때문에 불필요해서 주석
//		Accounting2.valueOfSupply = 10000.0;
//		Accounting2.vatRate = 0.1;
//        Accounting2.expenseRate = 0.3;
//        //...수십수백개의 메소드가 있다고 상상 그러다 어떠한 물건은 다른 나라에서 들어와서 세율등이 다르다고 치면
//        Accounting2.print();
//        
		
        //클래스를 위에 복사해서 만들어서 accounting3을 만들어서 사용을 하면 비효율
//        Accounting3.valueOfSupply = 20000.0;
//		Accounting3.vatRate = 0.05;
//        Accounting3.expenseRate = 0.2;
//        Accounting3.print();
        
        //그래서 instance(class복제와 같음)를 사용
        Accounting2 a1=new Accounting2();
        a1.valueOfSupply=10000.0;
        a1.vatRate=0.1;
        a1.expenseRate=0.3;
        
        a1.print();
	}

}
