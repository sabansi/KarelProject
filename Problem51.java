import acm.program.ConsoleProgram;

public class Problem51 extends ConsoleProgram{
	public void run() {
		String text = readLine("Enter text: ");
		String replaced = removeDuplicates(text);
		println(replaced);
	}
	
	private String removeDuplicates(String text) {
		text.replace("i", "");
		println(text.replace("i", ""));
		return text;
	}
}
