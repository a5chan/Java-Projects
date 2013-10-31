public class human extends mammal{
		public String strFullName;
		public int intPhoneNumber;
		public String strEducation;
		private String strMood = "happy";
		
		
		public void readwrite(){
			System.out.println("Sir John A Macdonald is the first Prime Minister of Canada");				
		}
		public void eat(String strResturant)
		{
			if(strResturant.equals("KFC")){
		}else if(strResturant.equals("Yang Yangs Sushi")){
			System.out.println("MMMMM raw fish...");
		}else if(strResturant.equals("perfect chinese")){
			System.out.println("No sharkfin for you!!! How about peking duck...heart attack!!");
			
		}
		}
		public double eat(double dblMoney){
			if(dblMoney < 5){
				System.out.println("Yoquiero Taco Bell");
				return dblMoney - 4.99;
			}else if(dblMoney>=5 && dblMoney <20){
				System.out.println("Let's go to Boston Pizza");
				return dblMoney -14.98;
			}else if(dblMoney >=20){
				System.out.println("Let's go to the 360 CN tower resutrant");
				return dblMoney-30.05;
			}else{
				return dblMoney;
			}
		}
		
		public void fightwars(){
			System.out.println("Killing in the name of power, money, greed, love, and hatred");
			System.out.println("Taking it out on the weak, the enviornment is second");
		}
		public void givebirth(){
			if(this.strSex.equals("female")){
				System.out.println("YYYYYYYYYYYYYYYYYYYAAAAAAAAAAAAAAAAAAAAAAAA.........WHY DID YOU DO THIS TO ME HUSBAND!!!!!!");				
			}else{
				System.out.println("Push it out, push it out, wayyyyyyy out!!!!!!!!");
		}
	}
	public human(int intSight, int intHear, int intAL, String strGender, String strEnv, double dblMass, String strFur, int intLiquid, String strName, int intPhone, String strEdu) {
		super(intSight, intHear, intAL, strGender, strEnv, dblMass, strFur, intLiquid);
		this.strFullName = strName;
		this.intPhoneNumber = intPhone;
		this.strEducation = strEdu;
	
			
	}
	public human(String strName, int intPhone){
		super(2,2,4,"female", "store", 95, "Long hair", 1);
	this.strFullName = strName;
	this.intPhoneNumber = intPhone;
	this.strEducation = ("duh..... shopping");	
	}
	//Accessor
	//IT is a public method that access the private property
	public String getMood(String strRelation){
		if(strRelation.equals("friend") || strRelation.equals("family")){
		return this.strMood;
		}else{
		return "shut up cuntsef";
		}
	}
	//Mutator
	//It is a public method that changes the value on a private propety
	public void setMood(String strFeeling){
		this.strMood = strFeeling;
		
	}
}