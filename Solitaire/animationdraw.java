package solitaire;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import static solitaire.Solitaire.hiddenImage;
import static solitaire.Solitaire.hiddenfile;

public class animationdraw extends JPanel{
	//Properties
	public static int xboundary[][];
        public static int yboundary[][];
        public static int xposition;
        public static int yposition;
        public static int tempx;
        public static int tempy;
        public static boolean successful = false;
        public static int temparray[] = new int[20];
        public static int times = 0;
        public static int counter = 0;
        public static int countertwo = 0;
	//Constructor
	
	public animationdraw(){
		super();

	}
	
	//Methods
       
	public void paintComponent(Graphics g){
            
             try{
    hiddenfile = new File("hidden.png");
    hiddenImage = ImageIO.read(hiddenfile);
    }catch(IOException e){
			
		}
		Graphics2D g2d=(Graphics2D)g;
                int i = 0;
                int j = 0;
                g2d.setColor(Color.green);
                g2d.drawRect(40,25, 725, 500);
                 g2d.drawRect(800,400,80,120);
                   g2d.drawRect(900,400,80,120);
                     g2d.drawRect(1000,400,80,120);
                       g2d.drawRect(1100,400,80,120);
                      
Solitaire.thePanel.add(Solitaire.thetester2);
Solitaire.thePanel.add(Solitaire.theselectionbutton);
if(Solitaire.clubnum != 0){
    g2d.drawImage(Solitaire.cardImage[Solitaire.clubload[Solitaire.clubnum - 1]], 800, 400, null);
}
if(Solitaire.heartnum != 0){
    g2d.drawImage(Solitaire.cardImage[Solitaire.heartload[Solitaire.heartnum - 1]], 900, 400, null);
}
if(Solitaire.spadenum != 0){
    g2d.drawImage(Solitaire.cardImage[Solitaire.spadeload[Solitaire.spadenum-1]], 1000, 400, null);
}
if(Solitaire.diamondnum != 0){
    g2d.drawImage(Solitaire.cardImage[Solitaire.diamondload[Solitaire.diamondnum-1]], 1100, 400, null);
}

        
        
        
                if(Solitaire.draggedstack == true){
               
                if(times == 0){
         
                 
                  for(j = Solitaire.yplace; j < 30; j ++){
                 
                      if(Solitaire.cardvalues[Solitaire.xplace][j] != 52){
                    temparray[counter] = Solitaire.cardvalues[Solitaire.xplace][j];
                  
                  counter ++;
      
                        }else{
                        break;
                    }
               }
         times ++;

                    }

                for(countertwo = 0; countertwo < counter; countertwo ++){
          
                g2d.drawImage(Solitaire.cardImage[temparray[countertwo]], Solitaire.movex, Solitaire.movey + countertwo * 50, null);
                Solitaire.cardvalues[Solitaire.xplace][Solitaire.yplace + countertwo] = 52;
                }
            
                }
                     if(Solitaire.dragged == true && Solitaire.enterfromfield == false){

                     if(times == 0){
                    tempx = Solitaire.cardvalues[Solitaire.xplace][Solitaire.yplace];
                    times ++;
                     }
                   
                    g2d.drawImage(Solitaire.cardImage[tempx], Solitaire.movex, Solitaire.movey, null);
                    Solitaire.cardvalues[Solitaire.xplace][Solitaire.yplace] = 52;
                    System.out.println("i dragged it here");
                }
                     if(Solitaire.dragsidedeck == true){

                     if(times == 0){
                    tempx = Solitaire.sidedeck[Solitaire.selected];
                   
                    times ++;
                     }
                   
                    g2d.drawImage(Solitaire.cardImage[tempx], Solitaire.movex, Solitaire.movey, null);
                    Solitaire.sidedeck[Solitaire.selected] = 52;
                }
                     if(Solitaire.answer == true && Solitaire.draggedstack == false){
                     if(times == 0){
                     if(Solitaire.sidedecking == true){
                     System.out.println("selection");
                     tempx = Solitaire.sidedeck[Solitaire.selected];
                    
                     Solitaire.sidedeck[Solitaire.selected] = 52;
                     if(Solitaire.selected < 23){
                     Solitaire.selected ++;
                     }else{
                     Solitaire.selected = 0 ;
                     }
                     }else{
                    tempx = Solitaire.cardvalues[Solitaire.xplace][Solitaire.yplace];
                  
                    Solitaire.cardvalues[Solitaire.xplace][Solitaire.yplace] = 52;
                     }
                    times ++;
                     }
                  
                     g2d.drawImage(Solitaire.cardImage[tempx], Solitaire.xput * 100 + 50, Solitaire.yput * 50 + 50, null);
                   
                   if(Solitaire.empty == true){
                  System.out.println("hello");
                        Solitaire.cardvalues[Solitaire.xput][Solitaire.yput] = tempx;
                    }else{

                     Solitaire.cardvalues[Solitaire.xput][Solitaire.yput+1] = tempx;
                   }
                     try{
                         Solitaire.revealed[Solitaire.xplace][Solitaire.yplace-1] = true;
                     }catch(ArrayIndexOutOfBoundsException e){
                         
                     }
                     
                     
                     }
                     if(Solitaire.stackedanswer == true){
               
  
                     for(countertwo = 0; countertwo < counter; countertwo ++){
         

                g2d.drawImage(Solitaire.cardImage[temparray[countertwo]], Solitaire.xput * 100 + 50, (Solitaire.yput  + countertwo) * 50 + 50, null);
                if(Solitaire.empty == true){
                                    Solitaire.cardvalues[Solitaire.xplace][Solitaire.yplace + countertwo] = 52;
                       Solitaire.cardvalues[Solitaire.xput][Solitaire.yput+countertwo] = temparray[countertwo];
                
                }else{
                Solitaire.cardvalues[Solitaire.xplace][Solitaire.yplace + countertwo] = 52;
                       Solitaire.cardvalues[Solitaire.xput][Solitaire.yput+countertwo + 1] = temparray[countertwo];
 
                }
                   
                     }
                    
                     try{
                         Solitaire.revealed[Solitaire.xplace][Solitaire.yplace-1] = true;
                     }catch(ArrayIndexOutOfBoundsException e){
                        
                     }
 Solitaire.stackedanswer = false;
                     }
                     if(Solitaire.legit == true && Solitaire.enterfromsidedeck == true){
                        
                                 if(Solitaire.suite.equalsIgnoreCase("Clubs") && Solitaire.legit == true){
Solitaire.clubnum ++;
     }else if(Solitaire.suite.equalsIgnoreCase("Hearts")  && Solitaire.legit == true){
      Solitaire.heartnum ++;
     }else if(Solitaire.suite.equalsIgnoreCase("Spades")  && Solitaire.legit == true){
Solitaire.spadenum ++;
     }else if(Solitaire.suite.equalsIgnoreCase("Diamonds")  && Solitaire.legit == true){
Solitaire.diamondnum ++;
     }
                 System.out.println("spade num" + Solitaire.spadenum);
                  System.out.println("club num" + Solitaire.clubnum);
                   System.out.println("diamond num " + Solitaire.diamondnum);
                    System.out.println("heart num " + Solitaire.heartnum);
                     tempx = Solitaire.valueone;
                    
                     Solitaire.sidedeck[Solitaire.selected] = 52;
                 
                     if(Solitaire.selected < 23){
                     Solitaire.selected ++;
                     }else{
                         Solitaire.selected =0;
                     }
                      
           
                    
                     }
                     if(Solitaire.legit == true && Solitaire.enterfromfield == true && Solitaire.cardvalues[Solitaire.xplace][Solitaire.yplace + 1] == 52 && Solitaire.cardvalues[Solitaire.xplace][Solitaire.yplace] != 52){
                          if(Solitaire.suite.equalsIgnoreCase("Clubs") && Solitaire.legit == true){
Solitaire.clubnum ++;
     }else if(Solitaire.suite.equalsIgnoreCase("Hearts")  && Solitaire.legit == true){
      Solitaire.heartnum ++;
     }else if(Solitaire.suite.equalsIgnoreCase("Spades")  && Solitaire.legit == true){
Solitaire.spadenum ++;
     }else if(Solitaire.suite.equalsIgnoreCase("Diamonds")  && Solitaire.legit == true){
Solitaire.diamondnum ++;
     }System.out.println("how many times is it running this");
                 System.out.println("spade num" + Solitaire.spadenum);
                  System.out.println("club num" + Solitaire.clubnum);
                   System.out.println("diamond num " + Solitaire.diamondnum);
                    System.out.println("heart num " + Solitaire.heartnum);
                     tempx = Solitaire.valueone;
                    
                     Solitaire.cardvalues[Solitaire.xplace][Solitaire.yplace] = 52;
                        try{
                         Solitaire.revealed[Solitaire.xplace][Solitaire.yplace-1] = true;
                     }catch(ArrayIndexOutOfBoundsException e){
                        
                     }
                     }
          
                    for(i = 0; i < 7; i ++){
                    g2d.drawRect(i * 100 + 50,50,75,120);
                    for(j = 0; j < 20; j ++){
                        if(j > i){
                        g2d.drawImage(Solitaire.cardImage[Solitaire.cardvalues[i][j]], i * 100 + 50, j * 50 + 50, null);
                        }else{
                        if(Solitaire.revealed[i][j] == false){
                            g2d.drawImage(Solitaire.hiddenImage, i * 100 + 50, j *50 + 50, null);
                        }else if(Solitaire.revealed[i][j] == true && Solitaire.cardvalues[i][j] != 52){
                            g2d.drawImage(Solitaire.cardImage[Solitaire.cardvalues[i][j]], i * 100 + 50, j * 50 + 50, null);
                         }
                        }
                    }
                    
                }


g2d.drawImage(Solitaire.cardImage[Solitaire.sidedeck[Solitaire.selected]], 800, 100, null);
		//cleaning memory
		g2d.dispose();
	}
        public static void returnthepositionofthecards(){
            int i = 0;
            int j = 0;
            xboundary = new int [7][20];
            yboundary = new int [7][20];
            for(i = 0; i < 7; i ++){
                
                for(j = 0; j < 19; j ++){
                       xposition = i * 100;
                       yposition = j*50 + 200;
                    if(Solitaire.cardvalues[i][j+1] != 100){
                        xboundary[i][j] = 80;
                        yboundary[i][j] = 50;
                        }
                   }
                }
            }
        }
	
	
	


