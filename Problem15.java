import acm.program.*;

public class Problem15 extends ConsoleProgram {
	public void run() {
		double x = readInt("Enter the first number: ");
		double y = readInt("Enter the first number: ");
		println("the arithmetic mean of these numbers is: " + (double) ((x + y) / 2));
	}
}
