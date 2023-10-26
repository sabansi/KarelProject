import acm.program.ConsoleProgram;

public class Problem30 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter a number: ");
		int m = n;
		println("the inversed number of " + m + " is : " + reverse(m));
	}
	private int reverse(int n) {
		int ans = 0;
		while(n > 0) {
			ans +=  n % 10;
			ans *= 10;
			n /= 10;
		}
		ans /= 10;
		return ans;
	}
}
