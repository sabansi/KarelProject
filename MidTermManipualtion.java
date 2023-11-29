import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class MidTermManipualtion extends ConsoleProgram {
	public void run() {
		String text1 = readLine("Enter first string: ");
		String text2 = readLine("Enter second string: ");
		if (checkSplit(text1, text2)) {
			println("True");
		} else {
			println("False");
		}
	}

	private boolean checkSplit(String text1, String text2) {
		String splitText1 = "";
		String splitText2 = "";
		for(int i = 0; i < 1; i++) {
			splitText1 = text1.substring(0, i +1);
			splitText2 = text1.substring(i+1);
			for(int j = 0; j < splitText1.length(); j++) {
				char ch = splitText1.charAt(j);
				String tokenizeText = tokenize(splitText1, ch);
				println(tokenizeText);
			}
		}
		return false;
	}
	
	private String tokenize(String text, char ch) {
		String result = "";
		StringTokenizer token = new StringTokenizer(text, ch + "");
		while(token.hasMoreTokens()) {
			result += token.nextToken();	
		}
		return result;
	}
}
