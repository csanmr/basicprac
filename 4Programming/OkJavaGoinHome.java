import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoinHome {

	public static void main(String[] args) {
		//������ iot ���α׷���
		//�ߺ��Ǵ� ���� �̸� ������ ����
		String id="JAVA APT 507";
		
		//Elevator call
		//Elevator myElevator=new Elevator("JAVA APT 507");
		Elevator myElevator=new Elevator(id);
		
		myElevator.callForUp(1); // 1������ ȣ��
		
		//Security off
		//Security mySecurity=new Security("JAVA APT 507");
		Security mySecurity=new Security(id);
		mySecurity.off();
		
		//Light on
		//Lighting hallLamp=new Lighting("JAVA APT 507 / Hall Lamp");
		Lighting hallLamp=new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
		//Lighting floorLamp=new Lighting("JAVA APT 507 / floor Lamp");
		Lighting floorLamp=new Lighting(id+" / floor Lamp");
		floorLamp.on();
	}

}
