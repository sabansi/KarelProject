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
		int count = 0;
		int lastInd = 0;
		boolean occ = false;
		for (int i = 0; i < text2.length(); i++) {
			for (int j = lastInd; j < text1.length(); j++) {
				if (text2.charAt(i) == text1.charAt(j)) {
					lastInd = j;
					count++;
					occ = true;
					break;
				}
				if(occ == true) break;
			}
		}
		if (count == text2.length()) {
			return true;
		}
		return false;
	}

}
