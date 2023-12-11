import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Problem56 extends ConsoleProgram {
    public void run() {
        int n = readInt("Enter the amount of numbers: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = readInt("Enter number: ");
        }
        sort(arr);
    }

    private void sort(int[] arr) {
        int throwed = 0;
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        while (throwed != arr.length) {
            int maxIndex = findMaxIndex(arr, arr.length - throwed);
            newArray.add(arr[maxIndex]);
            swap(arr, maxIndex, arr.length - throwed - 1);
            throwed++;
        }

        for (int i = newArray.size(); i > 0; i--) {
            print(newArray.get(i - 1) + " ");
        }
    }

    private int findMaxIndex(int[] arr, int endIndex) {
        int maxIndex = 0;
        for (int i = 1; i < endIndex; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
