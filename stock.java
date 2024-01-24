import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class stock extends ConsoleProgram {
    public void run() {
        HashMap<String, HashMap<String, Double>> prices = new HashMap<>();

        // Adding data for company A
        addPrice(prices, "A", "2022", 5.0);
        addPrice(prices, "A", "2021", 4.0);

        // Adding data for company B
        addPrice(prices, "B", "2022", 7.0);
        addPrice(prices, "B", "2021", 7.0);

        // Adding data for company C
        addPrice(prices, "C", "2022", 12.0);

        // Calculate average
        calculateAvarage(prices);
    }

    private static void addPrice(Map<String, HashMap<String, Double>> prices, String company, String year, double value) {
        if (!prices.containsKey(company)) {
            prices.put(company, new HashMap<>());
        }

        prices.get(company).put(year, value);
    }

	private void calculateAvarage(HashMap<String, HashMap<String, Double>> prices) {
		double[] array = new double[2024];
		double[] count = new double[2024];
		for (String company : prices.keySet()) {
		    println(company);
		    for (String year : prices.get(company).keySet()) {
		        Integer curYear = Integer.parseInt(year);
		        println("Processing year: " + curYear);
		        array[curYear] += prices.get(company).get(year);
		        count[curYear]++;
		    }
		}

		for (int i = 0; i < 2024; i++) {
			if (array[i] != 0 && count[i] != 0) {
				array[i] /= count[i];
			}
		}
		double max = array[0];
		int ans = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0 && count[i] != 0) {
				if (array[i] > max) {
					max = array[i];
					ans = i;
				}
			}
		}
		println(ans);
	}
}