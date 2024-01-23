import java.util.Arrays;

import acm.program.ConsoleProgram;

public class array2D extends ConsoleProgram {
	public void run() {
		int[] input1 = { 1, 2 };
		int[] input2 = { 2, 1, 1, 2 };

		generate2DArray(input1);
		generate2DArray(input2);
	}

	private void generate2DArray(int[] input) {
		int[][] result = new int[input.length][];
		for (int i = 0; i < input.length; i++) {
			result[i] = new int[input[i]];
		}
		println(result);
	}
}
