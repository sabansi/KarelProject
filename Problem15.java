import acm.program.*;

public class Problem15 extends ConsoleProgram {
	public void run() {
		int x = readInt("Enter the first number: ");
		int y = readInt("Enter the second number: ");
		println("The arithmetic mean of these numbers is: " + (double) (( x + y ) / 2));
	}
}
