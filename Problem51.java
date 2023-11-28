import acm.program.ConsoleProgram;

public class Problem51 extends ConsoleProgram{
	public void run() {
		String text = readLine("Enter text: ");
		String replaced = removeDuplicates(text);
		println(replaced);
	}
	
	private String removeDuplicates(String text) {
		println(text.replace("ba", "BA"));
		return text;
	}
}
