import acm.program.ConsoleProgram;

public class Problem29 extends ConsoleProgram {
	public void run() {
		int n = readInt("enter a number: ");
		if(n == 1 || n == 2) {
			println("the " + n + "th number of fibonacci sequence is: 2");
		}
		else {
			println("the " + n + "th number of fibonacci sequence is: " + fibonacciSeq(n));
		}
	}
	private int fibonacciSeq(int n) {
		int first = 1;
		int second = 1;
		int ans = 0;
		for(int i = 0; i < n-2; i++) {
			ans = first + second;
			first = second;
			second = ans;
		}
		return ans;
	}
}
