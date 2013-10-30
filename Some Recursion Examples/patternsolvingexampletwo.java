import java.io.*;
//1, 3, 6, 10, 15, 21, 28

public class recursion3{
	public static void main(String[]args){
		Console keyboard = System.console();
		int intPos;
		int intCurrent;
		System.out.println("What number of the boo sequence do you want?");
		intPos = Integer.parseInt(keyboard.readLine());
		intCurrent = baamethod(intPos);
		System.out.println("The value is: " + intCurrent);
	}
	public static int baamethod(int intP){
		if(intP == 1){
			return 1;
		}else{
		return baamethod(intP-1) + intP;
		} 
		
	}
}