import acm.program.*;

public class Problem45 extends ConsoleProgram {
	public void run() {
		int answer = 0;
		String inputWord = readLine("Enter word: ");
		String inputSymb = readLine("Enter symbol: ");
		for (int i = 0; i < inputWord.length(); i++) {
			if (inputWord.charAt(i) == inputSymb.charAt(0)) {
				answer++;
			}
		}
		println("there are " + answer + " " + inputSymb + "-s in your word");
	}

}
