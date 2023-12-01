import acm.program.ConsoleProgram;

public class MidTermPrac5 extends ConsoleProgram {
	public void run() {
		String s = readLine();
		if (isMelodic(s)) {
			println("true");
		} else {
			println("false");
		}
	}

	private boolean isMelodic(String s) {
		String newStr = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'y') {
				newStr += s.charAt(i);
			}
		}
		if (newStr.length() == 6) {
			if (newStr.charAt(0) == 'a' && newStr.charAt(1) == 'e' && newStr.charAt(2) == 'i' && newStr.charAt(3) == 'o'
					&& newStr.charAt(4) == 'u' && newStr.charAt(5) == 'y') {
				return true;
			}
		}
		return false;
	}
}
