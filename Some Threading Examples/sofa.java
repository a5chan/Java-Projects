public class sofa implements Runnable{
	//No properties
	
	public boolean blnSold;
	//Constructor
	public sofa(){
	}
	
	//Methods
	public void run(){
		while(blnSold == false){
			System.out.println("Lounge on the sofa");
			chair.pause(2000);
		}
	}
}