package JavaAssignments;

import java.util.Scanner;

public class factorial {

	public static int factorial(int n) {
		if (n != 0) // termination condition
			return n * factorial(n - 1); // recursive call
		else
			return 1;
	}

	public static void main(String[] args) {
		int result;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number to find it's factorial ");
		int number = obj.nextInt();
		result = factorial(number);
		System.out.println(number + " factorial = " + result);
	}

}
