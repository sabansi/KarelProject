import acm.program.ConsoleProgram;

public class Problem17 extends ConsoleProgram {
	public void run() {
		double a = readInt("Enter the number: ");
		println("The integer part of this number is: " + (int) a + " and the decimal part is: " + ( a - (int) a));
	}
}
