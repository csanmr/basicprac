import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoinHomeInput {
	// args=parameter(매개변수)
	public static void main(String[] args) {
		//가상의 iot 프로그래밍
		//중복되는 것은 미리 변수로 지정 JOptionPane import하기
		//showInputDialog라는 메소드 실행
		String id = JOptionPane.showInputDialog("Enter a ID");
		//String id=args[0]; //Run 화살표를 아래로 눌러 Run Configuration에서 argument값을 미리 지정하고 실행하는 것인데 나는 안됌(APT만 들어오고 그럼) 버전의 차이인듯.
		
		String bright = JOptionPane.showInputDialog("Enter a Bright level");
		//String bright=args[1]; //위와 같음
		
		//Elevator call
		//Elevator myElevator=new Elevator("JAVA APT 507");
		Elevator myElevator=new Elevator(id);
		
		myElevator.callForUp(1); // 1층으로 호출
		
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
		
		DimmingLights moodLamp=new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));//bright를 double형으로
		moodLamp.on();
	}

}