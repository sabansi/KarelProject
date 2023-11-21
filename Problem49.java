import acm.program.ConsoleProgram;

public class Problem49 extends ConsoleProgram {
	public void run() {
		String input = readLine("Enter a number as a string: ");
		int num = stringToInt(input);
		println(num-2);
	}

	private int stringToInt(String input) {
		int num = 0;
		for(int i = 0; i < input.length(); i++) {
			char currCh = input.charAt(i);
			int currNm = currCh - '0';
			num = num * 10 + currNm;
		}
		return num;
	}
}
