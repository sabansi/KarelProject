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
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'y') {
				newStr += s.charAt(i);
			}
		}
		println(newStr);
		if (newStr.length() <= 6) {
			for(int i = 0; i < newStr.length() - 1; i++) {
				if(newStr.charAt(i) < newStr.charAt(i+1)) {
					count1++;
				}
			}
			if(count1 == newStr.length() - 1) {
				for(int i = 0; i < newStr.length(); i++) {
					char ch = newStr.charAt(i);
					if(newStr.indexOf(ch) == i) {
						count2++;
					}
				}
				println(count1);
				println(count2);
				if(count2 == count1 + 1) {
					return true;
				}
			}
		} 

		return false;
	}
}
