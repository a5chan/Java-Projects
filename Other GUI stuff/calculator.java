import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class calculator extends JFrame implements ActionListener{
	
	public JPanel thePanel;
	public JTextField theTextField;
	public JButton theBackSpaceButton;
	public JButton theCEButton;
	public JButton theCButton;
	public JButton theButton0;
	public JButton theButton1;
	public JButton theButton2;
	public JButton theButton3;
	public JButton theButton4;
	public JButton theButton5;
	public JButton theButton6;
	public JButton theButton7;
	public JButton theButton8;
	public JButton theButton9;
	public JButton theButtonDot;
	public JButton theSlash;
	public JButton theButtonStar;
	public JButton theButtonMinus;
	public JButton theButtonPlus;
	public JButton theButtonSign;
	public JButton theButtonSquare;
	public JButton theButtonModulus;
	public JButton theButtonFraction;
	public JButton theButtonEqual;
	public JButton theButtonMC;
	public JButton theButtonMR;
	public JButton theButtonMP;
	public JButton theButtonMS;
	public String strText = "                                ";
	public boolean blnDecimal;
	public double dblFirst;
	public boolean blnPlus = false;
	public double dblAnswer;
	public double dblSecond;	
	public boolean blnEqual;
	public boolean blnMinus = false;
	public boolean blnDivide;
	public boolean blnMultiply;
	public boolean blnSquareRoot;
	public boolean blnModulus;
	public boolean blnFraction;
	public int intLength;
	public double dblMemory =0;
	public String strSign;
	public boolean blnSign = true;
	public boolean blnMemory = false;
	public calculator(){
		
		super();
		this.setBounds(0,0,400,400);
		thePanel = new JPanel();
		thePanel.setLayout(null);
		Container framecontainer = this.getContentPane();
		framecontainer.add(thePanel);
		theTextField  = new JTextField("                                                                                   ");
		thePanel.add(theTextField);
		theTextField.setBounds(50,0,300,50);
		theCEButton = new JButton("CE");
		theCEButton.setBounds(200,75,50,50);
		thePanel.add(theCEButton);
		theBackSpaceButton = new JButton("Backspace");
		theBackSpaceButton.setBounds(100,75,100,50);
		thePanel.add(theBackSpaceButton);
		theCButton = new JButton("C");
		theCButton.setBounds(250,75,50,50);
		thePanel.add(theCButton);
		theButton0 = new JButton("0");
		theButton0.setBounds(100,300,50,50);
		thePanel.add(theButton0);
		theButton1 = new JButton("1");
		theButton1.setBounds(100,250,50,50);
		thePanel.add(theButton1);
		theButton4 = new JButton("4");
		theButton4.setBounds(100,200,50,50);
		thePanel.add(theButton4);
		theButton7 = new JButton("7");
		theButton7.setBounds(100,150,50,50);
		thePanel.add(theButton7);
		theButton8 = new JButton ("8");
		theButton8.setBounds(150,150,50,50);
		thePanel.add(theButton8);
		theButton5 = new JButton ("5");
		theButton5.setBounds(150,200,50,50);
		thePanel.add(theButton5);
		theButton2=  new JButton("2");
		theButton2.setBounds(150,250,50,50);
		thePanel.add(theButton2);
		theButton9 = new JButton("9");
		theButton9.setBounds(200,150,50,50);
		thePanel.add(theButton9);
		theButton6 = new JButton("6");
		theButton6.setBounds(200,200,50,50);
		thePanel.add(theButton6);
		theButton3 = new JButton("3");
		theButton3.setBounds(200,250,50,50);
		thePanel.add(theButton3);
		theButtonSign = new JButton("+/-");
		theButtonSign.setBounds(150,300,50,50);
		thePanel.add(theButtonSign);
		theButtonDot = new JButton(".");
		theButtonDot.setBounds(200,300,50,50);
		thePanel.add(theButtonDot);
		theSlash = new JButton("/");
		theSlash.setBounds(250,150,50,50);
		thePanel.add(theSlash);
		theButtonStar = new JButton("*");
		theButtonStar.setBounds(250,200,50,50);
		thePanel.add(theButtonStar);
		theButtonMinus = new JButton("-");
		theButtonMinus.setBounds(250,250,50,50);
		thePanel.add(theButtonMinus);
		theButtonPlus = new JButton("+");
		theButtonPlus.setBounds(250,300,50,50);
		thePanel.add(theButtonPlus);
		theButtonSquare = new JButton("sqrt");
		theButtonSquare.setBounds(300,150,60,50);
		thePanel.add(theButtonSquare);
		theButtonModulus = new JButton("%");
		theButtonModulus.setBounds(300,200,60,50);
		thePanel.add(theButtonModulus);
		theButtonFraction = new JButton("1/x");
		theButtonFraction.setBounds(300,250,60,50);
		thePanel.add(theButtonFraction);
		theButtonEqual = new JButton("=");
		theButtonEqual.setBounds(300,300,60,50);
		thePanel.add(theButtonEqual);
		theButtonMC = new JButton("MC");
		theButtonMC.setBounds(50,150,60,50);
		thePanel.add(theButtonMC);
		theButtonMR = new JButton("MR");
		theButtonMR.setBounds(50,200,60,50);
		thePanel.add(theButtonMR);
		theButtonMS = new JButton("MS");
		theButtonMS.setBounds(50,250,60,50);
		thePanel.add(theButtonMS);
		theButtonMP = new JButton ("M+");
		theButtonMP.setBounds(50,300,60,50);
		thePanel.add(theButtonMP);
		theBackSpaceButton.addActionListener(this);
		theCEButton.addActionListener(this);
		theCButton.addActionListener(this);
		theButton0.addActionListener(this);
		theButton1.addActionListener(this);
		theButton2.addActionListener(this);
		theButton3.addActionListener(this);
		theButtonSign.addActionListener(this);
		theButton4.addActionListener(this);
		theButton5.addActionListener(this);
		theButton6.addActionListener(this);
		theButton7.addActionListener(this);
		theButton8.addActionListener(this);
		theButton9.addActionListener(this);
		theButtonDot.addActionListener(this);
		theSlash.addActionListener(this);
		theButtonStar.addActionListener(this);
		theButtonMinus.addActionListener(this);
		theButtonPlus.addActionListener(this);
		theButtonSquare.addActionListener(this);
		theButtonModulus.addActionListener(this);
		theButtonFraction.addActionListener(this);
		theButtonEqual.addActionListener(this);
		theButtonMC.addActionListener(this);
		theButtonMR.addActionListener(this);
		theButtonMS.addActionListener(this);
		theButtonMP.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evt){
			if(evt.getSource() == theCButton){
				theTextField.setText("                            ");
				dblAnswer = 0;
				dblFirst = 0;
				dblSecond = 0;
				strText = "";
			 }
			if(evt.getSource() == theButton0){
				if(blnEqual == true){
					blnEqual = false;
					strText = strText + "";
				
				}
		
			}else if(evt.getSource() == theButton1){
				if(blnEqual == true){
					blnEqual = false;
					strText = strText + "";
				}
				strText = strText + "1";
				theTextField.setText(strText);
				blnEqual = false;
			}else if(evt.getSource() == theButton2){
				
				if(blnEqual == true){
					blnEqual = false;
					strText = strText + "";
				}
				strText = strText + "2";
				theTextField.setText(strText);
				blnEqual = false;
			}else if(evt.getSource() == theButton3){
				if(blnEqual == true){
					blnEqual = false;
					strText = strText + "";
				}
				strText = strText + "3";
				theTextField.setText(strText);
				blnEqual = false;
			}else if(evt.getSource() == theButton4){
				if(blnEqual == true){
					blnEqual = false;
					strText = strText + "";
				}
				strText = strText + "4";
				theTextField.setText(strText);
				blnEqual = false;
			}else if(evt.getSource() == theButton5){
				if(blnEqual == true){
					blnEqual = false;
					strText = strText + "";
				}
				strText = strText + "5";
				theTextField.setText(strText);
				blnEqual = false;
			}else if(evt.getSource() == theButton6){
				if(blnEqual == true){
					blnEqual = false;
					strText = strText + "";
				}
				strText = strText + "6";
				theTextField.setText(strText);
				blnEqual = false;
			}else if(evt.getSource() == theButton7){
				if(blnEqual == true){
					blnEqual = false;
					strText = strText + "";
				}
				strText = strText + "7";
				theTextField.setText(strText);
				blnEqual = false;
			}else if(evt.getSource() == theButton8){
				if(blnEqual == true){
					blnEqual = false;
					strText = strText + "";
				}
				strText = strText + "8";
				theTextField.setText(strText);
				blnEqual = false;
			}else if(evt.getSource() == theButton9){
				if(blnEqual == true){
					blnEqual = false;
					strText = strText + "";
				}
				strText = strText+ "9";
				theTextField.setText(strText);
				blnEqual = false;
			}else if(evt.getSource() == theButtonDot){
				
				if(blnDecimal == false){
				blnDecimal = true;
				strText = strText + ".";
				theTextField.setText(strText);
				}
			}
			if(evt.getSource() == theButtonPlus){
				if(blnPlus == false && blnEqual == false && blnSign == true){
					blnPlus = true;
					dblFirst = Double.parseDouble(strText);
					dblSecond = 0;
					strText = "";
					blnDecimal = false;
					
				}else if(blnPlus == false && blnEqual == false && blnSign == false){
					blnPlus = true;
					dblFirst = Double.parseDouble(strText);
					dblFirst = dblFirst * -1;
					strText = "";
					dblSecond = 0;
					blnDecimal = false;
				}else if(blnPlus == false && blnEqual == false && blnSign == false && dblFirst < 0 || dblFirst > 0){
					blnPlus = true;
					dblSecond = Double.parseDouble(strText);
					dblSecond = dblSecond * -1;
					blnDecimal = false;
					System.out.println(dblSecond);
				}
			} 
			if(evt.getSource() == theButtonMinus){
				if(blnMinus == false && blnEqual == false){
					blnMinus = true;
					dblFirst= Double.parseDouble(strText);
					strText = "";
					blnDecimal = false;
				}
			}
			if(evt.getSource() == theButtonStar){
				if(blnMultiply == false && blnEqual == false){
					blnMultiply=  true;
					dblFirst = Double.parseDouble(strText);
					strText = "";
					blnDecimal = false;
				}
			}
			if(evt.getSource() == theSlash){
				if(blnDivide == false && blnEqual == false){
					blnDivide = true;
					dblFirst = Double.parseDouble(strText);
					strText= "";
					blnDecimal = false;
				}
			}
			if(evt.getSource() == theButtonSquare){
				if(blnSquareRoot == false && blnEqual == false){
					blnSquareRoot = true;
					dblFirst = Double.parseDouble(strText);
					strText = "";
					blnDecimal = false;
				}
			}
			if(evt.getSource() == theButtonModulus){
				if(blnModulus == false && blnEqual == true){
					blnModulus = true;
					dblAnswer = dblFirst/dblAnswer;
					strText = dblAnswer + "";
					theTextField.setText(strText);
					strText = "";
					blnModulus = false;
					blnDecimal = false;
				}
			}
			if(evt.getSource() == theButtonFraction){
				if(blnFraction == false && blnEqual == false){
					blnFraction = true;
					dblFirst = Double.parseDouble(strText);
					strText = "";
					blnDecimal = false;
				}
			}
			if(evt.getSource() == theBackSpaceButton){
				intLength = strText.length();
				strText = strText.substring(0, intLength - 1);
				theTextField.setText(strText);
				blnDecimal = false;
			}
				if(evt.getSource() == theButtonMP){
					if(blnMemory == false || blnEqual == true){
						blnMemory= true;
						dblMemory = Double.parseDouble(strText);
						strText = "";
						theTextField.setText(strText);
					}else if(blnMemory == true && dblMemory > 0 || dblMemory <0){
						blnMemory = false;
						strText = dblMemory + "";
						theTextField.setText(strText);
					}
				}
				if(evt.getSource() == theButtonSign){
					if(blnSign == true && dblSecond == 0){
						blnSign = false;
						strSign = "-";
						theTextField.setText(strSign + strText);
					}else if(blnSign == true && dblFirst > 0 || dblFirst < 0){
						blnSign = false;
						strSign = "-";
						theTextField.setText(strSign + strText);
				}
			}
					
			if(evt.getSource() == theButtonEqual){
				if(blnEqual == false && blnPlus == true){
					blnEqual = true;
					dblSecond = Double.parseDouble(strText);
					System.out.println(dblFirst);
					dblAnswer = dblFirst + dblSecond;
					strText = dblAnswer + "";
					theTextField.setText(strText);
				
					blnPlus = false;
					blnDecimal = false;
			
				
				}else if(blnEqual == false && blnMinus == true){
					blnEqual = true;
					dblSecond= Double.parseDouble(strText);
					dblAnswer = dblFirst - dblSecond;
					strText = dblAnswer + "";
					theTextField.setText(strText);
					
					blnMinus = false;
					blnDecimal = false;
					
				}else if(blnEqual == false && blnDivide == true){
					blnEqual = true;
					dblSecond = Double.parseDouble(strText);
					dblAnswer = dblFirst/dblSecond;
					strText = dblAnswer + "";
					theTextField.setText(strText);
				
					blnDivide = false;
					blnDecimal = false;
				}else if(blnEqual == false && blnMultiply == true){
					blnEqual = true;
					dblSecond= Double.parseDouble(strText);
					dblAnswer=  dblFirst * dblSecond;
					strText = dblAnswer + "";
					theTextField.setText(strText);
					blnMultiply = false;
					blnDecimal = false;
			}else if(blnEqual == false && blnSquareRoot == true){
				blnEqual = true;
				dblAnswer = Math.sqrt(dblFirst);
				strText = dblAnswer + "";
				theTextField.setText(strText);
			
				blnSquareRoot = false;
				blnDecimal = false;
			}else if(blnEqual == false && blnFraction == true){
				blnEqual = true;
				dblAnswer = 1/dblFirst;
				strText = dblAnswer + "";
				theTextField.setText(strText);
				
				blnFraction = true;
				blnDecimal = false;
			
			}
		}
	}	
		
		public static void main(String[]args){
		calculator allengui = new calculator();
		allengui.setVisible(true);
		}
	}