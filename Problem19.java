import acm.program.ConsoleProgram;

public class Problem19 extends ConsoleProgram {
	public void run() {
		//enter a number
		int n = readInt("Enter the number: ");
		//for loop to get through every number from 0 to n-1
		for(int i = 0; i < n; i ++) {
			println("Hello " + i);
		}
	}
}
