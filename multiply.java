import java.util.ArrayList;
import java.util.Collections;

public class multiply {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();

        // Example numbers
        num1.add(9);
        num1.add(9);
        num1.add(9);

        num2.add(2);
        num2.add(3);

        ArrayList<Integer> result = multiply(num1, num2);

        // Print the result
        System.out.print("Result: ");
        for (int digit : result) {
            System.out.print(digit);
        }
    }

    private static ArrayList<Integer> multiply(ArrayList<Integer> num1, ArrayList<Integer> num2) {
        int m = num1.size();
        int n = num2.size();
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(m + n, 0));

        for (int i = m - 1; i >= 0; i--) {
            int carry = 0;

            for (int j = n - 1; j >= 0; j--) {
                int product = num1.get(i) * num2.get(j) + result.get(i + j + 1) + carry;

                result.set(i + j + 1, product % 10);
                carry = product / 10;
            }

            result.set(i, result.get(i) + carry);
        }

        // Remove leading zeros
        while (result.size() > 1 && result.get(0) == 0) {
            result.remove(0);
        }

        return result;
    }
}
