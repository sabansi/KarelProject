import acm.program.ConsoleProgram;

public class Problem51 extends ConsoleProgram{
	public void run() {
		String text = readLine("Enter text: ");
		String replaced = removeDuplicates(text);
		println(replaced);
	}
	
	private String removeDuplicates(String text) {
		String result = "";
		for(int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if(text.indexOf(ch) == i) {
				result += ch;
			}
		}
		return result;
	}
}
