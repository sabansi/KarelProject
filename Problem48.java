import acm.program.ConsoleProgram;

public class Problem48 extends ConsoleProgram {
	public void run() {
		String input = readLine("Enter a word: ");
		printCharStatistics(input);
	}

	private void printCharStatistics(String text) {
		for(int i = 0; i< text.length(); i++) {
			int count = countSymbol(text, text.charAt(i));
			println(text.charAt(i) + ": " + count);
		}
	}
	
	private int countSymbol(String text, char symbol) {
		int symbolCount = 0;
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == symbol) {
				symbolCount++;
			}
		}
		return symbolCount;
	}
}
