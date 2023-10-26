import acm.program.ConsoleProgram;

public class Problem27 extends ConsoleProgram { 
	public void run() {
		int n = readInt("Enter the first number: ");
		int m = readInt("Enter the second number: ");
		int ans = 1;
		for(int i=0; i<m; i++) {
			ans *= n;
		}
		println("n power of m is: " + ans);
	}
}
