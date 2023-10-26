import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram { 
	private static final int SENTINEL = -1;
	public void run() {
		while(true) {
			int n = readInt("Enter a number: ");
			if(n == SENTINEL) {
				println("the amount of even numbers is: " + countEvens(n));
					}
			}
		}
	private int countEvens(int n) {
		int ans = 0;
			if(n % 2 == 0) {
				ans++;
			}
			return ans;
	}
}
