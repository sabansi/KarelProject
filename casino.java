import acm.program.*;
import acm.util.RandomGenerator;

public class casino extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		int n = readInt("Enter the amount of money: ");
		simulations(n);
	}

	private void simulations(int n) {
		double totalRolls = 0;

		for (int i = 0; i < 2; i++) {
			int rolls = 0;
			double currMoney = n;
			double lostMoney = 0;

			while (currMoney > 0) {
				double betAmount = determineBetAmount(currMoney, lostMoney);
				int roulette = rgen.nextInt(0, 36);
				int winner = rgen.nextInt(0, 36);
			//	println(roulette);
			//	println(winner);
				if (roulette == winner) {
					double winAmount = betAmount * 36.0;
					currMoney += winAmount;
					lostMoney -= winAmount;
				} else {
					currMoney -= betAmount;
					lostMoney += betAmount;
				}
				println("The numbers are: " + roulette + " " + winner);
				println("lostmoney - " + lostMoney);
				println("currmoney - " + currMoney);

				rolls++;
			}
			println("current rolls are: " + rolls);
			totalRolls += rolls;
		}
		double averageRolls = totalRolls / 2.0;
		println("Average number of rolls until losing all money: " + averageRolls);
	}

	private double determineBetAmount(double currMoney, double lostMoney) {
		if (lostMoney <= 0) {
			return 1;
		} else if (currMoney >= (lostMoney + 1) / 36.0) {
			return ((lostMoney + 1) / 36.0);
		} else {
			return currMoney;
		}
	}
}
