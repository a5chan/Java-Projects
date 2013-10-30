package myrpg;
import hsa.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;


public class Myrpg{
	public static void main(String[]args){
		//Creating the Pictures
		//Creating the Console
		Console con = new Console(34,82);
		Console con2 = new Console(34,82);
		Console con3 = new Console(10,10);
		File Tilefile = null;
		BufferedImage TileImage = null;
		File Treefile = null;
		BufferedImage TreeImage = null;
		File Waterfile = null;
		BufferedImage WaterImage = null;
		File Buildingtopleftfile = null;
		BufferedImage BuildingtopleftImage = null;
		File Buildingtoprightfile = null;
		BufferedImage BuildingtoprightImage = null;
		File Doorfile = null;
		BufferedImage DoorImage = null;
		File Buildingbottomleftfile = null;
		BufferedImage BuildingbottomleftImage = null;
		File Buildingbottomrightfile = null;
		BufferedImage BuildingbottomrightImage = null;
		File Enemyfile = null;
		BufferedImage EnemyImage = null;
		File Herofile = null;
		BufferedImage HeroImage = null;
		File Floorfile = null;
		BufferedImage FloorImage = null;
		File HerofileTwo = null;
		BufferedImage HeroImageTwo = null;
		File Tablefile = null;
		BufferedImage TableImage = null;
		File Npcfile = null;
		BufferedImage NpcImage = null;
		File Machinefile = null;
		BufferedImage MachineImage = null;
		File Bookcasefile = null;
		BufferedImage BookcaseImage = null;
		File Personfile = null;
		BufferedImage PersonImage = null;
		File Flowerfile = null;
		BufferedImage FlowerImage = null;
		File Rockfile = null;
		BufferedImage RockImage = null;
		File Goldfile = null;
		BufferedImage GoldMineImage = null;
		File Holefile = null;
		BufferedImage HoleImage = null;
		File Monsterfile = null;
		BufferedImage MonsterImage= null;
		File Birdfile = null;
		BufferedImage BirdImage = null;
		File Stairfile = null;
		BufferedImage StairImage = null;
		File HeroThreeFile = null;
		BufferedImage HeroImageThree = null;
		File Entrancefile = null;
		BufferedImage EntranceImage = null;
		File Animefile = null;
		BufferedImage AnimeImage = null;
		File Swordfile = null;
		BufferedImage SwordImage = null;
		File Weaponfile = null;
		BufferedImage WeaponImage = null;
		File Bowfile = null;
		BufferedImage BowImage = null;
		File Finalfile = null;
		BufferedImage FinalImage = null;
		File Menufile = null;
		BufferedImage MenuImage = null;
		File Wordfile = null;
		BufferedImage WordImage = null;
		File Thankfile = null;
		BufferedImage ThankImage = null;
		File Shopfile = null;
		BufferedImage ShopImage = null;
		File Wepfile = null;
		BufferedImage WepImage = null;
		File Speedfile = null;
		BufferedImage SpeedImage = null;
		File Infinityfile = null;
		BufferedImage InfinityImage = null;
		File Cleaverfile = null;
		BufferedImage CleaverImage = null;
		File Choicefile = null;
		BufferedImage ChoiceImage = null;
		File ChoiceTwofile = null;
		BufferedImage ChoiceTwoImage = null;
		File ChoiceThreefile = null;
		BufferedImage ChoiceThreeImage = null;
		File ChoiceFourfile = null;
		BufferedImage ChoiceFourImage = null;
		
		try{
			//Importing the Pictures
			Tilefile = new File ("TileImage.png");
			TileImage = ImageIO.read(Tilefile);
			Treefile = new File("TreeImage.jpg");
			TreeImage = ImageIO.read(Treefile);
			Waterfile = new File("WaterImage.jpg");
			WaterImage = ImageIO.read(Waterfile);
			Buildingtopleftfile = new File("buildingtopleft.jpg");
			BuildingtopleftImage = ImageIO.read(Buildingtopleftfile);
			Buildingtoprightfile = new File("buildingtopright.jpg");
			BuildingtoprightImage = ImageIO.read(Buildingtoprightfile);
			Doorfile = new File("door.jpg");
			DoorImage = ImageIO.read(Doorfile);
			Buildingbottomleftfile = new File("buildingbottomleft.jpg");
			BuildingbottomleftImage = ImageIO.read(Buildingbottomleftfile);
			Buildingbottomrightfile = new File("buildingbottomright.jpg");
			BuildingbottomrightImage = ImageIO.read(Buildingbottomrightfile);
			Enemyfile = new File("EnemyImage.jpg");
			EnemyImage = ImageIO.read(Enemyfile);
			Herofile = new File("HeroImage.jpg");
			HeroImage = ImageIO.read(Herofile);
			Floorfile = new File("FloorImage.jpg");
			FloorImage = ImageIO.read(Floorfile);
			HerofileTwo = new File("HeroImageTwo.jpg");
			HeroImageTwo = ImageIO.read(HerofileTwo);
			Tablefile = new File("TableImage.jpg");
			TableImage = ImageIO.read(Tablefile);
			Npcfile = new File("NPCImage.jpg"); 
			NpcImage = ImageIO.read(Npcfile);
			Machinefile = new File ("MachineImage.jpg");
			MachineImage = ImageIO.read(Machinefile);
			Bookcasefile = new File("BookcaseImage.jpg");
			BookcaseImage = ImageIO.read(Bookcasefile);
			Personfile = new File("PersonImage.jpg");
			PersonImage = ImageIO.read(Personfile);
			Flowerfile = new File("FlowerImage.jpg");
			FlowerImage = ImageIO.read(Flowerfile);
			Rockfile = new File ("RockImage.jpg");
			RockImage = ImageIO.read(Rockfile);
			Goldfile = new File ("GoldMineImage.jpg");
			GoldMineImage = ImageIO.read(Goldfile);
			Holefile = new File ("HoleImage.jpg");
			HoleImage = ImageIO.read(Holefile);
			Monsterfile = new File ("MonsterImage.jpg");
			MonsterImage = ImageIO.read(Monsterfile);
			Birdfile = new File("BirdImage.jpg");
			BirdImage = ImageIO.read(Birdfile);
			Stairfile = new File("StairImage.jpg");
			StairImage = ImageIO.read(Stairfile);
			HeroThreeFile = new File ("HeroImageThree.jpg");
			HeroImageThree = ImageIO.read(HeroThreeFile);
			Entrancefile = new File ("EntranceImage.jpg");
			EntranceImage = ImageIO.read(Entrancefile);
			Animefile = new File ("AnimeImage.jpg");
			AnimeImage = ImageIO.read(Animefile);
			Swordfile = new File ("SwordImage.jpg");
			SwordImage = ImageIO.read(Swordfile);
			Weaponfile = new File ("WeaponImage.jpg");
			WeaponImage = ImageIO.read(Weaponfile);
			Bowfile = new File ("BowImage.jpg");
			BowImage = ImageIO.read(Bowfile);
			Finalfile = new File ("FinalImage.jpg");
			FinalImage = ImageIO.read(Finalfile);
			Menufile = new File ("MenuImage.jpg");
			MenuImage = ImageIO.read(Menufile);
			Wordfile = new File ("WordImage.jpg");
			WordImage = ImageIO.read(Wordfile);
			Thankfile = new File ("ThankImage.jpg");
			ThankImage = ImageIO.read(Thankfile);
			Shopfile = new File ("ShopImage.jpg");
			ShopImage = ImageIO.read(Shopfile);
			Wepfile = new File("WepImage.jpg");
			WepImage = ImageIO.read(Wepfile);
			Speedfile = new File ("SpeedImage.jpg");
			SpeedImage = ImageIO.read(Speedfile);
			Infinityfile = new File ("InfinityImage.jpg");
			InfinityImage = ImageIO.read(Infinityfile);
			Cleaverfile =new File ("CleaverImage.jpg");
			CleaverImage = ImageIO.read(Cleaverfile);
			Choicefile = new File ("ChoiceImage.jpg");
			ChoiceImage = ImageIO.read(Choicefile);
			ChoiceTwofile = new File("ChoiceTwoImage.jpg");
			ChoiceTwoImage = ImageIO.read(ChoiceTwofile);
			ChoiceThreefile = new File("ChoiceThreeImage.jpg");
			ChoiceThreeImage = ImageIO.read(ChoiceThreefile);
			ChoiceFourfile = new File("ChoiceFourImage.jpg");
			ChoiceFourImage = ImageIO.read(ChoiceFourfile);
			}catch(IOException e){	
			}
		
		//Creating the Variables
		String strMap[][];
		strMap = new String[20][20];
		int intRow;
		intRow = 0;
		int intCol;
		intCol = 0;
		String strLine;
		String strMapName;
		strMapName = "RPGREAL.csv";
		int intTopRow;
		intTopRow = 0;
		String strOption;
		strOption = "          ";
		int intTopCol;
		intTopCol = 0;
		int intYHero;
		String strMapNameThree;
		strMapNameThree = ("RPGREALTHREE.csv");
		intYHero = 1;
		int intCounter;
		int intHealth;
		intHealth = 50;
		boolean blnMap1;
		char chrOption;
		chrOption = ' ';
		String strLines;
		strLines = "                                                                                                                                                                         ";
		String strMapThree[][];
		strMapThree = new String[20][20];
		boolean blnMap2;
		String strTextName;
		strTextName = "help.txt";
		blnMap2 = false;
		blnMap1 = true;
		int intLevel;
		intLevel = 1;
		intCounter = 0;
		int intXHero;
		intXHero = 1;
		int intDamageTaken;
		String strHelp;
		intDamageTaken = 0;
		String strMapTwo[][];
		strMapTwo = new String[20][20];
		boolean blnChangeMap;
		String strMapNameTwo;
		int intDamage;
		intDamage = 50;
		int intEnemyHealth;
		intEnemyHealth = 300;
		int intGold;
		intGold = 100;
		int intBattleDamage;
		intBattleDamage = 0;
		int intMoney;
		intMoney = 100;
		strMapNameTwo = "RPGREALTWO.csv";
		blnChangeMap = false;
		int intCheck;
		intCheck = 0;
		char chrKey;
		char chrMenu;
		chrMenu = ' ';
		String strName;
		strName = "                                                ";
		chrKey = ' ';
		boolean blnMove;
		String  strLineSplit[]=new String[20];
		strMap = allenutils.map1(strMapName);
		int intX;
		int intY;
			intX = 0;
			intY = 0;
		//Starting the Menu
		while(intHealth > 0){
		con.drawImage(MenuImage, 10, 10, null);
		con.drawImage(WordImage, 30, 300, null);
		chrMenu = con.getChar();
		if(chrMenu == 'q' || chrMenu == 'Q'){
			break;
		}else if(chrMenu == 'c' || chrMenu == 'C'){
		con.clear();
		con.println("Game Programmer:Allen Chan");
		con.println("Game: The Best RPG");
		con.println("Game Developer: Cadawas Industries");
		con.println("Press P to play or I to go to instructions. From instructions, you can press P to play");
		chrMenu = con.getChar();
		con.clear();
		//Instructions
		}else if(chrMenu == 'i' || chrMenu == 'I'){
		con.clear();
		con.println("You begin in a world trapped with monsters and wanderers");
		con.println("In the game, you will battle monsters, but they will not die.");
		con.println("Thus, You will be able to test your strength and strategic skills. On the second");
		con.println ("console window shows your health, your money, and your attack damage.");
		con.println("When you find items on the maps, you can increase your damage (limited), but think");
		con.println("wisely on which ones you want to choose FIRST. The buildings");
		con.println("all include people that want to help you only wanting a small price.");
		con.println("everytime, you win a battle, you will obtain gold, which you can use to heal");
		con.println("yourself. When you reach zero health, you will be slain, so don't judge");
		con.println("your enemies. If you are feeling tough, challenge yourself at the dungeon");
		con.println("in the hole on the northeast part of the map. You cannot walk through trees or");
		con.println("you walk through buildings. You are not able to step out of bounds or any objects");
		con.println("There is a shop where you may purchase items in the buildings");
		con.println("Now, I ask one thing, what is your name adventurer?");
		strName = con.readLine();
		con.println("Prepare to be on a journey, " + strName);
	
	
	
	
	
	
		con.println("Once done, Press P to play.");
		chrMenu = con.getChar();
		}
		//Starting the Game
		while(chrMenu == 'p' && intHealth > 0){
		con2.clear();
		con2.drawImage(AnimeImage, 10, 10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");
		con2.println("              You have: " + intDamage + " attack damage");
		//Loading the First Map
		while(blnMap1 ==true){
			
			for(intCheck = 0; intCheck < 20; intCheck ++){
			for(intCounter = 0; intCounter < 20; intCounter ++){
			if(strMap[intCounter][intCheck].equalsIgnoreCase("e")){
			intX= intCounter * 33;
			intY= intCheck * 34;
			con.drawImage(TileImage, intX, intY, null);
			intX = 0;
			intY = 0;
			}else if(strMap[intCounter][intCheck].equalsIgnoreCase("t")){
			intX = intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(TreeImage, intX, intY, null);
			intX = 0;
			intY = 0;
			}else if(strMap[intCounter][intCheck].equalsIgnoreCase("w")){
			intX = intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(WaterImage, intX, intY, null);
			intX = 0;
			intY = 0;
			}else if(strMap[intCounter][intCheck].equalsIgnoreCase("tbl")){
			intX = intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(BuildingtopleftImage, intX, intY, null);
			intX = 0;
			intY = 0;
			}else if(strMap[intCounter][intCheck].equalsIgnoreCase("tbr")){
			intX = intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(BuildingtopleftImage, intX, intY, null);
			intX = 0;
			intY = 0;
			}else if(strMap[intCounter][intCheck].equalsIgnoreCase("bbl")){
			intX = intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(BuildingbottomleftImage, intX, intY, null);
			intX = 0;
			intY = 0;
			}else if(strMap[intCounter][intCheck].equalsIgnoreCase("bbr")){
			intX = intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(BuildingbottomrightImage, intX, intY, null);
			intX = 0;
			intY = 0;
			}else if(strMap[intCounter][intCheck].equalsIgnoreCase("h")){
			intX = intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(EnemyImage, intX, intY, null);
			intX = 0;
			intY = 0;	
			}else if(strMap[intCounter][intCheck].equalsIgnoreCase("o")){
			intX = intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(HoleImage, intX, intY, null);
			intX = 0;
			intY = 0;
			}else if(strMap[intCounter][intCheck].equalsIgnoreCase("s")){
			intX = intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(SwordImage, intX, intY , null);
			}else if(strMap[intCounter][intCheck].equalsIgnoreCase("k")){
			intX = intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(WeaponImage, intX, intY, null);
			}
	}
				
				con.drawImage(HeroImage, intYHero*33, intXHero*34, null);
	}
		
		while(blnChangeMap == false && blnMap2 == false && blnMap1 == true){
		//Moving System for the First Map
			chrKey = con.getChar();
			
			if(chrKey == 'w'){
				intXHero = intXHero - 1;
			}else if(chrKey == 'a'){
				intYHero = intYHero-1;
			}else if(chrKey == 'd'){
				intYHero = intYHero + 1;
			}else if(chrKey == 's'){
				intXHero = intXHero + 1;
		}	
		//Programming Restrictions on the trees, water and buildings
			if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("t") && chrKey == 's'){
			intXHero = intXHero -1 ;
		
			}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("t") && chrKey == 'w'){
			intXHero = intXHero + 1;
		
			}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("t") && chrKey == 'a'){
			intYHero = intYHero + 1;
	
			}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("t") && chrKey == 'd'){
			intYHero = intYHero - 1;
		
			}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("b") && strMap[intYHero][intXHero].substring(1,2).equalsIgnoreCase("b") && strMap[intYHero][intXHero].substring(2,3).equalsIgnoreCase("r")  && chrKey == 'w'){
			intXHero = intXHero + 1;
		
			}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("b") && strMap[intYHero][intXHero].substring(1,2).equalsIgnoreCase("b") && strMap[intYHero][intXHero].substring(2,3).equalsIgnoreCase("r")  && chrKey == 's'){
			intXHero = intXHero - 1;
		
			}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("b") && strMap[intYHero][intXHero].substring(1,2).equalsIgnoreCase("b") && strMap[intYHero][intXHero].substring(2,3).equalsIgnoreCase("r")  && chrKey == 'a'){
			intYHero = intYHero + 1;
	
			}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("b") && strMap[intYHero][intXHero].substring(1,2).equalsIgnoreCase("b") && strMap[intYHero][intXHero].substring(2,3).equalsIgnoreCase("r") && chrKey == 'd'){
			intYHero = intYHero - 1;
		  	}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("w")){
			 con.clear();
			 blnMap1 = false;
			 blnChangeMap = false;
			 blnMap2 = false;
			 blnMove = false;
			 intHealth = 0;
			 break;
			}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("b") && strMap[intYHero][intXHero].substring(1,2).equalsIgnoreCase("b") && strMap[intYHero][intXHero].substring(2,3).equalsIgnoreCase("l")){
			blnChangeMap = true;
			blnMap1 = false;
			con.clear();
			}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("o")){
			blnMap2 = true;
			blnChangeMap = false;
			blnMap1 = false;
			con.clear();
			}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("h") && chrKey == 'w'){
			intXHero = intXHero + 1;
			//Battle System for the First Map, along with damage and money
			
			intBattleDamage = (int)(Math.random()*intDamage + 1);
			con3.println(intBattleDamage);
			intDamageTaken = (int)(Math.random()*30+ 1);
			con3.println(intDamageTaken);
			if(intBattleDamage > intDamageTaken){
			con3.println("You win");
				}else if(intBattleDamage < intDamageTaken){
			con3.println("You lost");
		
			}
	
			intHealth = intHealth - intDamageTaken;
			intMoney = intMoney + 500;
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");	
			if(intHealth <= 0){
			con.clear();
			blnMap1 = false;
			blnChangeMap = false;
			blnMap2 = false;
			break;
			}
			}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("h") && chrKey == 'a'){
			intYHero = intYHero + 1;
			
			intBattleDamage = (int)(Math.random()*intDamage + 1);
			con3.println(intBattleDamage);
			intDamageTaken = (int)(Math.random()*30+ 1);
			con3.println(intDamageTaken);
			if(intBattleDamage > intDamageTaken){
			con3.println("You win");
				}else if(intBattleDamage < intDamageTaken){
			con3.println("You lost");
		
			}
				
	
			intHealth = intHealth - intDamageTaken;
			intMoney = intMoney + 500;
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");	
			if(intHealth <= 0){
			con.clear();
			blnMap1 = false;
			blnChangeMap = false;
			blnMap2 = false;
			break;
			}
			}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("h") && chrKey == 'd'){
			intYHero = intYHero - 1;
			
			intBattleDamage = (int)(Math.random()*intDamage + 1);
			con3.println(intBattleDamage);
			intDamageTaken = (int)(Math.random()*30+ 1);
			con3.println(intDamageTaken);
			if(intBattleDamage > intDamageTaken){
			con3.println("You win");
				}else if(intBattleDamage < intDamageTaken){
			con3.println("You lost");
		
			}
				
	
			intHealth = intHealth - intDamageTaken;
			intMoney = intMoney + 500;
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");	
			if(intHealth <= 0){
			con.clear();
			blnMap1 = false;
			blnChangeMap = false;
			blnMap2 = false;
			break;
			}
			}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("h") && chrKey == 'w'){
			intXHero = intXHero + 1;
			
			intBattleDamage = (int)(Math.random()*intDamage + 1);
			con3.println(intBattleDamage);
			intDamageTaken = (int)(Math.random()*30+ 1);
			con3.println(intDamageTaken);
			if(intBattleDamage > intDamageTaken){
			con3.println("You win");
				}else if(intBattleDamage < intDamageTaken){
			con3.println("You lost");
		
			}
				
	
			intHealth = intHealth - intDamageTaken;
			intMoney = intMoney + 500;
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");	
			if(intHealth <= 0){
			System.out.println("test");
			con.clear();
			blnMap1 = false;
			blnChangeMap = false;
			blnMap2 = false;
			break;
			}
			}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("h") && chrKey == 's'){
			intXHero = intXHero - 1;
			
			intBattleDamage = (int)(Math.random()*intDamage + 1);
			con3.println(intBattleDamage);
			intDamageTaken = (int)(Math.random()*30+ 1);
			con3.println(intDamageTaken);
			if(intBattleDamage > intDamageTaken){
			con3.println("You win");
				}else if(intBattleDamage < intDamageTaken){
			con3.println("You lost");
		
			}
				
	
			intHealth = intHealth - intDamageTaken;
			intMoney = intMoney + 500;
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");	
			con2.println("              You have: " + intDamage + " attack damage");
			
			if(intHealth <= 0){
			con.clear();
			blnMap1 = false;
			blnChangeMap = false;
			blnMap2 = false;
			break;
			}
			//Picking up objects
			}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("s") && chrKey == 'w'){
			intXHero = intXHero + 1;
			if(intDamage <60){
			con2.println("This item will give you 10 + damage, would you like to pick it up?");
			strOption = con2.readLine();
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
			
			}else if(intDamage > 60){
			con2.println("YOU'RE TOO STRONG FOR THIS OBJECT MOVE ON NOOB!");
			} 
			if(strOption.equalsIgnoreCase("Yes")){
				intDamage = intDamage + 10;
				strOption = "    ";
				
			}else if(strOption.equalsIgnoreCase("No")){
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
				}
			
		}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("s") && chrKey == 'a'){
			intYHero = intYHero + 1;
			if(intDamage <60){
			con2.println("This item will give you 10 + damage, would you like to pick it up?");
			strOption = con2.readLine();
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
			
			}else if(intDamage > 60){
			con2.println("YOU'RE TOO STRONG FOR THIS OBJECT MOVE ON NOOB!");
			} 
			if(strOption.equalsIgnoreCase("Yes")){
				intDamage = intDamage + 10;
				strOption = "    ";
				
			}else if(strOption.equalsIgnoreCase("No")){
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
				}
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
			
			}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("s") && chrKey == 'd'){
			intYHero = intYHero - 1;
			if(intDamage <60){
			con2.println("This item will give you 10 + damage, would you like to pick it up?");
			strOption = con2.readLine();
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
			
			}else if(intDamage > 60){
			con2.println("YOU'RE TOO STRONG FOR THIS OBJECT MOVE ON NOOB!");
			} 
			if(strOption.equalsIgnoreCase("Yes")){
				intDamage = intDamage + 10;
				strOption = "    ";
				
			}else if(strOption.equalsIgnoreCase("No")){
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
				}
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
			
			}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("s") && chrKey == 's'){
			intXHero = intXHero - 1;
			if(intDamage <60){
			con2.println("This item will give you 10 + damage, would you like to pick it up?");
			strOption = con2.readLine();
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
			
			}else if(intDamage > 60){
			con2.println("YOU'RE TOO STRONG FOR THIS OBJECT MOVE ON NOOB!");
			} 
			if(strOption.equalsIgnoreCase("Yes")){
				intDamage = intDamage + 10;
				strOption = "    ";
				
			}else if(strOption.equalsIgnoreCase("No")){
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
				}
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
			
			}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("k") && chrKey == 'w'){
			intXHero = intXHero + 1;
			if(intDamage <100){
			con2.println("This item will give you 40 + damage, would you like to pick it up?");
			strOption = con2.readLine();
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
			
			}else if(intDamage > 100){
			con2.println("YOU'RE TOO STRONG FOR THIS OBJECT MOVE ON NOOB!");
			} 
			if(strOption.equalsIgnoreCase("Yes")){
				intDamage = intDamage + 40;
				strOption = "    ";
				
			}else if(strOption.equalsIgnoreCase("No")){
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
				}
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
			
			}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("k") && chrKey == 'a'){
			intYHero = intYHero + 1;
			if(intDamage <100){
			con2.println("This item will give you 40 + damage, would you like to pick it up?");
			strOption = con2.readLine();
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
			
			}else if(intDamage > 100){
			con2.println("YOU'RE TOO STRONG FOR THIS OBJECT MOVE ON NOOB!");
			} 
			if(strOption.equalsIgnoreCase("Yes")){
				intDamage = intDamage + 40;
				strOption = "    ";
				
			}else if(strOption.equalsIgnoreCase("No")){
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
				}
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
			
			}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("k") && chrKey == 'd'){
			intYHero = intYHero -1 ;
			if(intDamage <100){
			con2.println("This item will give you 40 + damage, would you like to pick it up?");
			strOption = con2.readLine();
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
			
			}else if(intDamage > 100){
			con2.println("YOU'RE TOO STRONG FOR THIS OBJECT MOVE ON NOOB!");
			} 
			if(strOption.equalsIgnoreCase("Yes")){
				intDamage = intDamage + 40;
				strOption = "    ";
				
			}else if(strOption.equalsIgnoreCase("No")){
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
				}
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
			
			}else if(strMap[intYHero][intXHero].substring(0,1).equalsIgnoreCase("k") && chrKey == 's'){
			intXHero = intXHero - 1;
			if(intDamage <100){
			con2.println("This item will give you 40 + damage, would you like to pick it up?");
			strOption = con2.readLine();
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
			
			}else if(intDamage > 100){
			con2.println("YOU'RE TOO STRONG FOR THIS OBJECT MOVE ON NOOB!");
			} 
			if(strOption.equalsIgnoreCase("Yes")){
				intDamage = intDamage + 40;
				strOption = "    ";
				
			}else if(strOption.equalsIgnoreCase("No")){
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
				}
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
			
			}
			if(blnMap1 != false && blnChangeMap != true){
			//Redrawing the whole map
			for(intCounter = 0; intCounter < 20; intCounter ++){
				for(intCheck = 0; intCheck < 20; intCheck ++){
	
			if(strMap[intCounter][intCheck].equalsIgnoreCase("e")){
			intX= intCounter * 33;
			intY= intCheck * 34;
			con.drawImage(TileImage, intX, intY, null);
			
			}else if(strMap[intCounter][intCheck].equalsIgnoreCase("t")){
			intX = intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(TreeImage, intX, intY, null);
		
			}else if(strMap[intCounter][intCheck].equalsIgnoreCase("w")){
			intX = intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(WaterImage, intX, intY, null);
			
			}else if(strMap[intCounter][intCheck].equalsIgnoreCase("tbl")){
			intX = intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(BuildingtopleftImage, intX, intY, null);
		
			}else if(strMap[intCounter][intCheck].equalsIgnoreCase("tbr")){
			intX = intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(BuildingtopleftImage, intX, intY, null);
		
			}else if(strMap[intCounter][intCheck].equalsIgnoreCase("bbl")){
			intX = intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(BuildingbottomleftImage, intX, intY, null);
			
			}else if(strMap[intCounter][intCheck].equalsIgnoreCase("bbr")){
			intX = intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(BuildingbottomrightImage, intX, intY, null);
		
			}else if(strMap[intCounter][intCheck].equalsIgnoreCase("h")){
			intX = intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(EnemyImage, intX, intY, null);
		
			}else if(strMap[intCounter][intCheck].equalsIgnoreCase("o")){
			intX = intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(HoleImage, intX, intY, null);
			}			
		}	
			}
			con.drawImage(HeroImage, intYHero*33, intXHero * 34, null);		
			}	
		}
		//Loading the second map
			while(blnChangeMap == true){
			strMapTwo = allenutils.buildingmap(strMapNameTwo);
			intCheck = 0;
			intYHero = 0;
			intXHero = 0;
				while(intCheck < 20){
				for(intCounter = 0; intCounter < 20; intCounter ++){
			if(strMapTwo[intCounter][intCheck].equalsIgnoreCase("e")){
			intX= intCounter * 33;
			intY= intCheck * 34;
			con.drawImage(FloorImage, intX, intY, null);
				}else if(strMapTwo[intCounter][intCheck].equalsIgnoreCase("t")){
					intX = intCounter * 33;
					intY = intCheck * 34;
					con.drawImage(TableImage, intX, intY, null);
					}else if(strMapTwo[intCounter][intCheck].equalsIgnoreCase("r")){
					intX = intCounter * 33;
					intY = intCheck * 34;
					con.drawImage(NpcImage, intX, intY, null);
					}else if(strMapTwo[intCounter][intCheck].equalsIgnoreCase("m")){
					intX = intCounter * 33;
					intY = intCheck * 34;
					con.drawImage(MachineImage, intX, intY, null);
					}else if(strMapTwo[intCounter][intCheck].equalsIgnoreCase("r")){
					intX = intCounter * 33;
					intY = intCheck * 34;
					con.drawImage(NpcImage, intX, intY, null);
					}else if(strMapTwo[intCounter][intCheck].equalsIgnoreCase("b")){
					intX =intCounter * 33;
					intY = intCheck * 34;
					con.drawImage(BookcaseImage, intX, intY, null);
					}else if(strMapTwo[intCounter][intCheck].equalsIgnoreCase("a")){
						intX = intCounter * 33;
						intY = intCheck * 34;
					con.drawImage(PersonImage, intX, intY, null);
					}else if(strMapTwo[intCounter][intCheck].equalsIgnoreCase("f")){
						intX= intCounter * 33;
						intY = intCheck * 34;
						con.drawImage(FlowerImage,intX,intY, null);
					}else if(strMapTwo[intCounter][intCheck].equalsIgnoreCase("v")){
						intX = intCounter * 33;
						intY = intCheck * 34;
						con.drawImage(StairImage, intX, intY, null);
					}else if(strMapTwo[intCounter][intCheck].equalsIgnoreCase("s")){
						intX = intCounter * 33;
						intY = intCheck * 34;
						con.drawImage(ShopImage, intX, intY, null);
					}
					
			}
			intCheck = intCheck + 1;
			con.drawImage(HeroImageTwo, 33, 34, null);
		}
			intYHero = 1;
			intXHero = 1;
			while(blnChangeMap == true){
			//Move System for the second map
		
			chrKey = con.getChar();
			if(chrKey == 'w'){
				intXHero = intXHero - 1;
			}else if(chrKey == 'a'){
				intYHero = intYHero-1;
			}else if(chrKey == 'd'){
				intYHero = intYHero + 1;		
			}else if(chrKey == 's'){
				intXHero = intXHero + 1;
		}
			if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("f") && chrKey == 'w'){
				intXHero = intXHero + 1;
			}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("f") && chrKey == 'a'){
				intYHero = intYHero + 1;
			}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("f") && chrKey == 'd'){
				intYHero = intYHero - 1;
			}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("f") && chrKey == 's'){
				intXHero = intXHero - 1;
			}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("m") && chrKey == 'w'){
				intXHero = intXHero + 1;
			}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("m") && chrKey == 'a'){
				intYHero = intYHero + 1;
			}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("m") && chrKey == 'd'){
				intYHero = intYHero - 1;
			}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("m") && chrKey == 's'){
				intXHero = intXHero - 1;
			}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("t") && chrKey == 'w'){
				intXHero = intXHero + 1;
			}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("t") && chrKey == 'a'){
				intYHero = intYHero + 1;
			}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("t") && chrKey == 'd'){
				intYHero = intYHero - 1;
			}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("t") && chrKey == 's'){
				intXHero = intXHero - 1;
			}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("s")){
			//Shop System
				intXHero = intXHero + 1;
				con2.clear();
				con2.println("What would you like to buy?");
				con2.drawImage(WepImage, 10, 40, null);
				con2.drawImage(SpeedImage, 100, 40, null);
				con2.drawImage(InfinityImage, 190, 40, null);
				con2.drawImage(CleaverImage, 280, 40, null);
				con2.drawImage(ChoiceImage, 10, 100, null);
				con2.drawImage(ChoiceTwoImage, 100, 100, null);
				con2.drawImage(ChoiceThreeImage, 190, 100, null);
				con2.drawImage(ChoiceFourImage, 280, 100, null);
				chrOption = con2.getChar();
	
				if(intMoney >= 1000 && chrOption == 'a' || intMoney >= 1000 && chrOption == 'A'){
				intDamage= intDamage + 100;
				intMoney = intMoney - 1000;
				con2.clear();
				con2.drawImage(AnimeImage, 10, 10, null);
				con2.println("              You have: " + intHealth + " health remaining");
				con2.println("              You have: " + intMoney + " money remaining");	
				con2.println("              You have: " + intDamage + " attack damage");
					}else if(intMoney < 1000 && chrOption == 'a' || intMoney < 1000 && chrOption == 'A'){
				con2.clear();
				con2.drawImage(AnimeImage, 10, 10, null);
				con2.println("              You have: " + intHealth + " health remaining");
				con2.println("              You have: " + intMoney + " money remaining");	
				con2.println("              You have: " + intDamage + " attack damage");
				}
					
				 if(intMoney >= 2000 & chrOption == 'b' || intMoney >=  2000 && chrOption == 'B'){
				intDamage = intDamage + 500;
				intMoney = intMoney - 2000;
				con2.clear();
				con2.drawImage(AnimeImage, 10, 10, null);
				con2.println("              You have: " + intHealth + " health remaining");
				con2.println("              You have: " + intMoney + " money remaining");	
				con2.println("              You have: " + intDamage + " attack damage");
				}else if(chrOption == 'B' && intMoney < 2000 || chrOption == 'b' && intMoney < 2000){
				con2.println("You don't have enough pick again");
				con2.clear();
				con2.drawImage(AnimeImage, 10, 10, null);
				con2.println("              You have: " + intHealth + " health remaining");
				con2.println("              You have: " + intMoney + " money remaining");	
				con2.println("              You have: " + intDamage + " attack damage");
				}
				if(intMoney >= 5000 & chrOption == 'C' || intMoney >= 5000 && chrOption == 'c'){
				intDamage = intDamage + 1000;
				intMoney = intMoney - 5000;
				con2.clear();
				con2.drawImage(AnimeImage, 10, 10, null);
				con2.println("              You have: " + intHealth + " health remaining");
				con2.println("              You have: " + intMoney + " money remaining");	
				con2.println("              You have: " + intDamage + " attack damage");
				}else if(intMoney < 5000 & chrOption == 'C' || intMoney < 5000 && chrOption == 'c'){
				con2.println("You don't have enough pick again");
				con2.clear();
				con2.drawImage(AnimeImage, 10, 10, null);
				con2.println("              You have: " + intHealth + " health remaining");
				con2.println("              You have: " + intMoney + " money remaining");	
				con2.println("              You have: " + intDamage + " attack damage");
				}
				if(intMoney >= 10000 & chrOption == 'D' || intMoney >= 10000 && chrOption == 'd'){
				intDamage =intDamage + 5000;
				intMoney = intMoney - 10000;
				con2.clear();
				con2.drawImage(AnimeImage, 10, 10, null);
				con2.println("              You have: " + intHealth + " health remaining");
				con2.println("              You have: " + intMoney + " money remaining");	
				con2.println("              You have: " + intDamage + " attack damage");
				}else if(intMoney < 10000 & chrOption == 'D' || intMoney < 10000 && chrOption == 'd'){
				con2.println("You don't have enough pick again");
				con2.clear();
				con2.drawImage(AnimeImage, 10, 10, null);
				con2.println("              You have: " + intHealth + " health remaining");
				con2.println("              You have: " + intMoney + " money remaining");	
				con2.println("              You have: " + intDamage + " attack damage");
				}
				if(chrOption == 'q' || chrOption == 'Q'){
				con2.clear();
				con2.drawImage(AnimeImage, 10,10, null);
				con2.println("              You have: " + intHealth + " health remaining");
				con2.println("              You have: " + intMoney + " money remaining");
				con2.println("              You have: " + intDamage + " attack damage");
				}
				
			}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("b") && chrKey == 'w'){
				//Healing System
				intXHero = intXHero + 1;
				con2.println("Would you like to heal? It cost 10 gold. Yes/No");
				strOption = con2.readLine();
				if(strOption.equalsIgnoreCase("Yes") && intMoney > 0){
				intHealth = intHealth + 10;
				intMoney = intMoney - 10;
				con2.clear();
				con2.drawImage(AnimeImage, 10, 10, null);
				con2.println("              You have: " + intHealth + " health remaining");
				con2.println("              You have: " + intMoney + " money remaining");	
				con2.println("              You have: " + intDamage + " attack damage");
		}
	 	if(strOption.equalsIgnoreCase("yes") && intMoney <= 0){
		con2.println("You don't have enough money");
		con2.clear();
		con2.drawImage(AnimeImage, 10,10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");
		con2.println("              You have: " + intDamage + " attack damage");
			}
		if(strOption.equalsIgnoreCase("No")){
		}
			}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("b") && chrKey == 'a'){
			con2.println("Would you like to heal? It cost 10 gold. Yes/No");
			strOption = con2.readLine();
				intYHero = intYHero + 1;
			if(strOption.equalsIgnoreCase("Yes") && intMoney > 0){
		intHealth = intHealth + 10;
		intMoney = intMoney - 10;
		con2.clear();
		con2.drawImage(AnimeImage, 10, 10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");	
		con2.println("              You have: " + intDamage + " attack damage");
		}
	 	if(strOption.equalsIgnoreCase("yes") && intMoney <= 0){
		con2.println("You don't have enough money");
		con2.clear();
		con2.drawImage(AnimeImage, 10,10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");
		con2.println("              You have: " + intDamage + " attack damage");
			}
		if(strOption.equalsIgnoreCase("No")){
		}
			}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("b") && chrKey == 'd'){
			con2.println("Would you like to heal? It cost 10 gold. Yes/No");
			strOption = con2.readLine();
				intYHero = intYHero - 1;
			if(strOption.equalsIgnoreCase("Yes") && intMoney > 0){
		intHealth = intHealth + 10;
		intMoney = intMoney - 10;
		con2.clear();
		con2.drawImage(AnimeImage, 10, 10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");	
		con2.println("              You have: " + intDamage + " attack damage");
		}
	 	if(strOption.equalsIgnoreCase("yes") && intMoney <= 0){
		con2.println("You don't have enough money");
		con2.clear();
		con2.drawImage(AnimeImage, 10,10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");
		con2.println("              You have: " + intDamage + " attack damage");
			}
		if(strOption.equalsIgnoreCase("No")){
		}
			}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("b") && chrKey == 's'){
				intXHero = intXHero - 1;
		con2.println("Would you like to heal? It cost 10 gold. Yes/No");
			strOption = con2.readLine();
			if(strOption.equalsIgnoreCase("Yes") && intMoney > 0){
		intHealth = intHealth + 10;
		intMoney = intMoney - 10;
		con2.clear();
		con2.drawImage(AnimeImage, 10, 10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");
		con2.println("              You have: " + intDamage + " attack damage");	
		}
	 	if(strOption.equalsIgnoreCase("yes") && intMoney <= 0){
		con2.println("You don't have enough money");
		con2.clear();
		con2.drawImage(AnimeImage, 10,10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");
		con2.println("              You have: " + intDamage + " attack damage");
			}
		if(strOption.equalsIgnoreCase("No")){
		}
			}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("a") && chrKey == 'w'){
				intXHero = intXHero + 1;
		con2.println("Would you like to heal? It cost 10 gold. Yes/No");
			strOption = con2.readLine();
		if(strOption.equalsIgnoreCase("Yes") && intMoney > 0){
		intHealth = intHealth + 10;
		intMoney = intMoney - 10;
		con2.clear();
		con2.drawImage(AnimeImage, 10, 10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");
		con2.println("              You have: " + intDamage + " attack damage");	
		}
	 	if(strOption.equalsIgnoreCase("yes") && intMoney <= 0){
		con2.println("You don't have enough money");
		con2.clear();
		con2.drawImage(AnimeImage, 10,10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");
		con2.println("              You have: " + intDamage + " attack damage");
			}
		if(strOption.equalsIgnoreCase("No")){
		}
			}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("a") && chrKey == 'a'){
				intYHero = intYHero + 1;
			con2.println("Would you like to heal? It cost 10 gold. Yes/No");
			strOption = con2.readLine();
		 if(strOption.equalsIgnoreCase("Yes") && intMoney > 0){
		intHealth = intHealth + 10;
		intMoney = intMoney - 10;
		con2.clear();
		con2.drawImage(AnimeImage, 10, 10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");	
		}
	 	if(strOption.equalsIgnoreCase("yes") && intMoney <= 0){
		con2.println("You don't have enough money");
		con2.clear();
		con2.drawImage(AnimeImage, 10,10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");
		con2.println("              You have: " + intDamage + " attack damage");
			}
		if(strOption.equalsIgnoreCase("No")){
		con2.clear();
		con2.drawImage(AnimeImage, 10,10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");
		con2.println("              You have: " + intDamage + " attack damage");
		}
		
		}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("a") && chrKey == 'd'){
		intYHero = intYHero - 1;
		con2.println("Would you like to heal? It cost 10 gold. Yes/No");
		strOption = con2.readLine();
		if(strOption.equalsIgnoreCase("Yes") && intMoney > 0){
		intHealth = intHealth + 10;
		intMoney = intMoney - 10;
		con2.clear();
		con2.drawImage(AnimeImage, 10, 10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");
		con2.println("              You have: " + intDamage + " attack damage");	
		}
	 	if(strOption.equalsIgnoreCase("yes") && intMoney <= 0){
		con2.println("You don't have enough money");
		con2.clear();
		con2.drawImage(AnimeImage, 10,10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");
		con2.println("              You have: " + intDamage + " attack damage");
			}
		if(strOption.equalsIgnoreCase("No")){
		con2.clear();
		con2.drawImage(AnimeImage, 10,10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");
		con2.println("              You have: " + intDamage + " attack damage");
		}
			}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("a") && chrKey == 's'){
				intXHero = intXHero - 1;
				con2.println("Would you like to heal? It cost 10 gold. Yes/No");
			strOption = con2.readLine();
		if(strOption.equalsIgnoreCase("Yes") && intMoney > 0){
		intHealth = intHealth + 10;
		intMoney = intMoney - 10;
		con2.clear();
		con2.drawImage(AnimeImage, 10, 10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");	
		con2.println("              You have: " + intDamage + " attack damage");
		}
	 	if(strOption.equalsIgnoreCase("yes") && intMoney <= 0){
		con2.println("You don't have enough money");
		con2.clear();
		con2.drawImage(AnimeImage, 10,10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");
		con2.println("              You have: " + intDamage + " attack damage");
			}
		if(strOption.equalsIgnoreCase("No")){
		con2.clear();
		con2.drawImage(AnimeImage, 10,10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");
		con2.println("              You have: " + intDamage + " attack damage");
		}
		
		}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("r") && chrKey == 'w'){
			intXHero = intXHero + 1;
			con2.println("Would you like to heal? It cost 10 gold. Yes/No");
			strOption = con2.readLine();
			if(strOption.equalsIgnoreCase("Yes") && intMoney > 0){
				intHealth = intHealth + 10;
				intMoney = intMoney - 10;
				con2.clear();
				con2.drawImage(AnimeImage, 10, 10, null);
				con2.println("              You have: " + intHealth + " health remaining");
				con2.println("              You have: " + intMoney + " money remaining");
				con2.println("              You have: " + intDamage + " attack damage");	
			}
		 	if(strOption.equalsIgnoreCase("yes") && intMoney <= 0){
				con2.println("You don't have enough money");
				con2.clear();
				con2.drawImage(AnimeImage, 10,10, null);
				con2.println("              You have: " + intHealth + " health remaining");
				con2.println("              You have: " + intMoney + " money remaining");
				con2.println("              You have: " + intDamage + " attack damage");
			}
			if(strOption.equalsIgnoreCase("No")){
				con2.clear();
				con2.drawImage(AnimeImage, 10,10, null);
				con2.println("              You have: " + intHealth + " health remaining");
				con2.println("              You have: " + intMoney + " money remaining");
				con2.println("              You have: " + intDamage + " attack damage");
			}
					
		}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("r") && chrKey == 'a'){
			intYHero = intYHero + 1;
			con2.println("Would you like to heal? It cost 10 gold. Yes/No");
			strOption = con2.readLine();
		    if(strOption.equalsIgnoreCase("Yes") && intMoney > 0){
				intHealth = intHealth + 10;
				intMoney = intMoney - 10;
				con2.clear();
				con2.drawImage(AnimeImage, 10, 10, null);
				con2.println("              You have: " + intHealth + " health remaining");
				con2.println("              You have: " + intMoney + " money remaining");
				con2.println("              You have: " + intDamage + " attack damage");	
			}
		 	if(strOption.equalsIgnoreCase("yes") && intMoney <= 0){
				con2.println("You don't have enough money");
				con2.clear();
				con2.drawImage(AnimeImage, 10,10, null);
				con2.println("              You have: " + intHealth + " health remaining");
				con2.println("              You have: " + intMoney + " money remaining");
				con2.println("              You have: " + intDamage + " attack damage");
			}
			if(strOption.equalsIgnoreCase("No")){
				con2.clear();
				con2.drawImage(AnimeImage, 10,10, null);
				con2.println("              You have: " + intHealth + " health remaining");
				con2.println("              You have: " + intMoney + " money remaining");
				con2.println("              You have: " + intDamage + " attack damage");
			}
			
					
			}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("r") && chrKey == 'd'){
				intYHero  = intYHero - 1;
				con2.println("Would you like to heal? It cost 10 gold. Yes/No");
			strOption = con2.readLine();
		if(strOption.equalsIgnoreCase("Yes") && intMoney > 0){
		intHealth = intHealth + 10;
		intMoney = intMoney - 10;
		con2.clear();
		con2.drawImage(AnimeImage, 10, 10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");	
		con2.println("              You have: " + intDamage + " attack damage");
		}
	 	if(strOption.equalsIgnoreCase("yes") && intMoney <= 0){
		con2.println("You don't have enough money");
		con2.clear();
		con2.drawImage(AnimeImage, 10,10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");
		con2.println("              You have: " + intDamage + " attack damage");
			}
		if(strOption.equalsIgnoreCase("No")){
		con2.clear();
		con2.drawImage(AnimeImage, 10,10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");
		con2.println("              You have: " + intDamage + " attack damage");
		}
			
			}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("r") && chrKey == 's'){
		intXHero = intXHero - 1;
		con2.println("Would you like to heal? It cost 10 gold. Yes/No");
		strOption = con2.readLine();
		if(strOption.equalsIgnoreCase("Yes") && intMoney > 0){
		intHealth = intHealth + 10;
		intMoney = intMoney - 10;
		con2.clear();
		con2.drawImage(AnimeImage, 10, 10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");	
		con2.println("              You have: " + intDamage + " attack damage");
		}
	 	if(strOption.equalsIgnoreCase("yes") && intMoney <= 0){
		con2.println("You don't have enough money");
		con2.clear();
		con2.drawImage(AnimeImage, 10,10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");
		con2.println("              You have: " + intDamage + " attack damage");
			}
		if(strOption.equalsIgnoreCase("No")){
		con2.clear();
		con2.drawImage(AnimeImage, 10,10, null);
		con2.println("              You have: " + intHealth + " health remaining");
		con2.println("              You have: " + intMoney + " money remaining");
		con2.println("              You have: " + intDamage + " attack damage");
		}
		}else if(strMapTwo[intYHero][intXHero].substring(0,1).equalsIgnoreCase("v")){
		blnChangeMap = false;
		blnMap1 = true;
		blnMap2 = false;
		con.clear();
		intXHero = intXHero + 1;
		}
		if(blnChangeMap == true){
		for(intCounter = 0; intCounter < 20; intCounter ++){
			for(intCheck = 0; intCheck < 20; intCheck ++){
		if(strMapTwo[intCounter][intCheck].equalsIgnoreCase("t")){
			intX = intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(TableImage, intX, intY, null);
		}else if(strMapTwo[intCounter][intCheck].equalsIgnoreCase("e")){
			intX=  intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(FloorImage,intX, intY, null);
		}else if(strMapTwo[intCounter][intCheck].equalsIgnoreCase("r")){
			intX = intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(NpcImage, intX, intY, null);
		}else if(strMapTwo[intCounter][intCheck].equalsIgnoreCase("b")){
			intX =intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(BookcaseImage, intX, intY, null);
		}else if(strMapTwo[intCounter][intCheck].equalsIgnoreCase("a")){
			intX = intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(PersonImage, intX, intY, null);
			}else if(strMapTwo[intCounter][intCheck].equalsIgnoreCase("f")){
			intX = intCounter * 33;
			intY = intCheck * 34;
			con.drawImage(FlowerImage,intX, intY, null);
					}
				}
			}
			con.drawImage(HeroImageTwo, intYHero * 33, intXHero * 34, null);
			}	
			}
		}		
			
			}
			//Loading Dungeon Map
			while(blnMap2 == true){
				strMapThree = allenutils.maptwo(strMapNameThree);
				intCheck  =0;
				intYHero = 0;
				intXHero = 0;
					for(intCheck = 0; intCheck < 20; intCheck ++){
					for(intCounter = 0; intCounter < 20; intCounter ++){
				if(strMapThree[intCounter][intCheck].equalsIgnoreCase("e")){
					intX = intCounter * 33;
					intY = intCheck * 34;
					con.drawImage(RockImage,intX, intY, null);
				}else if(strMapThree[intCounter][intCheck].equalsIgnoreCase("m")){
					intX = intCounter * 33;
					intY = intCheck * 34;
					con.drawImage(MonsterImage, intX, intY, null);
				}else if(strMapThree[intCounter][intCheck].equalsIgnoreCase("g")){
					intX= intCounter * 33;
					intY = intCheck * 34;
					con.drawImage(GoldMineImage, intX, intY, null);
				}else if(strMapThree[intCounter][intCheck].equalsIgnoreCase("b")){
					intX = intCounter * 33;
					intY = intCheck * 34;
					con.drawImage(BirdImage, intX, intY, null);
				}else if(strMapThree[intCounter][intCheck].equalsIgnoreCase("v")){
					intX = intCounter * 33;
					intY = intCheck * 34;
					con.drawImage(EntranceImage, intX, intY , null);
				}else if(strMapThree[intCounter][intCheck].equalsIgnoreCase("u")){
					intX = intCounter * 33;
					intY = intCheck * 34;
					con.drawImage(BowImage,intX, intY, null);
				}else if(strMapThree[intCounter][intCheck].equalsIgnoreCase("y")){
					intX = intCounter * 33;
					intY = intCheck * 34;
					con.drawImage(FinalImage, intX, intY, null);
				}
			}
		}
			con.drawImage(HeroImageThree, 33, 34, null);
			intYHero = 1;
			intXHero = 1;
			while(blnMap2 == true){
			//Move System for my Map
			chrKey = con.getChar();
			if(chrKey == 'w'){
				intXHero = intXHero - 1;
			}else if(chrKey == 'a'){
				intYHero = intYHero-1;
			}else if(chrKey == 'd'){
				intYHero = intYHero + 1;		
			}else if(chrKey == 's'){
				intXHero = intXHero + 1;
		}
			if(strMapThree[intYHero][intXHero].substring(0,1).equalsIgnoreCase("g") && chrKey == 'w'){
			intXHero = intXHero + 1;
			}else if(strMapThree[intYHero][intXHero].substring(0,1).equalsIgnoreCase("g") && chrKey == 'a'){
			intYHero = intYHero + 1;
			
			}else if(strMapThree[intYHero][intXHero].substring(0,1).equalsIgnoreCase("g") && chrKey == 'd'){
			intYHero = intYHero - 1;
			
			}else if(strMapThree[intYHero][intXHero].substring(0,1).equalsIgnoreCase("g") && chrKey == 's'){
			intXHero = intXHero - 1;
			
			}else if(strMapThree[intYHero][intXHero].substring(0,1).equalsIgnoreCase("b") && chrKey == 'w'){
			intXHero = intXHero + 1;
			intBattleDamage = (int)(Math.random()*intDamage + 1);
			con3.println(intBattleDamage);
			intDamageTaken = (int)(Math.random()*80+ 1);
			con3.println(intDamageTaken);
			if(intBattleDamage > intDamageTaken){
			con3.println("You win");
			}else if(intBattleDamage < intDamageTaken){
			con3.println("You lost");
		
			}
			//Battle System for the dungeon
	
			intHealth = intHealth - intDamageTaken;
			intMoney = intMoney + 500;
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");	
			con2.println("              You have: " + intDamage + " attack damage");
			if(intHealth <= 0){
			con.clear();
			blnMap1 = false;
			blnChangeMap = false;
			blnMap2 = false;
			break;
			}
			
			}else if(strMapThree[intYHero][intXHero].substring(0,1).equalsIgnoreCase("b") && chrKey == 'a'){
			intYHero = intYHero + 1;
			intBattleDamage = (int)(Math.random()*intDamage + 1);
			con3.println(intBattleDamage);
			intDamageTaken = (int)(Math.random()*80+ 1);
			con3.println(intDamageTaken);
			if(intBattleDamage > intDamageTaken){
			con3.println("You win");
			}else if(intBattleDamage < intDamageTaken){
			con3.println("You lost");
		
			}
				
	
			intHealth = intHealth - intDamageTaken;
			intMoney = intMoney + 500;
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");	
			con2.println("              You have: " + intDamage + " attack damage");
			if(intHealth <= 0){
			con.clear();
			blnMap1 = false;
			blnChangeMap = false;
			blnMap2 = false;
			break;
			}
			}else if(strMapThree[intYHero][intXHero].substring(0,1).equalsIgnoreCase("b") && chrKey == 'd'){
			intYHero = intYHero - 1;
			intBattleDamage = (int)(Math.random()*intDamage + 1);
			con3.println(intBattleDamage);
			intDamageTaken = (int)(Math.random()*80+ 1);
			con3.println(intDamageTaken);
			if(intBattleDamage > intDamageTaken){
			con3.println("You win");
			}else if(intBattleDamage < intDamageTaken){
			con3.println("You lost");
		
			}
				
	
			intHealth = intHealth - intDamageTaken;
			intMoney = intMoney + 500;
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");	
			if(intHealth <= 0){
			con.clear();
			blnMap1 = false;
			blnChangeMap = false;
			blnMap2 = false;
			break;
			}
			}else if(strMapThree[intYHero][intXHero].substring(0,1).equalsIgnoreCase("b") && chrKey == 's'){
			intXHero = intXHero - 1;
			intBattleDamage = (int)(Math.random()*intDamage + 1);
			con3.println(intBattleDamage);
			intDamageTaken = (int)(Math.random()*80+ 1);
			con3.println(intDamageTaken);
			if(intBattleDamage > intDamageTaken){
			con3.println("You win");
			}else if(intBattleDamage < intDamageTaken){
			con3.println("You lost");
		
			}
				
	
			intHealth = intHealth - intDamageTaken;
			intMoney = intMoney + 500;
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");	
			con2.println("              You have: " + intDamage + " attack damage");
			if(intHealth <= 0){
			con.clear();
			blnMap1 = false;
			blnChangeMap = false;
			blnMap2 = false;
			break;
			}
			}else if(strMapThree[intYHero][intXHero].substring(0,1).equalsIgnoreCase("m") && chrKey == 'w'){
				intXHero = intXHero + 1;
			intBattleDamage = (int)(Math.random()*intDamage + 1);
			con3.println(intBattleDamage);
			intDamageTaken = (int)(Math.random()*400+ 1);
			con3.println(intDamageTaken);
			if(intBattleDamage > intDamageTaken){
			con3.println("You win");
				}else if(intBattleDamage < intDamageTaken){
			con3.println("You lost");
		
			}
				
	
			intHealth = intHealth - intDamageTaken;
			intMoney = intMoney + 500;
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");	
			if(intHealth <= 0){
			con.clear();
			blnMap1 = false;
			blnChangeMap = false;
			blnMap2 = false;
			break;
			}
			}else if(strMapThree[intYHero][intXHero].substring(0,1).equalsIgnoreCase("m") && chrKey == 'a'){
				intYHero = intYHero + 1;
			intBattleDamage = (int)(Math.random()*intDamage + 1);
			con3.println(intBattleDamage);
			intDamageTaken = (int)(Math.random()*400 + 1);
			con3.println(intDamageTaken);
			if(intBattleDamage > intDamageTaken){
			con3.println("You win");
				}else if(intBattleDamage < intDamageTaken){
			con3.println("You lost");
		
			}
				
	
			intHealth = intHealth - intDamageTaken;
			intMoney = intMoney + 500;
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");	
			if(intHealth <= 0){
			con.clear();
			blnMap1 = false;
			blnChangeMap = false;
			blnMap2 = false;
			break;
			}
			}else if(strMapThree[intYHero][intXHero].substring(0,1).equalsIgnoreCase("m") && chrKey == 'd'){
				intYHero = intYHero - 1;
			intBattleDamage = (int)(Math.random()*intDamage + 1);
			con3.println(intBattleDamage);
			intDamageTaken = (int)(Math.random()*400 + 1);
			con3.println(intDamageTaken);
			if(intBattleDamage > intDamageTaken){
			con3.println("You win");
				}else if(intBattleDamage < intDamageTaken){
			con3.println("You lost");
		
			}
				
	
			intHealth = intHealth - intDamageTaken;
			intMoney = intMoney + 500;
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");	
			con2.println("              You have: " + intDamage + " attack damage");
			if(intHealth <= 0){
			con.clear();
			blnMap1 = false;
			blnChangeMap = false;
			blnMap2 = false;
			break;
			}
			}else if(strMapThree[intYHero][intXHero].substring(0,1).equalsIgnoreCase("m") && chrKey == 's'){
				intXHero = intXHero - 1;
			intBattleDamage = (int)(Math.random()*intDamage + 1);
			con3.println(intBattleDamage);
			intDamageTaken = (int)(Math.random()*400 + 1);
			con3.println(intDamageTaken);
			if(intBattleDamage > intDamageTaken){
			con3.println("You win");
				}else if(intBattleDamage < intDamageTaken){
			con3.println("You lost");
		
			}
				
	
			intHealth = intHealth - intDamageTaken;
			intMoney = intMoney + 500;
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");	
			con2.println("              You have: " + intDamage + " attack damage");
			if(intHealth <= 0){
			con.clear();
			blnMap1 = false;
			blnChangeMap = false;
			blnMap2 = false;
			break;
			}
			}else if(strMapThree[intYHero][intXHero].substring(0,1).equalsIgnoreCase("v")){
				blnMap2 = false;
				blnMap1 = true;
				con.clear();
				intXHero = intXHero +1;
				
			}else if(strMapThree[intYHero][intXHero].substring(0,1).equalsIgnoreCase("u") && chrKey == 'a'){
			//Objects in the Dungeon System
			intYHero = intYHero + 1;
			if(intDamage <300){
			con2.println("This item will give you 90 + damage, would you like to pick it up?");
			strOption = con2.readLine();
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
			
			}else if(intDamage > 190){
			con2.println("YOU'RE TOO STRONG FOR THIS OBJECT MOVE ON NOOB!");
			} 
			if(strOption.equalsIgnoreCase("Yes")){
				intDamage = intDamage + 90;
				
				strOption = "    ";
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
				
			}else if(strOption.equalsIgnoreCase("No")){
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
				}
			}else if(strMapThree[intYHero][intXHero].substring(0,1).equalsIgnoreCase("u") && chrKey == 'w'){
			intXHero = intXHero + 1;
			if(intDamage <300){
			con2.println("This item will give you 90 + damage, would you like to pick it up?");
			strOption = con2.readLine();
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
			
			}else if(intDamage > 190){
			con2.println("YOU'RE TOO STRONG FOR THIS OBJECT MOVE ON NOOB!");
			} 
			if(strOption.equalsIgnoreCase("Yes")){
				intDamage = intDamage + 90;
			
				strOption = "    ";
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
				
			}else if(strOption.equalsIgnoreCase("No")){
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
				}
			}else if(strMapThree[intYHero][intXHero].substring(0,1).equalsIgnoreCase("u") && chrKey == 'd'){
			intYHero = intYHero - 1;
			if(intDamage <300){
			con2.println("This item will give you 90 + damage, would you like to pick it up?");
			strOption = con2.readLine();
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
				con2.println("              You have: " + intDamage + " attack damage");
			
			}else if(intDamage > 190){
			con2.println("YOU'RE TOO STRONG FOR THIS OBJECT MOVE ON NOOB!");
			} 
			if(strOption.equalsIgnoreCase("Yes")){
				intDamage = intDamage + 90;
			
				strOption = "    ";
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
				
			}else if(strOption.equalsIgnoreCase("No")){
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
				}
			}else if(strMapThree[intYHero][intXHero].substring(0,1).equalsIgnoreCase("u") && chrKey == 's'){
			intXHero = intXHero - 1;
			if(intDamage <300){
			con2.println("This item will give you 90 + damage, would you like to pick it up?");
			strOption = con2.readLine();
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
				con2.println("              You have: " + intDamage + " attack damage");
			
			}else if(intDamage > 190){
			con2.println("YOU'RE TOO STRONG FOR THIS OBJECT MOVE ON NOOB!");
			} 
			if(strOption.equalsIgnoreCase("Yes")){
				intDamage = intDamage + 90;
				strOption = "    ";
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
				
			}else if(strOption.equalsIgnoreCase("No")){
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
				con2.println("              You have: " + intDamage + " attack damage");
				}
			}else if(strMapThree[intYHero][intXHero].substring(0,1).equalsIgnoreCase("v")){
				blnMap2 = false;
				blnMap1 = true;
				con.clear();
				intXHero = intXHero +1;
				
			}else if(strMapThree[intYHero][intXHero].substring(0,1).equalsIgnoreCase("y") && chrKey == 'a'){
			intYHero = intYHero + 1;
			if(intDamage <500){
			con2.println("This item will give you 200 + damage, would you like to pick it up?");
			strOption = con2.readLine();
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
			}else if(intDamage > 500){
			con2.println("YOU'RE TOO STRONG FOR THIS OBJECT MOVE ON NOOB!");
			} 
			if(strOption.equalsIgnoreCase("Yes")){
				intDamage = intDamage + 200;
				strOption = "    ";
				
			}else if(strOption.equalsIgnoreCase("No")){
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
				}
			}else if(strMapThree[intYHero][intXHero].substring(0,1).equalsIgnoreCase("y") && chrKey == 'w'){
			intXHero = intXHero + 1;
			if(intDamage <500){
			con2.println("This item will give you 200 + damage, would you like to pick it up?");
			strOption = con2.readLine();
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
			}else if(intDamage > 500){
			con2.println("YOU'RE TOO STRONG FOR THIS OBJECT MOVE ON NOOB!");
			} 
			if(strOption.equalsIgnoreCase("Yes")){
				intDamage = intDamage + 200;
			
				strOption = "    ";
				
			}else if(strOption.equalsIgnoreCase("No")){
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
				}
			}else if(strMapThree[intYHero][intXHero].substring(0,1).equalsIgnoreCase("y") && chrKey == 'd'){
			intYHero = intYHero - 1;
			if(intDamage <500){
			con2.println("This item will give you 200 + damage, would you like to pick it up?");
			strOption = con2.readLine();
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
			}else if(intDamage > 500){
			con2.println("YOU'RE TOO STRONG FOR THIS OBJECT MOVE ON NOOB!");
			} 
			if(strOption.equalsIgnoreCase("Yes")){
				intDamage = intDamage + 200;
	
				strOption = "    ";
				
			}else if(strOption.equalsIgnoreCase("No")){
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
				}
			}else if(strMapThree[intYHero][intXHero].substring(0,1).equalsIgnoreCase("y") && chrKey == 's'){
			intXHero = intXHero - 1;
			if(intDamage <500){
			con2.println("This item will give you 200 + damage, would you like to pick it up?");
			strOption = con2.readLine();
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
			}else if(intDamage > 500){
			con2.println("YOU'RE TOO STRONG FOR THIS OBJECT MOVE ON NOOB!");
			} 
			if(strOption.equalsIgnoreCase("Yes")){
				intDamage = intDamage + 200;
				strOption = "    ";
				con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			con2.println("              You have: " + intHealth + " health remaining");
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
				
			}else if(strOption.equalsIgnoreCase("No")){
			con2.clear();
			con2.drawImage(AnimeImage, 10, 10, null);
			
			con2.println("              You have: " + intMoney + " money remaining");
			con2.println("              You have: " + intDamage + " attack damage");
				}
			}
			//Redrawing the Map
			if(blnMap2 == true){
			for(intCheck = 0; intCheck < 20; intCheck ++){
				for(intCounter = 0; intCounter < 20; intCounter ++){
			if(strMapThree[intCounter][intCheck].equalsIgnoreCase("e")){
				intX = intCounter * 33;
				intY = intCheck * 34; 
				con.drawImage(RockImage, intX, intY, null);
					
			}
			}
		
		}
			con.drawImage(HeroImageThree, intYHero * 33, intXHero * 34, null);
			}	
		}
		}
			
		}
			}
			//Ending system for the game
			//Making Pictures
			if(intHealth <= 100){
				con.clear();
				con2.clear();
				con2.println("              You have: " + intHealth + " health remaining");
				con.drawImage(ThankImage, 10, 10, null);
				con.println("Thank you for playing, try again some time!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				}
	}
}
