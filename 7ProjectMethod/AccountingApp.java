
public class AccountingApp {
	// ���ް���
    public static double valueOfSupply = 10000.0;
    
    // �ΰ���ġ����
    public static double vatRate = 0.1;
    //�ΰ���
    public static double getVAT() {
        return valueOfSupply * vatRate;
    }
    //�հ�
    public static double getTotal() {
        return valueOfSupply + getVAT();
    }
 
    public static void main(String[] args) {
    	//double vat = valueOfSupply * vatRate; => double vat = getVAT();
    	//double total = valueOfSupply + vat; => double total = getTotal();
    	
        System.out.println("Value of supply : " + valueOfSupply);
        //System.out.println("VAT : " + vat); �޼ҵ带 ����ؼ� �Ʒ��� �ڵ�� ��ȭ
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + getTotal());
 
    }

}
