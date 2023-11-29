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
		for(int i = 0; i < text1.length(); i++) {
			splitText1 = text1.substring(0, i +1);
			splitText2 = text1.substring(i+1);
		}
		println(splitText1);
		println(splitText2);
		return false;
	}
}
