/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;
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
/**
 * 
 *
 * @author allen
 */
public class Minesweeper extends JFrame implements ActionListener, MouseListener, MouseMotionListener, KeyListener{

    public JButton minegridbuttons[][];
    public boolean numbergrid[][];
  
    public JPanel thePanel;
    public int xposition;
    public int yposition;
    public int minenumber;
    public File flagfile = null; 
    public BufferedImage flagImage = null;
    public File minefile = null; 
    public int answer;
    public BufferedImage mineImage = null;
    public int minesaroundasquare;
    public int totalnumbermines = 0;
    public String thenumber;
    public Timer theTimer = new Timer((int)(1000/0.9),this);
    public JTextArea thetimerarea;
    public int minesize = 30;
    public int xlength;
    public int flags = 0;
    public int numberofclicks;
    public boolean flagset[][];
    public int ylength;
    public JTextArea flagcount;
    public JRadioButton eleven;
    public int randomleft = (int)Math.random() * 4 + 2;
    public int randomright = (int)Math.random() * 4 + 2;
    public int randomup = (int)Math.random() * 4 + 2;
    public int randomdown = (int)Math.random() * 4 + 2;
    public int leftmove;
    public PopupMenu menu;
    public int rightmove;
    public int upmove;
    public int downmove;
    public boolean alive = true;
    public boolean revealgrid[][];
    public JRadioButton fifteen;
    public JRadioButton twenty;
    public int time = 0;
    public JTextArea board;
    public JButton customize;
    public JButton theresetbutton;
    public int intHighscores;
    public String strHighscores;
    public JTextArea highscores; 
    public int minesleft;
    
    public void displayamountofmines(){
    int j = 0;
    int i = 0;
   totalnumbermines = 0;
    
    for(j = 0; j < ylength; j ++){
        for(i = 0; i < xlength; i ++){
            if(numbergrid[i][j]){
               totalnumbermines ++;
               
            }
        }
    }
    
    board.setText("There are: " + Integer.toString(totalnumbermines) + " mines");
    }
    public void displayhighscores(){
        	int col = 0;
                TextInputFile infile = new TextInputFile("highscore.txt");
               
                String strLine = "";
                String strLineSplit[];
            
         
               
	while(infile.eof()!= true){
	
		strHighscores = infile.readLine();
                intHighscores = Integer.parseInt(strHighscores);
				}
			
		 
        infile.close();
        if(intHighscores == 0){
        if(time > intHighscores){
            intHighscores = time;
          highscores.setText("Your fastest time is: " + Integer.toString(intHighscores));
        }
      }
         if(time < intHighscores && alive == false){
             intHighscores = time;
          highscores.setText("Your fastest time is: " + Integer.toString(intHighscores));
        }else{
            highscores.setText("Your fastest time is: " + Integer.toString(intHighscores));
        
        }
         TextOutputFile outfile = new TextOutputFile("highscore.txt");

            strHighscores = Integer.toString(intHighscores);
   
                   outfile.print(strHighscores);
                    
        outfile.close();
			
         
        }
    public void setFieldSize(int length, int width){
        xlength = length;
        ylength = width;
        int j = 0;
        int i = 0;
   
        minegridbuttons = new JButton[length][width];
        numbergrid = new boolean[width][length];
        revealgrid = new boolean[width][length];
        flagset = new boolean[width][length];
        for(i = 0; i < xlength; i ++){
            for(j = 0; j < ylength; j ++){
                minegridbuttons[i][j] = new JButton();
                minegridbuttons[i][j].setLocation(i * minesize, j * minesize);
                minegridbuttons[i][j].setSize(minesize, minesize);
                minegridbuttons[i][j].setMargin(new Insets(1,1,1,1));
                minegridbuttons[i][j].addActionListener(this);
                minegridbuttons[i][j].addMouseMotionListener(this);
                minegridbuttons[i][j].addMouseListener(this);
                thePanel.add(minegridbuttons[i][j]);
                minegridbuttons[i][j].setVisible(true);
              
            }
        }
           this.setContentPane(thePanel);

           this.setSize((length * minesize) + 200, (width * minesize) + 200);
             board = new JTextArea("");
             board.setBounds(length * minesize + 20, 50, 200, 50);
             thetimerarea = new JTextArea("");
             customize = new JButton("Make my own map");
             customize.setMargin(new Insets(0,0,0,0));
             customize.addActionListener(this);
             customize.setBounds(minesize + 190, minesize * ylength + 50, 100, 100); 
             thePanel.add(customize);
             flagcount = new JTextArea("");
             flagcount.setBounds(length * minesize + 20, 450, 100, 50);
             thePanel.add(flagcount);
             thetimerarea.setBounds(length * minesize + 20, 400, 100, 30);
             thePanel.add(thetimerarea);
             highscores = new JTextArea("");
             highscores.setBounds(minesize, minesize * ylength + 50, 150,100);
             thePanel.add(highscores);
             thePanel.add(board);
             theresetbutton = new JButton("Reset");
             theresetbutton.setMargin(new Insets(1,1,1,1));
             theresetbutton.setBounds(length*minesize + 20, 150, 50, 50);
             thePanel.add(theresetbutton);
             theresetbutton.addActionListener(this);
             eleven = new JRadioButton("Easy");
             thePanel.add(eleven);
             eleven.setBounds(length*minesize + 20, 250,100,50);
             eleven.addActionListener(this);
             fifteen = new JRadioButton("Normal");
             thePanel.add(fifteen);
             fifteen.setBounds(length*minesize + 20, 300,100,50);
             fifteen.addActionListener(this);
             twenty = new JRadioButton("Hard");
             thePanel.add(twenty);
             twenty.setBounds(length*minesize + 20, 350,100,50);
             twenty.addActionListener(this);
            
    }
    
  
    
