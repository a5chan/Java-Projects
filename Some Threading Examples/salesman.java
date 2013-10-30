import java.io.*;
public class salesman implements Runnable{
	//No properties
	//Constructor

	public String strName;
	public chair thechair;
	public sofa thesofa;
	
	public salesman(String strName, chair dachair, sofa dasofa){
		this.strName=  strName;
		this.thechair = dachair;
		this.thesofa = dasofa;
	}
	public void run(){
		String strBuy;
		Console keyboard = System.console();
		while(true){
		System.out.println("Hi MY NAME IS SALESMAN: " + this.strName + ": The BRICK IS YOUR # 1 CHOICE");
		System.out.println("What do you want to buy THO D00D DAWG DAWG");
		strBuy = keyboard.readLine();
		if(strBuy.equalsIgnoreCase("Chair")){
			this.thechair.blnSold = true;
		}	
		else if(strBuy.equalsIgnoreCase("sofa")){
			this.thesofa.blnSold = true;
			}
		}
	}
}