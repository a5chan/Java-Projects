import java.io.*;

public class recursion1{
	public static void main(String[]args){
		Console keyboard = System.console();
		int intPos;
		int intPre;
		int intPrePre;
		int intCurrent;
		int intCounter;
		intPre = 1;
		intPrePre = 1;
		intCurrent = 1;
		System.out.println("What number on the fib sequence do you want?");
		intPos = Integer.parseInt(keyboard.readLine());
		if(intPos ==1 || intPos == 2){
			intCurrent = 1;
		}else{
		
		for(intCounter = 2; intCounter < intPos; intCounter ++){
			intCurrent = intPre + intPrePre;
			intPrePre = intPre;
			intPre = intCurrent;
			}
		}
		System.out.println("The value is: " + intCurrent);
	}
}