    public void revealTilesonfirstclick(int tilesx, int tilesy){
      int numberofmines;
      
      numberofmines = checkformines(tilesx, tilesy);
      if(numberofmines > 0){
         cleartilesaroundfirstclick(tilesx, tilesy);  
         revealtheleftovers(tilesx, tilesy);
      }else if(numberofmines == 0){
         findclosestmines(tilesx, tilesy);
       
      }else if(numberofmines == -1){
         numbergrid[tilesx][tilesy] = false;
         cleartilesaroundfirstclick(tilesx,tilesy);
      }
    }
    
   public int cleartilesx(int tilesx, int tilesy){
     boolean resultx = false;
     int numberofmines = 0;
     int startx = 0;
     int starty = 0;
     int endx = 0;
     int endy = 0;
     int i = 0;
     int j = 0;
        for(i = 0; i < tilesx; i ++){
            if(numbergrid[i][tilesy]){
            resultx = true;
            break;
            }
        }
        if(resultx == true){
        return i;
        }else{
        return tilesx;
        }
       
   }
   
    public int cleartilesxright(int tilesx, int tilesy){
     boolean resultx = false;
     int numberofmines = 0;
     int startx = 0;
     int starty = 0;
     int endx = 0;
     int endy = 0;
     int i = 0;
     int j = 0;
        for(i = tilesx; i < xlength; i ++){
            if(numbergrid[i][tilesy]){
            resultx = true;
            break;
            }
        }
        if(resultx == true){
        return i;
        }else{
        return tilesx;    
        }
    }    
     public int cleartilesy(int tilesx, int tilesy){
     boolean resulty = false;
     int numberofmines = 0;
     int startx = 0;
     int starty = 0;
     int endx = 0;
     int endy = 0;
     int i = 0;
     int j = 0;
        for(i = 0; i < tilesy; i ++){
            if(numbergrid[tilesx][i]){
            resulty = true;
            break;
            }
        }
        if(resulty == true){
        return i;
        }else{
        return tilesy;
        }
     }
     public int cleartilesydown(int tilesx, int tilesy){
     boolean resulty = false;
     int numberofmines = 0;
     int startx = 0;
     int starty = 0;
     int endx = 0;
     int endy = 0;
     int i = 0;
     int j = 0;
        for(i = tilesy; i < ylength; i ++){
            if(numbergrid[tilesx][i]){
            resulty = true;
            break;
            }
        }
        if(resulty == true){
        return i;
        }else{
        return tilesy;
        }
     }
   public void findclosestmines(int tilesx, int tilesy){
       int i = 0;
       int j = 0;
       int startx = 0;
       int endx = 0;
       int starty = 0;
       int endy = 0;
       int numberofmines = 0;
       
       startx = cleartilesx(tilesx, tilesy);
       endx = cleartilesxright(tilesx, tilesy);
       starty = cleartilesy(tilesx, tilesy);
       endy = cleartilesydown(tilesx, tilesy);
       
       for(j = starty; j <= endy; j ++){
           for(i = startx; i <= endx; i ++){
            
             
               numberofmines = checkformines(i,j);
             
               if(numberofmines == 0){
               cleartilesaroundfirstclick(i,j);
               
               }else if(numbergrid[i][j]){
                   
               }
           }
       }
       revealtheleftovers(tilesx, tilesy);
   }
       
