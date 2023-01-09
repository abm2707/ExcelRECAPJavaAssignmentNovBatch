package JavaAssignments;

public class calculator {

	// defining a function named add to perform addition operation
	public void add(int num1,int num2) {
		int sum = num1 + num2;
		System.out.println("The sum of the numbers are "+sum);
	}
	// defining a function named diff to perform subtraction operation
	public void diff(int num1,int num2) {
		int diff = num1-num2;
		System.out.println("The differenc between numbers is "+ diff);
	}
	// defining a function named product to perform multiplication operation
	public void product(int num1,int num2) {
		int product = num1 * num2;
		System.out.println("The product of the numbers is "+ product);
	}
	// defining a function named div to perform division operation
	public void divide(int num1,int num2) {
		int quotient = num1/num2;
		System.out.println("The quotient after division is "+ quotient);
	}
	public static void main(String[] args) {
		calculator obj = new calculator();
		obj.add(1,2);
		obj.diff(10,5);
		obj.product(10, 20);
		obj.divide(20, 10);
	}
}
