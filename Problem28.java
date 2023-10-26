import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram { 
	public void run() {
		while(true) {
			int n = readInt("Enter a number: ");
			println("the amount of even numbers is: " + countEvens(n));
			}
		}
	private int countEvens(int n) {
		int ans = 0;
			if(n % 2 == 0) {
				ans++;
			}
			else if(n == -1) {
				return ans;
			}
	}
}
