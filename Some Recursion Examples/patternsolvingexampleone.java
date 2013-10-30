import java.io.*;

public class recursion1b{
	public static void main(String[]args){
		Console keyboard = System.console();
		int intPos;
		int intCurrent;
		System.out.println("What number of the fib sequence do you want?");
		intPos = Integer.parseInt(keyboard.readLine());
		intCurrent = fibmethod(intPos);
		System.out.println("The value is: " + intCurrent);
	}
	public static int fibmethod(int intP){
		if(intP == 1 || intP == 2){
			return 1;
		}else{
			return fibmethod(intP - 1) + fibmethod(intP - 2);	
		}	
	}
}