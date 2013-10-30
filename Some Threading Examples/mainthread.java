public class thebrick{
	public static void main(String[]args){
		
		chair herman = new chair();		
		sofa glendon = new sofa();
		
		Thread hermanthread;
		Thread glendonthread;
		//herman.run();
		
		hermanthread = new Thread(herman);
		glendonthread=  new Thread(glendon);
		
		//glendon.run();
		
		salesman Allen = new salesman("Allen", herman, glendon);
		
		Thread Allenthread;
		Allenthread = new Thread(Allen);
		
		hermanthread.start();
		glendonthread.start();
		Allenthread.start();
	
	}		
}