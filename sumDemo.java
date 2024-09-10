import java.util.Scanner;

public class sumDemo {
  /**
  *This program is intended to find the sum of two numbers inputted by the user
  **/
    public static void main(String[] args) {
 		Scanner scnr = new Scanner(System.in);
	    	int sum;
    /**
    *code below asks for user input for the first number.
    **/
		System.out.println("Enter first num:");
		int num1 = scnr.nextInt();
		System.out.println("Enter second num: ");
		int num2 = scnr.nextInt();
		sum = num1 + num2;
		System.out.println("Your sum is " + sum);
        	scnr.close();
    }
}
