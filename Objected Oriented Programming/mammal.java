public class mammal extends animal{
	public String strHair;
	public String strBloodType = "O-";
	public int intMilk;
	
	public void givebirth(){
		if(this.strSex.equals("female")){
			System.out.println("YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYAAAAAAAAAAAAAA!!!!!!!!!!!!!!!!!!!!!!!");
		}
	}
	public void shed(){
		System.out.println("*shed*");
	}
	public void moveears(){
		System.out.println("twitch twitch");
	}
	public mammal(int intSight, int intHear, int intAL, String strGender, String strEnv, double dblMass, String strFur, int intLiquid){
		super(intSight, intHear, intAL, strGender, strEnv, dblMass);
		this.strHair= strFur;
		this.intMilk = intLiquid;
	}
}