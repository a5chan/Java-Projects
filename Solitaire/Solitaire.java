/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package solitaire;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import hsa.*;
import java.awt.image.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.PopupMenu;
import java.awt.Menu;

public class Solitaire extends JFrame implements ActionListener, MouseListener, MouseMotionListener{

public static animationdraw thePanel;
public static BufferedImage[] cardImage = null;
public static File cardfile = null;
public JButton thetester;
public JButton[][] thefieldarray;
public int cardsizex = 80;
public int cardsizey = 120;
public static boolean revealed[][];
public static boolean dragged;
public static int cardvalues[][];
public boolean match = true;
public static boolean sidedecking = false;
public static boolean selectsidedeck = false;
public static boolean enterfromsidedeck = false;
public static int xplace;
public int number;
public static BufferedImage hiddenImage=  null;
public static File hiddenfile = null;
public static boolean answer = false;
public int selectedy;
public static int yplace;
public int selectedx =0 ;
public static JButton thetester2;
public static boolean selectable = false;
public static int movex = 0;
public int loop;
public static int movey = 0;
public static boolean stacked = false;
public static int putx = 0;
public static int puty = 0;
public static int xput = 0;
public static boolean empty = false;
public static int yput = 0;
public static String suite = "";
public int diamonds[];
public int clubs[];
public int spades[];
public int hearts[];
public static int selected = 0;
public String suitetwo = "";
public static boolean draggedstack = false;
public static int valueone;
public static int valuetwo;
public static int elementone = 0;
public static boolean clublegit = false;
public static int elementtwo = 0;
public static boolean stackedanswer = false;
public static int sidedeck[];
public static int comparedeck[];
public static boolean diamondlegit = false;
public static boolean spadelegit = false;
public static boolean heartlegit = false;
public static boolean dragsidedeck = false;
public static JButton theselectionbutton;
public static int wingame = 0;
public static boolean legit = false;
public static int diamondload[];
public static int spadeload[];
public static int clubload[];
public static int clubnum = 0;
public static int spadenum = 0;
public static int diamondnum = 0;
public static int heartnum = 0;
public static int heartload[];
public static boolean clubrelease = false;
public static boolean enterfromfield = false;
public JTextArea winarea;


public boolean comparedecks(){
     int i = 0;
    int j = 0;
    int counter =0;
    boolean verified = false;
 
    diamondload = new int[13];
     spadeload  = new int[13];
     heartload  = new int[13];
     clubload = new int[13];
     for( i = 0; i < 13; i ++){
         clubload[counter] = i;
         counter ++;
     }
     counter = 0;
     for( i = 13; i < 26; i ++){
         diamondload[counter] = i;
         counter ++;
     }
     counter = 0;
     for( i = 26; i < 39; i ++){
         heartload[counter] = i;
         counter ++;
     }
     counter = 0;
     for( i = 39; i < 52; i ++){
         spadeload[counter] = i;
         counter ++ ;
     }
 if(enterfromsidedeck == true){
     valueone = sidedeck[selected];
 }else{
     valueone = cardvalues[xplace][yplace];
 }
     System.out.println("this is" + valueone);
        if(suite.equalsIgnoreCase("Clubs")){
        valuetwo = clubload[clubnum];
     }else if(suite.equalsIgnoreCase("Hearts")){
         valuetwo = heartload[heartnum];
     }else if(suite.equalsIgnoreCase("Spades")){
         valuetwo = spadeload[spadenum];
     }else if(suite.equalsIgnoreCase("Diamonds")){
         valuetwo = diamondload[diamondnum];
     }
System.out.println("this is value two"  + valuetwo);
    
         for(i = 0; i < 13; i ++){
         if(heartload[i] == valueone){
            elementone = i;
         }
         if(heartload[i] == valuetwo){
            elementtwo = i;
         }
     }
         for(i = 0; i < 13; i ++){
         if(spadeload[i] == valueone){
            elementone = i;
         }
         if(spadeload[i] == valuetwo){
             elementtwo = i;
         }
     }
         for(i = 0; i < 13; i ++){
         if(clubload[i] == valueone){
            elementone = i;
         }
         if(clubload[i] == valuetwo){
             elementtwo = i;
         }
     }
         for(i = 0; i < 13; i ++){
         if(diamondload[i] == valueone){
            elementone = i;
         }
         if(diamondload[i] == valuetwo){
             elementtwo = i;
         }
     }
         System.out.println(elementtwo);
         System.out.println(elementone);
         if(elementtwo == elementone){
             verified = true;
         }else{
             verified = false;
         }
     
     
    return verified;
         
}
public void makethesidedeck(){
    sidedeck = new int[24];
    comparedeck = new int[28];
    boolean risk = false;
    boolean makesure=  false;
     int i = 0;
    int j = 0;
   int counterthree = 0;
   int timetwo = 0;
   int counterfour = 0;
    for(i = 0; i < 7; i ++){
        outerloop:
        for(j = 0; j < 20; j ++){
            comparedeck[counterthree] = cardvalues[i][j];
            counterthree ++;

        if(i == j){
            break outerloop;
            }
        }
    }
    for( i =0; i < 24; i ++){
        sidedeck[i] = 100;
    }
    for(i = 0; i < 24; i ++){
    match = true;
      

          while(match == true){
          makesure = false;
          sidedeck[i] =(int)(Math.random() * 52);
    
          outerloop:
          for(int t = 0; t < 28; t ++){
                makesure = false;
          if(sidedeck[i] == comparedeck[t]){
          match = true;
          risk = true;
          break outerloop;
              
          
          }else{
              match = false;
            makesure = true;
          }
       }
          if(makesure == true){
              risk = false;
          }
   
          if(risk == false){
              outerloop:
          for(int k = 0; k < 24; k ++){
              if(i == k){
      
              }else{
               
                  if(sidedeck[i] == sidedeck[k]){
                   
                      match = true;
                      break outerloop; 
                     
                  }else{ 
                      match = false;
                     }          
                  }
              }
          }
       }

 
   
      



  }

}
public boolean matchthesidedeck(int number){
  
    return false;
}


public boolean checkifpossible(int xstart, int ystart, int xend, int yend){
        int i = 0;
    int j = 0;
    int counter =0;
    boolean verified = false;
 
    diamonds = new int[13];
     spades  = new int[13];
     hearts  = new int[13];
     clubs = new int[13];
     for( i = 0; i < 13; i ++){
         clubs[counter] = i;
         counter ++;
     }
     counter = 0;
     for( i = 13; i < 26; i ++){
         diamonds[counter] = i;
         counter ++;
     }
     counter = 0;
     for( i = 26; i < 39; i ++){
         hearts[counter] = i;
         counter ++;
     }
     counter = 0;
     for( i = 39; i < 52; i ++){
         spades[counter] = i;
         counter ++ ;
     }
 
     valueone = animationdraw.tempx;
if(draggedstack == true){
  valueone = animationdraw.temparray[0];
}

     valuetwo = cardvalues[xput][yput];
    
         for(i = 0; i < 13; i ++){
         if(hearts[i] == valueone){
            elementone = i;
         }else if(hearts[i] == valuetwo){
             elementtwo = i;
         }
     }
         for(i = 0; i < 13; i ++){
         if(spades[i] == valueone){
            elementone = i;
         }else if(spades[i] == valuetwo){
             elementtwo = i;
         }
     }
         for(i = 0; i < 13; i ++){
         if(clubs[i] == valueone){
            elementone = i;
         }else if(clubs[i] == valuetwo){
             elementtwo = i;
         }
     }
         for(i = 0; i < 13; i ++){
         if(diamonds[i] == valueone){
            elementone = i;
         }else if(diamonds[i] == valuetwo){
             elementtwo = i;
         }
     }
         if(elementtwo == (elementone + 1) && cardvalues[xput][yput+1] ==52 || (cardvalues[xput][yput] == 52 && elementone == 12)){
             verified = true;
         }else{
             verified = false;
         }
     
     
    return verified;
}

public String checkforthesuite(int x, int y){
    String kind = "";

if(selectsidedeck == true || enterfromsidedeck == true){
    if(sidedeck[selected] >= 0 && sidedeck[selected] <=12){
      kind = "Clubs";
  }else if(sidedeck[selected] >= 13 && sidedeck[selected] <= 25){
      kind = "Diamonds";
  }else if(sidedeck[selected] >= 26 && sidedeck[selected] <= 38){
      kind = "Hearts";
  }else if(sidedeck[selected] >= 39 && sidedeck[selected] <= 51){
      kind = "Spades";
  }  
}else{
  if(cardvalues[x][y] >= 0 && cardvalues[x][y] <=12){
      kind = "Clubs";
  }else if(cardvalues[x][y] >= 13 && cardvalues[x][y] <= 25){
      kind = "Diamonds";
  }else if(cardvalues[x][y] >= 26 && cardvalues[x][y] <= 38){
      kind = "Hearts";
  }else if(cardvalues[x][y] >= 39 && cardvalues[x][y] <= 51){
      kind = "Spades";
  }
}
  return kind;
}

public boolean checkifselectable(int x, int y){
    boolean choice = true;
   if(y < 7 && y >= 0 ){
      
   if(revealed[x][y] == true){
       choice = true;
   }else{
       choice = false;
        }
   }
  
   return choice;
}

public void displaythecards(){
    cardImage = new BufferedImage[53];
    int counter = 0;
    String strList = "";
    TextInputFile infile = new TextInputFile("imagelist.txt");
    while(infile.eof()!= true){
    strList = infile.readLine();
    try{
    cardfile = new File(strList);
    cardImage[counter] = ImageIO.read(cardfile);
    }catch(IOException e){
			
		}
    counter = counter + 1;
    }
 
    
}
public boolean checkforcardsunderneath(int x, int y){
    int j = 0;
    for(j = 0; j < 20; j ++){
        if(cardvalues[x][y + 1] != 52){
            stacked = true;
        }
        if(stacked == true){
            break;
        }
    }
    
    return stacked;
}

public boolean matchingcard(int giveni, int givenj, int number)
{

    boolean ret = false;

    for(int i = 0; i < 7; i++)
    {
        if (!ret)
        {
            for(int j = 0; j < 20; j++)
            {
                if(j > i || (i == giveni && j == givenj))
                {
                    continue;
                }
                else if(cardvalues[i][j] == number)
                {
                    ret = true;
                    break;
                }
            }
        }
        else
        {
            break;
        }
    }
    return ret;
}

public void drawthefield(){
  revealed = new boolean[7][7];
  int i = 0;
  int j = 0;
  
  for(i = 0; i < 7; i ++){
    
      for(j = 0; j < 7; j ++){
          revealed[i][j] = false;
      
      if(i==j){
          revealed[i][j] = true;
    
      }
      if(j > i){
          revealed[i][j] = true;
      }
     }
  }
}
public void setthecardvalues(){
    int i = 0;
    int j = 0;
    cardvalues = new int[7][20];
    for(i = 0; i < 7; i ++){
      for(j = 0; j < 20; j ++){
          match = true;
          if(j > i){
              match = false;
              cardvalues[i][j] = 52;
          }
          while(match == true){
          cardvalues[i][j] =(int)(Math.random() * 52);
          match = matchingcard(i,j, cardvalues[i][j]);
                 
          }
    }
  }
}
    
public Solitaire(){
    
super("Solitaire");
    try{
    hiddenfile = new File("hidden.png");
    hiddenImage = ImageIO.read(hiddenfile);
    }catch(IOException e){
			
		}
thePanel = new animationdraw();
     thePanel.setLayout(null);
     Container framecontainer = this.getContentPane();
     framecontainer.add(thePanel);
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 this.setBounds(0,0,2000,700);
       
  displaythecards();
  drawthefield();
  setthecardvalues();
  makethesidedeck();
 

  thetester = new JButton();

  thetester.setBounds(50,500,80,120);

thetester2 = new JButton("Reset");
thetester2.setBounds(1000,200,80,120);
thePanel.add(thetester2);
  thePanel.addMouseListener(this);
  thePanel.addMouseMotionListener(this);
  theselectionbutton = new JButton();
  theselectionbutton.setBounds(800, 250, 80, 120);
  thePanel.add(theselectionbutton);
  theselectionbutton.setIcon(new ImageIcon(hiddenImage));
  theselectionbutton.addActionListener(this);
    thetester2.addActionListener(this);
  this.setVisible(true);



}    
    

public void actionPerformed(ActionEvent evt){
    int i = 0;
       
    boolean right = false;
    if(evt.getSource() == theselectionbutton){
   
        
        if(selected < 23 && right == false){
 selected ++;
        }else{
            selected = 0;
        }
       
    }
    if(evt.getSource() == thetester2){
  
                   wingame = JOptionPane.showConfirmDialog(null,"Are you sure you wanna reset?");
               if(wingame == 0){
                    displaythecards();
  drawthefield();
  setthecardvalues();
  makethesidedeck();
  clubnum = 0;
  diamondnum = 0;
  spadenum = 0;
  heartnum = 0;
    }
    }
    System.out.println(selected);
    this.repaint();
}
        public void mouseExited(MouseEvent evt){
		
	}
	
