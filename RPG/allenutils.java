package myrpg;
import hsa.*;

public class allenutils{

public static void pause(int intMS){
	try{
	Thread.sleep(intMS);
	}catch(InterruptedException e){
		}
	}
	
	public static void logo(Console con){
		int intX;
		int intY;
		con.drawString("Allen", 400, 400);
		
	}
	public static int openfile(Console con, String strLines){
	int intLines;
	strLines = "       ";
	intLines = 0;
	TextInputFile infile = new TextInputFile("HERPDERP.txt");
	
	while(infile.eof()!= true){
	strLines = infile.readLine();
	intLines = intLines + 1;
	con.println(strLines);
		}
	return intLines;
	}
	public static void writeLine(Console con, String strWriteThis){
	TextInputFile infile = new TextInputFile ( "writing.txt");
	TextOutputFile outfile = new TextOutputFile ("writing.txt", true);
	String strLines;
	strLines = "                                ";
	while(infile.eof() != true){
	strLines = infile.readLine();
	}
	infile.close();
	con.println("What would you like to type in?");
	strWriteThis = con.readLine();
	outfile.println(strWriteThis);
	outfile.close();
	}
		public static String[][] teamsfile(Console con, String strFileName){

	strFileName = "teams.csv";
	TextInputFile infile = new TextInputFile(strFileName);
	
	String strTeam[][];
	strTeam = new String[4][10];
	String strLine;
	int intCounter;
	int intRow;
	int intLength;
	intLength = 0;
	String strCommas;
	int intLines;
	intLines = 0;
	int intRowMax;
	intRowMax = 0;
	int intWord;
	intWord=  0;
	int intCommas;
	intCommas = 0;
	while(infile.eof()!= true){
	intWord = 0;
	int intCol;
	intCol = 0;
	intCommas = 0;
	intLines=  intLines + 1;
	strLine = infile.readLine();
	intLength = strLine.length();
	
	for(intCounter = 0; intCounter < intLength; intCounter ++){
		strCommas = strLine.substring(intCounter, intCounter + 1);
		
	if(strCommas.equalsIgnoreCase(",")){
		strTeam[intWord][intCol] = strLine.substring(intCommas, intCounter);
		con.println(strTeam[intWord][intCol]);
		intCommas = intCounter + 1;
		intCol = intCol + 1;	
			
		}
	}
	if(intWord == 3){
		strTeam[intWord][0] = strLine.substring(intCommas, intLength);
			}
		}
	intRowMax = intLines/10;
	return strTeam;
	}
	
	public static String[][]map1(String strMapName){
		TextInputFile infile = new TextInputFile(strMapName);
	

	int intRow;
	int intCol;
	String strLineSplit[];
	strLineSplit = new String[20];
	String strMap[][];
	strMap = new String[20][20];
	String strLine;
	strLine = "      ";
	while(infile.eof()!= true){
		for(intCol = 0; intCol < 20; intCol ++){
		strLine = infile.readLine();
		strLineSplit = strLine.split(",");
		for(intRow = 0; intRow < 20; intRow ++){
		strMap[intRow][intCol] = strLineSplit[intRow];
				}
			}
		}
		infile.close();
		return strMap;
		}
	public static String[][]buildingmap(String strMapNameTwo){
		TextInputFile infile = new TextInputFile(strMapNameTwo);
		int intRow;
	int intCol;
	String strLineSplit[];
	strLineSplit = new String[20];
	String strMapTwo[][];
	strMapTwo = new String[20][20];
	String strLine;
	strLine = "      ";
	while(infile.eof()!= true){
		for(intCol = 0; intCol < 20; intCol ++){
		strLine = infile.readLine();
		strLineSplit = strLine.split(",");
		for(intRow = 0; intRow < 20; intRow ++){
		strMapTwo[intRow][intCol] = strLineSplit[intRow];
		
				}
			}
		}
		
		infile.close();
		return strMapTwo;
		}
		public static String[][]maptwo(String strMapNameThree){
		TextInputFile infile = new TextInputFile(strMapNameThree);
	int intRow;
	int intCol;
	String strLineSplit[];
	strLineSplit = new String[20];
	String strMapThree[][];
	strMapThree = new String[20][20];
	String strLine;
	strLine = "      ";
	while(infile.eof()!= true){
		for(intCol = 0; intCol < 20; intCol ++){
		strLine = infile.readLine();
		strLineSplit = strLine.split(",");
		for(intRow = 0; intRow < 20; intRow ++){
		strMapThree[intRow][intCol] = strLineSplit[intRow];
		
				}
			}
		}
		infile.close();
		return strMapThree;
	
	}
	public static String help(String strTextName){
		TextInputFile infile = new TextInputFile(strTextName);
		String strHelp;
		strHelp = "                                                                         ";
			while(infile.eof()!= true){
			strHelp = infile.readLine();
		}
		infile.close();
		return strHelp;
		
	}
	
}