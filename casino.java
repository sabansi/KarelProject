import acm.program.*;
import acm.util.RandomGenerator;

public class casino extends ConsoleProgram {
    private RandomGenerator rgen = RandomGenerator.getInstance();

    public void run() {
        int n = readInt("Enter the amount of money: ");
        simulations(n);
    }

    private void simulations(int n) {
        int totalRolls = 0;

        for (int i = 0; i < 1; i++) {
            int rolls = 0;
            double currMoney = n;
            double lostMoney = 0;

            while (currMoney > 0) {
                int betAmount = determineBetAmount(currMoney, lostMoney);
                int roulette = rgen.nextInt(0, 36);
                int winner = rgen.nextInt(0, 36);

                if (roulette == winner) {
                    double winAmount = Math.min(currMoney, betAmount * 36.0);
                    currMoney += winAmount;
                    lostMoney -= winAmount;
                } else {
                    currMoney -= betAmount;
                    lostMoney += betAmount;
                }

                println(betAmount);
                println(currMoney);
                println(lostMoney);
                rolls++;
            }

            totalRolls += rolls;
        }

        double averageRolls = (double) totalRolls / 1000;
        println("Average number of rolls until losing all money: " + averageRolls);
    }

    private int determineBetAmount(double currMoney, double lostMoney) {
        if (lostMoney <= 0) {
            return 1;
        } else if (currMoney >= (lostMoney + 1) / 36.0) {
            return (int) ((lostMoney + 1) / 36.0);
        } else {
            return (int) currMoney;
        }
    }
}
