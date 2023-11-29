import acm.program.ConsoleProgram;

public class MidTermPrac2 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		if (isSorted(text)) {
			println("True");
		} else {
			println("False");
		}
	}

	private boolean isSorted(String text) {
		String lowerText = "";
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (Character.isLowerCase(text.charAt(i)) && Character.isLetter(text.charAt(i))) {
				lowerText += text.charAt(i);
			}
		}
		for (int i = 0; i < lowerText.length() - 1; i++) {
			if ((lowerText.charAt(i) < lowerText.charAt(i + 1))) {
				count++;
			}
		} 
		
//		b  c d
		if (count == lowerText.length() - 1) {
			return true;
		}
		return false;
	}
}



/*s a b a
0 1 2 3 */
