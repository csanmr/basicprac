// javaMethod�� ������ Ŭ������ �ν��Ͻ��� ����ؼ� ���׷��̵� �غ���.
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
    	//�ν��Ͻ�ȭ
    	Accounting a1=new Accounting(10000.0);
    	//a1.valueOfSupply=10000.0; ���� �����ڸ� ������༭ �ν��Ͻ������� ��
    	//���ʰ��� �ְ� �ٲ�
    	
    	Accounting a2=new Accounting(20000.0);
    	//a2.valueOfSupply=20000.0;
    	
    	System.out.println("Value of supply : " + a1.valueOfSupply);
    	System.out.println("Value of supply : " + a2.valueOfSupply);
    	
    	System.out.println("VAT : " + a1.getVAT());
    	System.out.println("VAT : " + a2.getVAT());
    	
    	System.out.println("Total : " + a1.getTotal());
    	System.out.println("Total : " + a2.getTotal());
    	//�Ʒ��� Ŭ����ȭ�� �� ���
//    	Accounting.valueOfSupply=10000.0;
//        System.out.println("Value of supply : " + Accounting.valueOfSupply);
//        System.out.println("VAT : " + Accounting.getVAT());
//        System.out.println("Total : " + Accounting.getTotal());
//        // �Ʒ��� ��Ȳó�� ��� �ʿ��� ���� �ٲ�ԵǸ� �ν��Ͻ�ȭ�� �ʿ��ϴ�.(����)
//        Accounting.valueOfSupply=20000.0;
//        System.out.println("Value of supply : " + Accounting.valueOfSupply);
//        Accounting.valueOfSupply=10000.0;
//        System.out.println("VAT : " + Accounting.getVAT());
//        Accounting.valueOfSupply=20000.0;
//        System.out.println("Total : " + Accounting.getTotal());
        
    }
 
}