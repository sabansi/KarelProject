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

        for (int i = 0; i < 1000; i++) {
            int rolls = 0;
            double currMoney = n;
            
            while (currMoney > 0) {
                int betAmount = determineBetAmount(currMoney);
                int roulette = rgen.nextInt(0, 36);
                int winner = rgen.nextInt(0, 36);

                if (roulette == winner) {
                    currMoney += betAmount;
                } else {
                    currMoney -= betAmount;
                }

                rolls++;
            }

            totalRolls += rolls;
        }

        double averageRolls = (double) totalRolls / 1000;
        println("Average number of rolls until losing all money: " + averageRolls);
    }

    private int determineBetAmount(double currMoney) {
        if (currMoney >= 1) {
            return 1;
        } else {
            return (int) currMoney;
        }
    }
}
