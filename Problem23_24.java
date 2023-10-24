import acm.program.ConsoleProgram;

public class Problem23_24 extends ConsoleProgram { 
	public void run() {
		int n = readInt("Enter n: ");
		int sum = calculateSum(n);
		println("sum of numbers is: " + sum);
	}
	private int calculateSum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i ++) {
			sum += i;
		}
		return sum;
	}
}
