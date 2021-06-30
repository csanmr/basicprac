class Accounting2 {
	//����11 �ν��Ͻ� ���ǿ����� AccountingClassApp.java�� ������Ű���� ���� �з��� ���� ���λ��� instance�� ����ϱ����� static�� ����
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
	// instance�� ��������� ��ó�� Ŭ������ �����ϴ� ���� ��ȿ���� ����.
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
		//instance�� ����ϱ� ������ ���ʿ��ؼ� �ּ�
//		Accounting2.valueOfSupply = 10000.0;
//		Accounting2.vatRate = 0.1;
//        Accounting2.expenseRate = 0.3;
//        //...���ʼ��鰳�� �޼ҵ尡 �ִٰ� ��� �׷��� ��� ������ �ٸ� ���󿡼� ���ͼ� �������� �ٸ��ٰ� ġ��
//        Accounting2.print();
//        
		
        //Ŭ������ ���� �����ؼ� ���� accounting3�� ���� ����� �ϸ� ��ȿ��
//        Accounting3.valueOfSupply = 20000.0;
//		Accounting3.vatRate = 0.05;
//        Accounting3.expenseRate = 0.2;
//        Accounting3.print();
        
        //�׷��� instance(class������ ����)�� ���
        Accounting2 a1=new Accounting2();
        a1.valueOfSupply=10000.0;
        a1.vatRate=0.1;
        a1.expenseRate=0.3;
        
        a1.print();
	}

}