   public void revealtheleftovers(int tilesx, int tilesy){
       
       int i = 0;
       int numberofmines = 0;
       int j = 0;

 

         for(i = 0; i < xlength; i ++ ){
             for(j = 0; j < ylength; j ++){
                 if(revealgrid[i][j] == true){
              numberofmines = checkformines(i,j);
              if(numberofmines == 0){
              cleartilesaroundfirstclick(i, j);      
                 }
      }
       }
   
   }
   }
      
   public void cleartilesaroundfirstclick(int tilesfx, int tilesfy){
        int start1x = 0;
        int start1y = 0;
        int end1x = 0;
        int end1y = 0;
        int i = 0;
        int j = 0;
        int numberofmines = 0;
     if(tilesfx > 0){
            start1x = tilesfx - 1;
        }else{
            start1x = 0;
        }
        if(tilesfx < xlength - 1){
            end1x = tilesfx + 1;
        }else{
            end1x = xlength - 1;
        }
        if(tilesfy < ylength - 1){
            end1y = tilesfy + 1;
        }else{
            end1y = ylength - 1;
        }
        if(tilesfy > 0){
            start1y = tilesfy - 1;
        }else{
            start1y = 0;
        }
        for(j = start1y; j <= end1y; j ++){
            for(i = start1x; i <= end1x; i ++){
                

                if(numbergrid[i][j]){
                    
                }else{

                 
                   numberofmines = checkformines(i,j);
                   minegridbuttons[i][j].setText(Integer.toString(numberofmines));
                
                    revealgrid[i][j] = true;
                   if(numberofmines == 0){
                     minegridbuttons[i][j].setText("0");
                   }
                        if(numberofmines == 1){
              minegridbuttons[i][j].setForeground(Color.blue);
              minegridbuttons[i][j].setText(Integer.toString(numberofmines));
         }else if(numberofmines == 2){
              minegridbuttons[i][j].setForeground(Color.red);
              minegridbuttons[i][j].setText(Integer.toString(numberofmines));
         }else if(numberofmines == 3){
             minegridbuttons[i][j].setForeground(Color.green);
              minegridbuttons[i][j].setText(Integer.toString(numberofmines));
         }else if(numberofmines == 4){
              minegridbuttons[i][j].setForeground(Color.PINK);
              minegridbuttons[i][j].setText(Integer.toString(numberofmines));
         }else if(numberofmines == 5){
              minegridbuttons[i][j].setForeground(Color.MAGENTA);
              minegridbuttons[i][j].setText(Integer.toString(numberofmines));
         }else if(numberofmines == 6){
              minegridbuttons[i][j].setForeground(Color.ORANGE);
              minegridbuttons[i][j].setText(Integer.toString(numberofmines));
         }
              }
            }
        }
    }
    public void generateMines(){
        int i = 0;
        int j = 0;
        for( j = 0; j < ylength; j ++){
            for(i = 0; i < xlength; i ++ ){
                numbergrid[i][j] = Math.random() > 0.8;
            }
        }
    }
    
    public void checkifwin(int totalnumbermines){
    int j = 0;
    int i = 0;
    int matches = 0;

    for(j = 0; j < ylength; j ++){
        for(i = 0; i < xlength; i ++){
            if(flagset[i][j] == true && numbergrid[i][j] == true){
                matches ++;
            }
            if(matches == totalnumbermines){
            board.setText("you have won"); 
            alive = false;
                 theTimer.stop();
                 displayhighscores();
            }
        }
    }
    }
    public int totalnumberofmines(){
    int j = 0;
    int i = 0;
    int totalnumbermines = 0;
    
    for(j = 0; j < ylength; j ++){
        for(i = 0; i < xlength; i ++){
            if(numbergrid[i][j]){
                totalnumbermines ++;
            }
        }
    }
    return totalnumbermines;
    }
    
    public int checkformines(int tilex, int tiley){
        int numberofmines = 0;
        int startx = 0;
        int starty = 0;
        int endx = 0;
        int endy = 0;
        int i = 0;
        int j = 0;
        
        if(numbergrid[tilex][tiley]){
            return -1;
        }
        if(tilex > 0){
            startx = tilex - 1;
        }else{
            startx = 0;
        }
        if(tilex < xlength - 1){
            endx = tilex + 1;
        }else{
            endx = xlength - 1;
        }
        if(tiley < ylength - 1){
            endy = tiley + 1;
        }else{
            endy = ylength - 1;
        }
        if(tiley > 0){
            starty = tiley - 1;
        }else{
            starty = 0;
        }
    
        for(j = starty; j <= endy; j ++){
            for(i = startx; i <= endx; i ++){

                if(numbergrid[i][j]){
                    numberofmines ++;
                   
                }
            }   
        }        
      
        return numberofmines;
    }
    
