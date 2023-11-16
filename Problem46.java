import acm.program.*;
import java.lang.Math;

public class Problem46 extends ConsoleProgram {
	public void run() {
		int countMax = 0;
		int countIndex = 0;
		String input = readLine("Enter a word: ");
		char answer = 0;
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < input.length(); i++) {
				if (input.charAt(i) == input.charAt(j) && i != j) {
					countIndex++;
				}
			}
			if (countMax < countIndex) {
				countMax = countIndex;
				answer = input.charAt(i);
			}
		}

		println(answer);
	}
}
