import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram { 
	public void run() {
		int ans = 0;
		while(true) {
			int n = readInt("Enter a number: ");
			if(n % 2 == 0) {
				ans++;
			}
			else if(n == -1) {
				println("the amount of even numbers is: " + ans);
				break;
			}
		}
	}
}
