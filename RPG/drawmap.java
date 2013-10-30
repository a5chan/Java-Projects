import hsa.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;

public class drawmap{
	public static void main(String[] args){
		Console con = new Console();
		
		String strMap[][];
		strMap = new String[20][20];
		
		int intRow;
		int intCol;
		strMap = cadawasutils.loadmap("mapone.csv");
		int intHRow = 0;
		int intHCol = 0;
		char chrMove = ' ';
		File grassfile = null;
		BufferedImage grassimage = null;
		File housefile = null;
		BufferedImage houseimage = null;
		File treefile = null;
		BufferedImage treeimage = null;
		File waterfile = null;
		BufferedImage waterimage = null;
		File herofile = null;
		BufferedImage heroimage = null;
		try{	
     		grassfile = new File("grass.png");
     		grassimage = ImageIO.read(grassfile);
     		housefile = new File("house.png");
     		houseimage = ImageIO.read(housefile);
     		treefile = new File("tree.png");
     		treeimage = ImageIO.read(treefile);
     		waterfile = new File("water.png");
     		waterimage = ImageIO.read(waterfile);
     		herofile = new File("hero.png");
     		heroimage = ImageIO.read(herofile);
 		}catch(IOException e){ 	
 		}
 		
 		for(intRow = 0; intRow < 20; intRow++){
	 		for(intCol = 0; intCol < 20; intCol++){
		 		if(strMap[intRow][intCol].equals("g")){
		 			con.drawImage(grassimage, intCol*20, intRow*20, null);			 		
		 		}else if(strMap[intRow][intCol].equals("h")){
		 			con.drawImage(houseimage, intCol*20, intRow*20, null);			 		
		 		}else if(strMap[intRow][intCol].equals("t")){
		 			con.drawImage(treeimage, intCol*20, intRow*20, null);			 		
		 		}else if(strMap[intRow][intCol].equals("w")){
		 			con.drawImage(waterimage, intCol*20, intRow*20, null);			 		
		 		}			 					 		
	 		}
 		}
		con.drawImage(heroimage, intHCol*20, intHRow*20, null);			 		
 	 		
		while(true){
			chrMove = con.getChar();
			if(chrMove == 'w'){
				intHRow = intHRow - 1;
			}else if(chrMove == 's'){
				intHRow = intHRow + 1;
			}else if(chrMove == 'a'){
				intHCol = intHCol - 1;
			}else if(chrMove == 'd'){
				intHCol = intHCol + 1;
			}
			
	 		for(intRow = 0; intRow < 20; intRow++){
		 		for(intCol = 0; intCol < 20; intCol++){
			 		if(strMap[intRow][intCol].equals("g")){
			 			con.drawImage(grassimage, intCol*20, intRow*20, null);			 		
			 		}else if(strMap[intRow][intCol].equals("h")){
			 			con.drawImage(houseimage, intCol*20, intRow*20, null);			 		
			 		}else if(strMap[intRow][intCol].equals("t")){
			 			con.drawImage(treeimage, intCol*20, intRow*20, null);			 		
			 		}else if(strMap[intRow][intCol].equals("w")){
			 			con.drawImage(waterimage, intCol*20, intRow*20, null);			 		
			 		}			 					 		
		 		}
	 		}
			con.drawImage(heroimage, intHCol*20, intHRow*20, null);			 		
		}	
	}
}