import java.util.HashMap;

import acm.program.ConsoleProgram;

public class stock extends ConsoleProgram{
	public void run() {
		HashMap<String, HashMap<String,Double>> prices = new HashMap<>();
		calculateAvarage(prices);
	}

	private void calculateAvarage(HashMap<String, HashMap<String, Double>> prices) {
		Double[] array = null;
		int[] count = null;
		for(String company : prices.keySet()) {
			for(String year : prices.get(company).keySet()) {
				Integer curYear = Integer.parseInt(year);
				array[curYear] += prices.get(company).get(year);
				count[curYear]++;
			}
		}
		for(int i = 0; i < 2024; i++) {
			if(array[i] != 0 && count[i] != 0) {
			array[i] /= count[i];
		}
		}
		double max = array[0];
		double ans -
		for(int i = 0; i < array.length; i++) {
			if(array[i] != 0 && count[i] != 0) {
			if(array[i] > max) {
				max = array[i];
				ans = i;
			}
		}
	}
}
