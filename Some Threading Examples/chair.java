public class chair implements Runnable{
	//Properties
	public boolean blnSold = false;
	
	//Constructors
	public chair(){
	}
	//No Properties, therefore no need need to set them
	
	// Methods
	public void run(){
		while(blnSold == false){
		System.out.println("Run chair run! ");
		pause(500);	
	}
}
			
	public static void pause(int intMS){
		try{
			Thread.sleep(intMS);	
		}catch(InterruptedException e){
			
		}	
	}
}
	