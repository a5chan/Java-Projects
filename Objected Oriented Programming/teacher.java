public class teacher extends YCDSBEmployee implements departmenthead{
	public String strTeachable;
	
	public teacher(int intID, String strMail, String strTeach){
		super(intID, strMail);
		this.strTeachable = strTeach;
	}
	public void callInSick(){
		System.out.println("AHHHHHHHHH CHOOOOOOOOOO GRAVES OP");
		}	
	public void sendEmail(String strText){
		System.out.println("Dear fellow teachers");
		System.out.println(strText);
	}	
	public void teach(){
		if(this.strTeachable.equalsIgnoreCase("Computer Science")){
			System.out.println("We got lots of work to make you 1337");
		}else{
			System.out.println("Let's put in a movie");
		}
	}
	public void oncall(String strTeachable){
		System.out.println("You have an oncall for this class: " + strTeachable);
		System.out.println("Will you teach it or just sit there?");
		if(this.strTeachable.equals(strTeachable)){
			System.out.println("I can teach it!!!! Turn your books to page....");
		}else{
			System.out.println("NOOOOO");
		}		
	}
	public void arrangeDeptMeeting(){
		System.out.println("We are meeting the first Tuesday of every month");
	}
	public void createRoughSchedule(){
		System.out.println("What rooms do we have, what courses? How can we make it fair and efficient");	
	}		
	public void createbudget(){
		System.out.println("By the way it's 20 % goes to books, 80% to computers");
	}
}