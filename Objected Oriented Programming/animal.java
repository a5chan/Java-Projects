public class animal{
	public int intEyes;
	public int intEars;
	public int intAppend;
	public String strSex;
	public String strHab;
	public double dblWeight;
	public boolean blnLegalEat = true;
	
	public void move(){
		System.out.println("*move*");
	}
	public void eat(){
		System.out.println("NOM NOM NOM");
	}
	public void sleep(){
		System.out.println("zZzzzzzzzzzzzzzzzzzzzzz");
	}
	public void poo(){
		System.out.println("PBBBBBBBBBBBBBBBBBBBBBBBBBa");
	}
	public animal(int intSight, int intHear, int intAL, String strGender, String strEnv, double dblMass){
		this.intEyes = intSight;
		this.intEars = intHear;
		this.intAppend = intAL;
		this.strSex = strGender;
		this.strHab = strEnv;
		this.dblWeight = dblMass;
		}
}