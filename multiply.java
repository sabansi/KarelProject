import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class multiply extends ConsoleProgram {
	public void run() {
		ArrayList<Integer> num1 = new ArrayList<>();
		ArrayList<Integer> num2 = new ArrayList<>();

		num1.add(9);
		num1.add(9);
		num1.add(9);

		num2.add(2);
		num2.add(3);

		multiply(num1, num2);

	}

	private void multiply(ArrayList<Integer> num1, ArrayList<Integer> num2) {
		int m = num1.size();
		int n = num2.size();
		ArrayList<Integer> result = new ArrayList<>(initializeList(m + n, 0));

		for (int i = m - 1; i >= 0; i--) {
			int carry = 0;

			for (int j = n - 1; j >= 0; j--) {
				int product = num1.get(i) * num2.get(j)  + carry;

				result.set(i + j + 1, product % 10);
				carry = product / 10;
			}
			result.set(i, result.get(i) + carry);
		}
		println(arrayListToString(result));
	}

	private static ArrayList<Integer> initializeList(int size, int value) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			list.add(value);
		}
		return list;
	}

	private static String arrayListToString(ArrayList<Integer> arrayList) {
		String result = "{";
		for (int i = 0; i < arrayList.size(); i++) {
			result += Integer.toString(arrayList.get(i));
			if (i < arrayList.size() - 1) {
				result += ", ";
			}
		}
		result += "}";
		return result;
	}
}
