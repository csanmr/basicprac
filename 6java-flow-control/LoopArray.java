
public class LoopArray {

	public static void main(String[] args) {
		//
		   /*
         *  <li>egoing</li>
         *  <li>jinhuck</li>
         *  <li>youbin</li>
         *  이런 형식으로 만들고 싶다고 하면.
         */
		String[] users=new String[3];
		users[0]="egoing";
		users[1]="jinhuck";
		users[2]="youbin";
		
		for(int i=0; i<3; i++) {
			System.out.println("<li>"+users[i]+"</li>");
		}
		System.out.println("===2nd for====");
		for(int j=0; j<users.length; j++) {
			if(j < users.length-1) {
				System.out.println(users[j]+",");
			} else {
				System.out.println(users[j]);
			}
			
		}
		
	}

}
