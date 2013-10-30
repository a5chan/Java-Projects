import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class slicendiceallen extends JFrame implements ActionListener{
	
	public JPanel thePanel;
	public JTextField theTextFieldOne;
	public JTextField theTextFieldTwo;
	public JButton thePassOne;
	public JButton thePassTwo;
	public JButton theRollOne;
	public JButton theRollTwo;
	public JTextField theTextFieldThree;
	public int intTurnOne = 1;
	public int intTurnTwo = 0;
	public String strText;
	public int intRollOne = 0;
	public int intRollTwo = 0;
	public int intTotal = 0; 
	public int intTotalTurn;
	public int intRollThree = 0;
	public int intRollFour = 0;
	public int intTotalTurnTwo;
	public int intCounter = 0;
	public int intTotalTurnRoll;
	public int intTotalTurnRollTwo;
	public int intTotalTwo = 0;

	
	public slicendiceallen(){
		super();
		this.setBounds(0,0,800,800);
		
		thePanel = new JPanel();
		thePanel.setLayout(null);
		Container framecontainer = this.getContentPane();
		framecontainer.add(thePanel);
		theTextFieldOne = new JTextField("                     ");
		theTextFieldOne.setBounds(20,20,200,50);
		thePanel.add(theTextFieldOne);
		theTextFieldTwo = new JTextField("                   ");
		theTextFieldTwo.setBounds(400,20,200,50);
		thePanel.add(theTextFieldTwo);
		thePassOne = new JButton("Pass");
		thePassOne.setBounds(20,100,200,200);
		thePanel.add(thePassOne);
		thePassTwo = new JButton("Pass");
		thePassTwo.setBounds(400,100,200,200);
		thePanel.add(thePassTwo);
		theRollOne = new JButton("Roll");
		theRollOne.setBounds(20,400,100,100);
		thePanel.add(theRollOne);
		theRollTwo = new JButton("Roll");
		theRollTwo.setBounds(400,400,100,100);
		thePanel.add(theRollTwo);
		theTextFieldThree = new JTextField("             ");
		theTextFieldThree.setBounds(150,500,200,100);
		thePanel.add(theTextFieldThree);
		theRollOne.addActionListener(this);
		theRollTwo.addActionListener(this);
		thePassOne.addActionListener(this);
		thePassTwo.addActionListener(this);
		
		
		
	}
		public void actionPerformed(ActionEvent evt){
					
				if(evt.getSource() == theRollOne && intTurnOne == 1){
					intRollOne = (int)(Math.random()* 6+ 1);
					intRollTwo = (int)(Math.random() * 6+1);
					System.out.println(intRollOne);
					System.out.println(intRollTwo);
					theTextFieldTwo.setText("                      ");
						if(intRollOne != intRollTwo && intTurnOne == 1){
					intTotalTurnRoll = intRollOne + intRollTwo;
					intTotalTurn = intTotalTurn + intTotalTurnRoll;
				
					strText = intTotalTurn + "";
					theTextFieldOne.setText(strText);
				}else if(intRollTwo == intRollOne && intTurnOne == 1){
					intTotalTurn = 0;
					intTurnOne = 0;
					intTurnTwo = 1;
					theTextFieldThree.setText("Sorry, it's player's two turn now, you rolled doubles");
					theTextFieldOne.setText("                    ");
					
				}
			}
		
				if(evt.getSource() == thePassOne && intTurnOne == 1){
					
					intTotal = intTotalTurn + intTotal;
					intTurnOne = 0;
					intTurnTwo = 1;
					System.out.println(intTotal);
					intTotalTurn = 0;
				}
			
			
				
				if(evt.getSource() == theRollTwo && intTurnTwo == 1){
					intRollThree=  (int)(Math.random() * 6+ 1);
					intRollFour	= (int)(Math.random() * 6+1);
					System.out.println(intRollThree);
					System.out.println(intRollFour);
					theTextFieldThree.setText("             ");
					theTextFieldOne.setText("                    ");
					if(intRollFour != intRollThree && intTurnTwo == 1){
				intTotalTurnRollTwo = intRollThree + intRollFour;
				intTotalTurnTwo = intTotalTurnTwo + intTotalTurnRollTwo;
				strText = intTotalTurnTwo + "";
				theTextFieldTwo.setText(strText);
					}else if(intRollFour == intRollThree && intTurnTwo == 1){
					intTotalTurnTwo = 0;
					intTurnOne = 1;
					intTurnTwo = 0;
					theTextFieldThree.setText("Sorry, it's player's One turn now, you rolled doubles");
					theTextFieldTwo.setText("                    ");
				
				
				}
			}	
				if(evt.getSource() == thePassTwo && intTurnTwo == 1){
					intTotalTwo = intTotalTurnTwo + intTotalTwo;
					intTurnOne = 1;
					intTurnTwo = 0;
					theTextFieldTwo.setText("                 ");
					System.out.println(intTotalTwo);
					intTotalTurnTwo = 0;
				}
				if(intTotal >= 100){
					theTextFieldThree.setText("Player ONE WINS");
					intTurnOne = 0;
					intTurnTwo = 0;
				}else if(intTotalTwo >= 100){
					theTextFieldThree.setText("Player TWO WINS");
					intTurnOne = 0;
					intTurnTwo = 0;
				}
			
				
			
				
		}
		
		public static void main(String[]args){
		slicendiceallen allengui = new slicendiceallen();
		allengui.setVisible(true);
	}
}