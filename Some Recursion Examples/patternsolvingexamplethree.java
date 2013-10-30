import java.io.*;
//4, -10, 5, -1, -6, -2, -9, -17, -28
public class recursion4{
	public static void main(String[]args){
		Console keyboard = System.console();
		int intPos;
		int intCurrent;
		System.out.println("What number of the boo sequence do you want?");
		intPos = Integer.parseInt(keyboard.readLine());
		intCurrent = cadmethod(intPos);, -
		System.out.println("The value is: " + intCurrent);
	}
	public static int cadmethod(int intP){
		if(intP == 1){
			return 4;
		}else if(intP == 2){
			return - 10;
		}else if(intP == 3){
			return 5;
		}else if(intP == 4)
		
	}
}