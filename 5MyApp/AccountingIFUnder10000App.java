
public class AccountingIFUnder10000App {
	public static void main(String[] args) {
		//강의6 조건문
		double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;
        double dividend1 = income * 1;
        double dividend2 = income * 0;
        double dividend3 = income * 0;
 
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);
        System.out.println("Dividend 1 : " + dividend1);
        System.out.println("Dividend 2 : " + dividend2);
        System.out.println("Dividend 3 : " + dividend3);
		
        //혹시 다른 컴퓨터에서 사용하고싶은데 그 컴퓨터에 자바가 없다?
        //launch4j와 같은 소프트웨어를 사용해야함.
	}

}
