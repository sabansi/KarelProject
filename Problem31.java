import acm.program.ConsoleProgram;

public class Problem31 extends ConsoleProgram{
	public void run() {
		int n = readInt("enter a numer: ");
		if(checkPrime(n)) {
			println(n + " is a prime number");
		}
		else {
			println(n + " is a composed number");
		}
	}
	private boolean checkPrime(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}
}
