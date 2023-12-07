import acm.program.ConsoleProgram;

public class Problem56 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter the amount of numbers: ");
		int[] arr = new int[n];
		for(int i = 0; i < n; i ++) {
			arr[i] = readInt("Enter number: ");
		}
		sort(arr);
	}
	private void sort(int[] arr) {
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		println(min);
	}
}