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
		for(int i = 0; i < numb.length(); i++) {
			if(numb.charAt(i) == '1'){
				int binary = Integer.parseInt(numb);
				return binary;
			}
			else if(numb.charAt(i) == '0') {
				numb = numb.replace(numb.charAt(i)+"", "");
			}
			
		}
		int binary = Integer.parseInt(numb);
		println(binary);
		return binary;
	}
}
