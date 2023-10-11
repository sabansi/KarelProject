import acm.program.ConsoleProgram;

public class Problem16 extends ConsoleProgram {
	public void run() {
		double a = readInt("Enter the first number: ");
		double b = readInt("Enter the second number: ");
		double c = readInt("Enter the third number: ");
		println("the harmonic mean of these numbers is: " + (double) ( 1 / ( 1 / a + 1 / b + 1 / c ) ) );
	}
}