	public void mouseEntered(MouseEvent evt){
	
	}
	
	public void mouseReleased(MouseEvent evt){
            if(dragged == true){
                            System.out.println("checking here again "); 
        animationdraw.times = 0;
        putx = evt.getX();
     if(putx < 50){
            putx = 100;
        }else if(putx > 700){
            putx = 698;
        }
        xput = (int)Math.floor((float)(putx-50) / 100.0f);
      
        puty = evt.getY();
        System.out.println(puty);
        if(puty < 50){
            puty = 100;
        }
        yput = (int)Math.floor((float)(puty- 50)/50.00f);

         if(cardvalues[xput][yput] == 52 && yput != 0){
            yput = yput - 1;
        }
System.out.println(xplace);
System.out.println(yplace);
System.out.println(cardvalues[xput][yput]);
System.out.println(xput);
System.out.println(yput);
System.out.println(cardvalues[xplace][yplace]);

         if(yput == 0 && cardvalues[xput][yput] == 52  && (animationdraw.tempx == 12 || animationdraw.tempx  == 25 || animationdraw.tempx  == 38 || animationdraw.tempx  == 51)){
             answer = true;
             empty = true;
                         System.out.println("hi");
         }else{
           suitetwo = checkforthesuite(xput, yput);
         
           if(suite.equalsIgnoreCase("Hearts")){
               if(suitetwo.equalsIgnoreCase("Spades") || (suitetwo.equalsIgnoreCase("Clubs"))){
                   answer = checkifpossible(xplace, yplace, xput, yput);
             
               }else{
                
               }
           }else if(suite.equalsIgnoreCase("Spades")){
                if(suitetwo.equalsIgnoreCase("Hearts") || (suitetwo.equalsIgnoreCase("Diamonds"))){
                   answer = checkifpossible(xplace, yplace, xput, yput);
           
               }else{
                
               } 
           }else if(suite.equalsIgnoreCase("Diamonds")){
                if(suitetwo.equalsIgnoreCase("Clubs") || (suitetwo.equalsIgnoreCase("Spades"))){
                   answer = checkifpossible(xplace, yplace, xput, yput);
       
               }else{
                
               } 
           }else if(suite.equalsIgnoreCase("Clubs")){
                if(suitetwo.equalsIgnoreCase("Hearts") || (suitetwo.equalsIgnoreCase("Diamonds"))){
                   answer = checkifpossible(xplace, yplace, xput, yput);
                  
               }else{
                
               } 
           }
            }
         System.out.println(elementone);
         System.out.println(elementtwo);
         System.out.println(answer);
     
        cardvalues[xplace][yplace] = animationdraw.tempx;
        selectable = false;
        elementone = 0;
        elementtwo = 0;
        
        dragged = false;
        this.repaint();
            }
            if(draggedstack == true){
                        System.out.println("checking here again2 "); 
             animationdraw.times = 0;
               putx = evt.getX();
     if(putx < 50){
            putx = 100;
        }else if(putx > 700){
            putx = 698;
        }
        xput = (int)Math.floor((float)(putx-50) / 100.0f);
      
        puty = evt.getY();
        System.out.println(puty);
        if(puty < 50){
            puty = 100;
        }
        yput = (int)Math.floor((float)(puty- 50)/50.00f);
  
         if(cardvalues[xput][yput] == 52 && yput != 0){
            yput = yput - 1;
        }
             System.out.println(sidedeck[selected]);
        
          if(yput == 0 && cardvalues[xput][yput] == 52){
                  for(int i = 0; i < animationdraw.countertwo; i ++){
    
         if(animationdraw.temparray[i] == 12 || animationdraw.temparray[i] == 25 || animationdraw.temparray[i] == 38 || animationdraw.temparray[i] == 51){

                
             answer = true;
             empty = true;
                         System.out.println("hi");
         }
                  }
         }else{
           suitetwo = checkforthesuite(xput, yput);
          
           if(suite.equalsIgnoreCase("Hearts")){
               if(suitetwo.equalsIgnoreCase("Spades") || (suitetwo.equalsIgnoreCase("Clubs"))){
                   answer = checkifpossible(xplace, yplace, xput, yput);
             
               }else{
                
               }
           }else if(suite.equalsIgnoreCase("Spades")){
                if(suitetwo.equalsIgnoreCase("Hearts") || (suitetwo.equalsIgnoreCase("Diamonds"))){
                   answer = checkifpossible(xplace, yplace, xput, yput);
           
               }else{
                
               } 
           }else if(suite.equalsIgnoreCase("Diamonds")){
                if(suitetwo.equalsIgnoreCase("Clubs") || (suitetwo.equalsIgnoreCase("Spades"))){
                   answer = checkifpossible(xplace, yplace, xput, yput);
       
               }else{
                
               } 
           }else if(suite.equalsIgnoreCase("Clubs")){
                if(suitetwo.equalsIgnoreCase("Hearts") || (suitetwo.equalsIgnoreCase("Diamonds"))){
                   answer = checkifpossible(xplace, yplace, xput, yput);
                  
               }else{
                
               } 
           }
            }
           for(int i = 0; i < animationdraw.countertwo; i ++){
    
        cardvalues[xplace][yplace + i] = animationdraw.temparray[i];

                }

        elementone = 0;
        elementtwo = 0;

        stacked = false;
      draggedstack = false;
     
        if(answer == true){
              
        stackedanswer = true;            
        }
 
        this.repaint();
       
       
            }
            if(dragsidedeck == true){
                   System.out.println("taking from side");
               selectsidedeck = false;
        animationdraw.times = 0;
               putx = evt.getX();
     if(putx < 50){
            putx = 100;
        }else if(putx > 700){
            putx = 698;
        }
        xput = (int)Math.floor((float)(putx-50) / 100.0f);
      
        puty = evt.getY();
        System.out.println(puty);
        if(puty < 50){
            puty = 100;
        }
        yput = (int)Math.floor((float)(puty- 50)/50.00f);
  
         if(cardvalues[xput][yput] == 52 && yput != 0){
            yput = yput - 1;
        }

          if(yput == 0 && cardvalues[xput][yput] == 52 && (animationdraw.tempx == 12 || animationdraw.tempx  == 25 || animationdraw.tempx  == 38 || animationdraw.tempx  == 51)){
             answer = true;
             empty = true;

            
             
             System.out.println("hi");
         }else{
           suitetwo = checkforthesuite(xput, yput);
          
           if(suite.equalsIgnoreCase("Hearts")){
               if(suitetwo.equalsIgnoreCase("Spades") || (suitetwo.equalsIgnoreCase("Clubs"))){
                   answer = checkifpossible(xplace, yplace, xput, yput);
             
               }else{
                
               }
           }else if(suite.equalsIgnoreCase("Spades")){
                if(suitetwo.equalsIgnoreCase("Hearts") || (suitetwo.equalsIgnoreCase("Diamonds"))){
                   answer = checkifpossible(xplace, yplace, xput, yput);
           
               }else{
                
               } 
           }else if(suite.equalsIgnoreCase("Diamonds")){
                if(suitetwo.equalsIgnoreCase("Clubs") || (suitetwo.equalsIgnoreCase("Spades"))){
                   answer = checkifpossible(xplace, yplace, xput, yput);
       
               }else{
                
               } 
           }else if(suite.equalsIgnoreCase("Clubs")){
                if(suitetwo.equalsIgnoreCase("Hearts") || (suitetwo.equalsIgnoreCase("Diamonds"))){
                   answer = checkifpossible(xplace, yplace, xput, yput);
                  
               }else{
                
               } 
           }
          }
        sidedeck[selected] = animationdraw.tempx;
sidedecking = true;
System.out.println(sidedeck[selected]);
System.out.println(elementone);
System.out.println(elementtwo);
System.out.println(answer);
System.out.println(valuetwo);
        selectable = false;
        elementone = 0;
        elementtwo = 0;

     draggedstack = false;
     dragsidedeck = false;
        dragged = false;
       this.repaint();
            }
            if(legit == true){
                legit = false;
enterfromfield = false;
                elementone = 0;
                elementtwo = 0;
                valuetwo = 0;
                valueone = 0;
                enterfromsidedeck = false;
                draggedstack = false;
                this.repaint();
                System.out.println("does this run");
            }
            if(clubnum == 13 && diamondnum == 13 && spadenum == 13 && heartnum == 13){
               wingame = JOptionPane.showConfirmDialog(null,"Congratulations, on winning, would you like to reset?");
               if(wingame == 0){
                    displaythecards();
  drawthefield();
  setthecardvalues();
  makethesidedeck();
  clubnum = 0;
  diamondnum = 0;
  spadenum = 0;
  heartnum = 0;
               }
               this.repaint();
              
            }
        }
	
