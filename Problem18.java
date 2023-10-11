import acm.program.*;

public class Problem18 extends ConsoleProgram {
	public void run() {
		//enter numbers
		int x = readInt("Enter the first number: ");
		int y = readInt("Enter the second number: ");
		//compare numbers
		if(x > y) {
			println("maximum between these numbers is: " + x);
		}
		else {
			println("maximum between these numbers is: " + y);
		}
	}
}
