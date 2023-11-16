import acm.program.ConsoleProgram;

public class Problem47 extends ConsoleProgram {
	public void run() {
		String input = readLine("Enter a word: ");
		int count = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == input.charAt(input.length() - i)) {
				count++;
			}
		}
		if(count == input.length()) {
			println("This word IS a palindrome!");
		}
		else {
			println("This word is NOT a palindrome!");
		}
	}
}
