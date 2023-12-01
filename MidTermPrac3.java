import acm.program.ConsoleProgram;

public class MidTermPrac3 extends ConsoleProgram {
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
		for(int i = 1; i < text1.length() - 1; i++) {
			String split1 = text1.substring(0, i);
			String split2 = text1.substring(i);
			if(manipulation(split1, split2, text2)) {
				return true;
			}
		}
		return false;
	}

	private boolean manipulation(String split1, String split2, String text2) {
		for(int i = 0; i < split1.length(); i++) {
			String newSplit1 = removeChars(split1, split1.charAt(i));
			for(int j = 0; j < split2.length(); j++) {
				String newSplit2 = removeChars(split2, split2.charAt(j));
				String result = newSplit1 + newSplit2;
				if(result.equals(text2)) {
					return true;
				}
			}
		}
		return false;
	}

	private String removeChars(String text, char ch) {
		String removed = "";
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == ch) {
				text = text.replace(text.charAt(i) + "", " ");
			}
		}
		return text;
	}

}
