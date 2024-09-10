import java.util.Scanner;

public class sumDemo {
    public static void main(String[] args) {
 		Scanner scnr = new Scanner(System.in);
	    	int sum;
		System.out.println("Enter first num:");
		int num1 = scnr.nextInt();
		System.out.println("Enter second num: ");
		int num2 = scnr.nextInt();
		sum = num1 + num2;
		System.out.println("Your sum is " + sum);
        	scnr.close();
    }
}
