import acm.program.ConsoleProgram;

public class Problem23_24 extends ConsoleProgram { 
	public void run() {
		int n = readInt("Enter n: ");
		int sum = calculateSum(n);
		int div = numDivisors(n);
	//	println("sum of numbers from 1 to n is: " + sum);
		println("amount of divisors of n is: " + div);
	}
	
	private int calculateSum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i ++) {
			sum += i;
		}
		return sum;
	}
	
	private int numDivisors(int n) {
		int div = 0;
		for(int i = 1; i <= n; i ++) {
			if( n % i == 0) {
				div++;
			}
		}
		return div;
	}
}
