import acm.program.*;

public class Problem46 extends ConsoleProgram {
	public void run() {
		int countMax = 0;
		int countIndex = 0;
		String input = readLine("Enter a word: ");
		char answer = ' ';
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(i) == input.charAt(j) && i != j) {
					countIndex++;
				}
			}
			if (countMax < countIndex) {
				countMax = countIndex;
				answer = input.charAt(i);
			}
		}
		println("The most frequent character in the word is: " + answer);
	}
}
