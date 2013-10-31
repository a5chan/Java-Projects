import java.io.*;

public class car{
	//properties
	public String strColour;
	public String strTransmission;
	public int intEngine;
	public String strInterior;
	public String strSound;
	public int intDoors;
	public boolean blnIsDiscBrake;
	public String strBrand;
	public String strModel;
	public int intYear;
	private String strVIN; 
	
	//methods
	public void drive(){
		if(this.strVIN.equals("scratchedout")){
			System.out.println("WOOO WOOO POLICE 50 POPO");
		}else{
			if(this.intEngine==4){
				System.out.println("put put put put put");	
			}else if(this.intEngine==6){
				System.out.println("vrrm vrrm");
			}else if(this.intEngine>6){
				System.out.println("mmrmmrmmrmrmrmrmrmrmrmmr");
			}else{
				System.out.println("BOOM");
			}
		}
	}
	public void brake(){	
		if(this.blnIsDiscBrake==true){
			System.out.println("coming to a short safe stop");
		}else{
			System.out.println("slowing...slowing...omg brake hard!");
		}
	}
	public void turn(String strDirection){
		System.out.println("turning: "+strDirection);
	}
	public void honk(){
		if(this.strBrand.equalsIgnoreCase("ford")){
			System.out.println("HOOONNNKK");
		}else{
			System.out.println("beep beep");
		}
	}
	//Constructors
	public car(String strCol, String strTrans,int intEng, boolean blnBrake, String strBrand, String strVinNum){
		this.strColour=strCol;
		this.strTransmission=strTrans;
		this.intEngine=intEng;
		this.blnIsDiscBrake=blnBrake;
		this.strBrand=strBrand;
		this.strVIN=strVinNum;
	}
	public static double whatcanyoubuy(double dblMIncome, double dblMPayments){
		//income - expenses*60 month term(5 years)
		double dblMaxPrice;
		
		dblMaxPrice=(dblMIncome-dblMPayments)*60;
		
		return dblMaxPrice;
	}
}