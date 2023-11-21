import acm.program.ConsoleProgram;

public class Problem48 extends ConsoleProgram {
	public void run() {
		String input = readLine("Enter a word: ");
		printCharStatistics(input);
	}

	private void printCharStatistics(String text) {
		for (int i = 0; i < text.length(); i++) {
			char currCh = text.charAt(i);
			if (isFirstOccurence(text, i)) {
				int count = countSymbol(text, currCh);
				println(currCh + ": " + count);
			}
		}
	}

	private boolean isFirstOccurence(String text, int index) {
		return(text.indexOf(text.charAt(index)) == index);
	}

	private int countSymbol(String text, char symbol) {
		int symbolCount = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == symbol) {
				symbolCount++;
			}
		}
		return symbolCount;
	}
}
