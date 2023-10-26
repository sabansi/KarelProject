import acm.program.ConsoleProgram;

public class Problem29 extends ConsoleProgram {
	public void run() {
		int n = readInt("enter a number: ");
		int first = 1;
		int second = 1;
		int ans;
		for(int i=0; i < n; i++) {
			ans = first + second;
			first = second;
			second = ans;
		}
		println("the " + n + "th number of fibonacci sequence is: " + ans);
	}
}
