import acm.program.ConsoleProgram;

public class leetcode1016 extends ConsoleProgram{
	public void run() {
		String numb = readLine();
		int n = readInt();
		if(binaryConvert(numb) == n) {
			println("true");
		}
		else {
			println("false");
		}
	}
	private int binaryConvert(String numb) {
		int binary = Integer.parseInt(numb);
		return binary;
	}
}
