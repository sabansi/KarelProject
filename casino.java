import java.util.*;
import acm.program.*;
import acm.util.RandomGenerator;

public class casino extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		int n = readInt("Enter the amount of money: ");
		simulations(n);
	}

	private void simulations(int n) {
		int middle = 0;
		double currMoney = n;
		for (int ind = 0; ind < 1000; ind++) {
			double lostMoney = 0;
			int rolls = 0;
			double betMoney = 0;
			while (currMoney > 0) {
				int roulette = rgen.nextInt(0, 36);
				int winner = rgen.nextInt(0, 36);
				if(currMoney >= n) {
					betMoney = 1;
				}
				else if (currMoney >= (lostMoney + 1) / 36.0) {
					betMoney = (lostMoney + 1) / 36.0;
				} else {
					betMoney = currMoney;
				}
				if (roulette == winner) {
					currMoney -= betMoney;
					currMoney += lostMoney + 1;
				} else {
					lostMoney += betMoney;
					currMoney -= betMoney;
				}
				rolls++;
			}
			middle += rolls;
		}
		double ans = middle / 1000;
		println(ans);
	}
}
