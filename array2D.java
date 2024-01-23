import acm.program.ConsoleProgram;

public class array2D extends ConsoleProgram{
	public void run() {
		int array[] = {1, 2, 5 ,2};
		create(array);
	}

	private void create(int[] array) {
		String ans = "[";
		for(int i = 0; i < array.length; i++) {
			int current = array[i];
			ans += createStringForCurrent(current);
		}
		ans = ans.substring(0, ans.length() - 1);
		ans += "]";
		println(ans);
	}

	private String createStringForCurrent(int current) {
		String ans = "[";
		for(int i = 0; i < current; i++){
			ans += "0,";
		}
		ans += "],";
		return ans;
	}
}



