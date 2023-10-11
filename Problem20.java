import acm.program.ConsoleProgram;

public class Problem20 extends ConsoleProgram {
	public void run() {
		int sum = 0;
		//enter a number
		int n = readInt("Enter an amount of numbers: ");
		//for loop to sum them up
		for(int i = 0; i < n; i ++) {
			int x = readInt("Enter a number to sum up: ");
			sum += x;
		}
		println("The sum of provided numbers is: " + sum);
	}
}
