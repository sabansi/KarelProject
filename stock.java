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
        addPrice(prices, "A", "2020", 10.0);
        addPrice(prices, "A", "2019", 3.0);
        addPrice(prices, "C", "2019", 15.0);
        addPrice(prices, "B", "2019", 8.0);
        addPrice(prices, "B", "2020", 4.0);
        

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
		    for (String year : prices.get(company).keySet()) {
		        Integer curYear = Integer.parseInt(year);
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



ackage finals;

import acm.util.RandomGenerator;

public class Car {
	
	
	private static final int KILOMETERS_PER_LITER = 7;
	
	private int mileage;
	private boolean isBroken;
	private int gas;
	private RandomGenerator rgen;
	
	public Car(int gas, int mileage) {
		this.gas = gas;
		this.mileage = mileage;
		this.isBroken = false;
		this.rgen = RandomGenerator.getInstance();
	}
	
	public boolean turnOnAndDrive(int kmsToDrive) {
		int d = mileage / 10000;
		d++;
		if (d > 10) {
			d = 10;
		}
		if (rgen.nextInt(10) < d) {
			isBroken = true;
		}
		if (isBroken) {
			return false;
		}
		if (kmsToDrive / KILOMETERS_PER_LITER <= gas) {
			gas -= kmsToDrive / KILOMETERS_PER_LITER;
			mileage += kmsToDrive;
			return true;
		} 
		mileage += gas * KILOMETERS_PER_LITER;
		gas = 0;
		return false;
	}
	
	
}