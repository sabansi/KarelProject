import java.util.HashMap;

import acm.program.ConsoleProgram;

public class stock extends ConsoleProgram {
	public void run() {
		HashMap<String, HashMap<String, Double>> prices = new HashMap<>();
		HashMap<String, Double> innerMap1 = new HashMap<>();
        innerMap1.put("2022", 5.0);
        prices.put("A", innerMap1);
        
        HashMap<String, Double> innerMap2 = new HashMap<>();
        innerMap2.put("2021", 4.0);
        prices.put("A", innerMap2);
        
        HashMap<String, Double> innerMap3 = new HashMap<>();
        innerMap3.put("2022", 7.0);
        prices.put("B", innerMap3);
        
        HashMap<String, Double> innerMap4 = new HashMap<>();
        innerMap4.put("2021", 7.0);
        prices.put("B", innerMap4);
        
        HashMap<String, Double> innerMap5 = new HashMap<>();
        innerMap4.put("2022", 12.0);
        prices.put("C", innerMap4);
        
		calculateAvarage(prices);
	}

	private void calculateAvarage(HashMap<String, HashMap<String, Double>> prices) {
		double[] array = new double[2024];
		double[] count = new double[2024];
		for (String company : prices.keySet()) {
			println(company);
			for (String year : prices.get(company).keySet()) {
				Integer curYear = Integer.parseInt(year);
				println(prices.get(company).keySet());
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
	//	println(count[2021]);
	}
}