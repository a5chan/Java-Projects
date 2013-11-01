public class zoo{
	public static void main(String[]args){
		double dblPurse = 10;
		System.out.println("Welcome to the zoo");
		System.out.println("Check out our animals");
		
		animal leo;
		System.out.println("Here is leo the generic animal");
		leo = new animal(2, 2, 4, "male", "jungle", 300);
		
		leo.eat();
		leo.eat();
		leo.eat();
		leo.move();
		leo.sleep(); 
		leo.poo();
		leo.eat();
		leo.eat();
		leo.poo();
		mammal maddie;
		System.out.println("Here is maddie the mammal");
		maddie  = new mammal(2,2,4,"female", "house", 105, "longstraighthair", 1);
		
		maddie.givebirth();
		maddie.shed();
		maddie.moveears();
		maddie.eat();
		maddie.sleep();
		maddie.poo();
		maddie.givebirth();
		
		human mike = new human(2,2,4,"male", "physics lab", 140, "short hair", 0, "Michael Cheung", 905894321, "PHD in Muggle History");
		System.out.println("Here comes Mike the human");
		mike.eat("KFC");
		mike.eat();
		mike.sleep();
		mike.poo();
		mike.givebirth();
		mike.moveears();
		mike.fightwars();
		mike.readwrite();
		
		human charmaine = new human(2,2,4, "female", "music", 140, "long hair", 1, "Charmaine", 905555555, "PHD In Engineering");
		System.out.println("Here comes Charmaine the human");
		charmaine.givebirth();
		dblPurse = charmaine.eat(dblPurse);
		System.out.println("I have this money left: " + dblPurse);
		charmaine.givebirth();
		
		human yousifa;
		yousifa = new human("Yousifa Ispendmoney", 647938330);
		System.out.println("Here comes yousifa");
		yousifa.givebirth();
		yousifa.poo();
		yousifa.givebirth();
		System.out.println("Yousifa is in this mood: " + yousifa.getMood("zookeeper"));
		System.out.println("My Yousifa is in this mood: " + yousifa.getMood("family"));
		yousifa.setMood("My mood is not good :(");
		System.out.println("Buddy Yousifa is in this mood: " + yousifa.getMood("friend"));
		
		//PolyMophism
		//Here comes Curran
		System.out.println("\n\n\nHere comes Curran \n\n\n"); 
		mammal curran;
		curran = new human(2,2,4, "male", "anime club", 160, "short hair", 0, "Curran", 911, "100 Achievements in Angry Birds");
		curran.eat();
		curran.sleep();
		curran.poo();
		curran.givebirth(); //Curran givesbirth like a human because he was construcoted sort of human
		//curran.readwrite(); technically curran is a mamal and therefore
		//curran.fightwars(); has no access to human specific methods
		
	}
}
	