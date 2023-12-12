import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Problem60 extends ConsoleProgram{
	public void run(){
		int n = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>;
		while(n = (readInt("Enter a number:")) != -1) {
			n = (readInt("Enter a number:"));
			arr.add(n);
		}
		for(int i = arr.size(); i > 0; i--) {
			println(arr.get(i));
		}
	}

}
