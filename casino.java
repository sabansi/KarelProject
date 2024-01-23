import java.util.*;
import acm.program.*;
import acm.util.RandomGenerator;

public class casino extends ConsoleProgram{
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		int n = readInt("Enter the amount of money: ");
		simulations(n);
	}

	private void simulations(int n) {
		int middle = 0;
		for(int ind = 0; ind < 1000; ind++) {
			double lostMoney = 0;
			int rolls = 0;
			while(n > 0) {
				int roulette = rgen.nextInt(0, 36);
				int winner = rgen.nextInt(0, 36);
				double betMoney = (lostMoney + 1) / 36.0;
				if(roulette == winner) {
					n += lostMoney + 1;
				}
				else {
					lostMoney += betMoney;
					n -= lostMoney;
				}
				rolls++;
			}
			middle += rolls;
		}
		double ans = middle / 1000;
		println(middle);
	}
}
