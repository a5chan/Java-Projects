public class caretake extends YCDSBEmployee{
	// no extra properties
	public caretake(int intID, String strMail){
		super(intID, strMail);
	}
	public void checkTheromator(){
		System.out.println("Checking for a safe school temperature");	
	}
	public void callInSick(){
		System.out.println("Cough cough....I'm sick, make sure someone cleans my classrooms");
		System.out.println("Shinra oppppppppppp");
	}
	public void sendEmail(String strBody){
		System.out.println(strBody);
	}
}