	public void mousePressed(MouseEvent evt){
            clublegit = false;
                       legit = false;
                       enterfromfield = false;
enterfromfield = false;
                elementone = 0;
                elementtwo = 0;
                valuetwo = 0;
                valueone = 0;
                enterfromsidedeck = false;
            heartlegit = false;
            spadelegit = false;
            diamondlegit = false;
            empty = false;
            animationdraw.times = 0;
            sidedecking = false;
            animationdraw.counter = 0;
               animationdraw.countertwo = 0;
dragged=  false;
               draggedstack = false;
	dragsidedeck = false;
        answer = false;
        selectedx = evt.getX();
        
     
        if(selectedx < 0){
        selectedx = 0;
        }else if(selectedx > 700 && selectedx < 800){
            selectedx = 698;
        }
        
        xplace = (int)Math.floor((float)(selectedx-50) / 100.0f);
        if(selectedx > 800){
            xplace = (int)Math.floor((float)(selectedx)/100.0f);
        }
       
        selectedy = evt.getY(); 
        if(selectedy < 0){
        selectedy = 0;
        }
      
        yplace = (int)Math.floor((float)(selectedy- 50)/50.00f);
       
        if(SwingUtilities.isRightMouseButton(evt)){
                if(xplace == 8 && yplace > 0 && yplace < 4){
                       
              enterfromsidedeck = true;
              suite = checkforthesuite(xplace, yplace);
              legit = comparedecks();
              System.out.println(legit);
                  
          }else{
                    System.out.println(xplace);
                    System.out.println(yplace);
              suite = checkforthesuite(xplace, yplace);
              legit = comparedecks();
              enterfromfield = true;
                }
 
        }else{
                   
        if(xplace == 8 && yplace > 0 && yplace < 4){
            selectsidedeck = true;
              suite = checkforthesuite(xplace, yplace);
 
               
        }
        if(selectsidedeck == false){
           
             if(cardvalues[xplace][yplace] == 52){
            yplace = yplace - 1;
        }
             System.out.println("checking here");
        suite = checkforthesuite(xplace, yplace);
         System.out.println("card value is" + cardvalues[xplace][yplace]);
        stacked = checkforcardsunderneath(xplace, yplace);
        }
      
      }
        this.repaint();
        }
	public void mouseClicked(MouseEvent evt){
	
	}
	
	public void mouseMoved(MouseEvent evt){
	
	
	}   
	
	public void mouseDragged(MouseEvent evt){
          if(SwingUtilities.isRightMouseButton(evt)){
          
          }else{
            if(selectsidedeck == false){
           selectable = checkifselectable(xplace, yplace);
            }else{
            
            }
      
            if(selectsidedeck == true){
                movex = evt.getX();
                movey = evt.getY();
                dragsidedeck = true;
                dragged = false;
            }
        if(stacked == true && selectable == true){

            movex = evt.getX();
            movey = evt.getY();
            draggedstack = true;
            dragged = false;
        }
	if(selectable == true && stacked == false && selectsidedeck == false){
            movex = evt.getX();
            movey = evt.getY();
           dragged = true;
        }		
        this.repaint();
		
	}

        }
    public static void main(String[] args) {
      	Solitaire allengui = new Solitaire();
	allengui.setVisible(true);
        
    }
}

