import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram {
	public static final int SENTINEL = -1;
	public void run() {
		int ans = 0;
		int n = 0;
		while(n != SENTINEL) {
			 n = readInt("Enter a number: ");
			if(n % 2 == 0) {
				ans++;
			}
			println("the amount of even numbers is: " + ans);
		}
	}
}