    public Minesweeper(){
     super("Minesweeper");
     int length = 13;
     int width = 13;
     thePanel = new JPanel();
     thePanel.setLayout(null);
     Container framecontainer = this.getContentPane();
     framecontainer.add(thePanel);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setBounds(0,0,400,400);
     setFieldSize(12,12);
     generateMines();
     displayhighscores();
     displayamountofmines();
  
     this.setVisible(true);
     
    }
    public void actionPerformed(ActionEvent evt){ 
  
  try{
 
       minefile = new File ("mineImage.png");
       mineImage = ImageIO.read(minefile);
     }catch(IOException e){
}
     int numberofmines = 0;
     int selectx = 0;
     int totalnumbermines = 0;
     int width = ylength;
     int length = xlength;
     int selecty = 0;
     int i = 0;
     int j = 0;     
    totalnumbermines = totalnumberofmines();
 
    if(evt.getSource() == theTimer){
       time = time + 1;
    thetimerarea.setText("Time: " + Integer.toString(time));
    }
    if(alive == true && evt.getSource() != theresetbutton && evt.getSource() != customize && evt.getSource() != eleven && evt.getSource() != fifteen && evt.getSource() != twenty && evt.getSource() != theTimer){
   
     
     for(j = 0; j < ylength; j ++ ){
         for(i = 0; i < xlength; i ++ ){
            
             if(minegridbuttons[i][j] == evt.getSource()){
                    if(flagset[i][j] == true){
                 flagset[i][j] = false;
                 minegridbuttons[i][j].setIcon(null);
             }else{
                 
             }
                 selectx = i;
                 selecty = j;
               
                 break;
             }
         
         }
     }
      if(numberofclicks == 0){

     revealTilesonfirstclick(selectx, selecty);
     theTimer.start();
     numberofclicks ++ ;
      }

     numberofmines = checkformines(selectx, selecty);
     if(numberofmines == -1 && numberofclicks != 0 && evt.getSource() != theresetbutton){
     
         alive = false;
         board.setText("YOU LOST");
              theTimer.stop();
             
         for(j = 0; j < ylength; j ++){
             for(i = 0; i < xlength; i ++){
                 if(numbergrid[i][j]){
                     minegridbuttons[i][j].setForeground(Color.MAGENTA);
                     minegridbuttons[i][j].setIcon(new ImageIcon(mineImage));
                 }
             }
         }
     }

     if(numberofmines != -1 && numberofmines != 0){
        
         if(numberofmines == 1){
              minegridbuttons[selectx][selecty].setForeground(Color.blue);
              minegridbuttons[selectx][selecty].setText(Integer.toString(numberofmines));
         }else if(numberofmines == 2){
              minegridbuttons[selectx][selecty].setForeground(Color.red);
              minegridbuttons[selectx][selecty].setText(Integer.toString(numberofmines));
         }else if(numberofmines == 3){
             minegridbuttons[selectx][selecty].setForeground(Color.green);
              minegridbuttons[selectx][selecty].setText(Integer.toString(numberofmines));
         }else if(numberofmines == 4){
              minegridbuttons[selectx][selecty].setForeground(Color.PINK);
              minegridbuttons[selectx][selecty].setText(Integer.toString(numberofmines));
         }else if(numberofmines == 5){
              minegridbuttons[selectx][selecty].setForeground(Color.MAGENTA);
              minegridbuttons[selectx][selecty].setText(Integer.toString(numberofmines));
         }else if(numberofmines == 6){
              minegridbuttons[selectx][selecty].setForeground(Color.ORANGE);
              minegridbuttons[selectx][selecty].setText(Integer.toString(numberofmines));
         }
     }else if(numberofmines == 0){
      cleartilesaroundfirstclick(selectx, selecty);
      numberofmines = checkformines(selectx, selecty);
      if(numberofmines == 0){
          cleartilesaroundfirstclick(selectx, selecty);
               revealtheleftovers(selectx, selecty);
      }
      
     }

   }
      if(evt.getSource() == theresetbutton){

     answer = JOptionPane.showConfirmDialog(null,"Are you sure you want to reset?");
    
      if(answer == 0){
            thePanel.removeAll();
       for(j = 0; j < ylength; j ++){
           for(i = 0; i < xlength; i ++){
               numbergrid[i][j] = false;
           }
       }
         setFieldSize(xlength, ylength);
         generateMines();
              theTimer.stop();
              time = 0;
         numberofclicks = 0;
         alive = true;;
         displayhighscores();
 displayamountofmines();
     
      }
      
         }
         if(evt.getSource() == eleven){
               answer = JOptionPane.showConfirmDialog(null,"Are you sure you want to reset?");
    
      if(answer == 0){
          thePanel.removeAll();
       for(j = 0; j < ylength; j ++){
           for(i = 0; i < xlength; i ++){
               numbergrid[i][j] = false;
           }
       }
         setFieldSize(11, 11);
         generateMines();
         displayhighscores();
         theTimer.stop();
         time = 0;
         numberofclicks = 0;
         alive = true;
          displayamountofmines();
         }
         }
         if(evt.getSource() == customize){
             answer = JOptionPane.showConfirmDialog(null,"Are you sure you want to do this?");
              if(answer == 0){

     boolean xvalid = false;
     boolean yvalid = false;
   
   String xcustomize = "";
       String ycustomize = "";
       int xcustomize1 = 0;
       int ycustomize1 = 0;
       while(xvalid == false){
       xcustomize = JOptionPane.showInputDialog(null, "Enter your x and y value please: 10-20");
        xcustomize1 = Integer.parseInt(xcustomize);
        ycustomize1 = Integer.parseInt(xcustomize);
       if(xcustomize1 >= 10 && xcustomize1 <= 20){
           xvalid = true;
           }
       }
     
       
     
          thePanel.removeAll();
       for(j = 0; j < ylength; j ++){
           for(i = 0; i < xlength; i ++){
               numbergrid[i][j] = false;
           }
       }
       
        setFieldSize(xcustomize1, ycustomize1);
         generateMines();
         time = 0;
         theTimer.stop();
         displayhighscores();
         numberofclicks = 0;
         alive = true;
          displayamountofmines();
         }
         }
         if(evt.getSource() == fifteen){
          answer = JOptionPane.showConfirmDialog(null,"Are you sure you want to reset?");
    
      if(answer == 0){
          thePanel.removeAll();
       for(j = 0; j < ylength; j ++){
           for(i = 0; i < xlength; i ++){
               numbergrid[i][j] = false;
           }
       }
         setFieldSize(15, 15);
         generateMines();
         time = 0;
         theTimer.stop();
         displayhighscores();
         numberofclicks = 0;
          displayamountofmines();
         alive = true;
         }
         }
         if(evt.getSource() == twenty){
          answer = JOptionPane.showConfirmDialog(null,"Are you sure you want to reset?");
    
      if(answer == 0){
          thePanel.removeAll();
       for(j = 0; j < ylength; j ++){
           for(i = 0; i < xlength; i ++){
               numbergrid[i][j] = false;
           }
       }
         setFieldSize(20, 20);
         generateMines();
         time = 0;
              theTimer.stop();
              displayhighscores();
               displayamountofmines();
         numberofclicks = 0;
         alive = true;
         }
    }
           checkifwin(totalnumbermines);
         
    }
    public void mouseExited(MouseEvent evt){
		
		}
	public void mouseEntered(MouseEvent evt){
		
		}
	public void mouseReleased(MouseEvent evt){
		
		}
	public void mousePressed(MouseEvent evt){
	
		}
	public void mouseClicked(MouseEvent evt){
	int j = 0;
        
        int i = 0;
        try{
 
       flagfile = new File ("flagImage.png");
       flagImage = ImageIO.read(flagfile);
     }catch(IOException e){
}
        int xposition = 0;
        int yposition = 0;
  
        outerloop:
            for(j = 0; j < ylength; j ++){
                for(i = 0; i < xlength; i ++){
                               if(evt.getSource() == minegridbuttons[i][j]){
                    if(SwingUtilities.isRightMouseButton(evt)){
                        
                        if(flagset[i][j] == false){
                              
                  minesleft = totalnumbermines - 1;
                        minegridbuttons[i][j].setIcon(new ImageIcon(flagImage));
                        flagset[i][j] = true;
                        minesleft = totalnumbermines - 1;
                        
                          displayamountofmines();
                        break outerloop;
                        
                    }else{
                        minegridbuttons[i][j].setIcon(null);
                        flagset[i][j] = false;
                        minesleft = totalnumbermines + 1;
                          displayamountofmines();
                }
                    }
                }
            }
            }
          
	}
	public void mouseMoved(MouseEvent evt){
			
		}
	//Key Methods
	public void mouseDragged(MouseEvent evt){
	
		}
	public void keyReleased(KeyEvent evt){
		
		}
	public void keyPressed(KeyEvent evt){
	//If the user types in a, it activates as well
		
		}
	public void keyTyped(KeyEvent evt){
		
		}
    public static void main(String[] args) {
       	Minesweeper allengui = new Minesweeper();
	allengui.setVisible(true);

    }
}
