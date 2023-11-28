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
			result += text.charAt(i);
			char ch = text.charAt(i);
			for(int j = i; j < text.length(); j++) {
				if(text.charAt(i) != text.charAt(j)) {
					result += text.charAt(j);
				}
			}
		}
		return result;
	}
}
