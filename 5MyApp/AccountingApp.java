
public class AccountingApp {
	public static void main(String[] args) {
		//강의 2 단순계산
		/*
		System.out.println("Value of supply : "+12345.0);
		System.out.println("VAT : "+ (12345.0*0.1) );
		System.out.println("Total : "+(12345.0+12345.0*0.1));
		System.out.println("Expense : "+ (12345.0*0.3) );
		System.out.println("Income : "+ (12345.0-12345.0*0.3) );
		System.out.println("Dividend : "+ (12345.0-12345.0*0.3) * 0.5 );
		System.out.println("Dividend : "+ (12345.0-12345.0*0.3) * 0.3 );
		System.out.println("Dividend : "+ (12345.0-12345.0*0.3) * 0.2 );
		*/
		//강의 3 변수 사용
		/*
		double valueofSupply = 12345.0;
		double vatRate = 0.1;
		double expenseRate=0.3;
		double vat = valueofSupply*vatRate;
		double total = valueofSupply+vat;
		double expense = valueofSupply*expenseRate;
		double income = valueofSupply-expense;
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;
		
		System.out.println("Value of supply : "+valueofSupply);
		System.out.println("VAT : "+ vat );
		System.out.println("Total : "+total);
		System.out.println("Expense : "+ expense );
		System.out.println("Income : "+ income );
		System.out.println("Dividend1 : "+ dividend1 );
		System.out.println("Dividend2 : "+ dividend2 );
		System.out.println("Dividend3 : "+ dividend3 );
		*/
		//강의4 입력값 도입
		double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;
        double dividend1 = income * 0.5;
        double dividend2 = income * 0.3;
        double dividend3 = income * 0.2;
 
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
