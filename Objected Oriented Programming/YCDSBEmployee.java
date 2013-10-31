public abstract class YCDSBEmployee{
	int intEID;
	String strEmail;
	
	public YCDSBEmployee(int intID, String strMail){
		this.intEID = intID;
		this.strEmail = strMail;	
	}
	public abstract void sendEmail(String strMessage);
	
	public abstract void callInSick();
	
}