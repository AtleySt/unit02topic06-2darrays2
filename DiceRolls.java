public class DiceRolls {

    private static int rollDie() {
        int result = (int) (Math.random() * 6) + 1;
        return result;
    }
    public static void twoD6Probabilities() {
        final int NTRIALS = 10000000;
        double twoRolls = 0;
        double threeRolls = 0;
        double fourRolls = 0;
        double fiveRolls = 0;
        double sixRolls = 0;
        double sevenRolls = 0;
        double eightRolls = 0;
        double nineRolls = 0;
        double tenRolls = 0;
        double elevenRolls = 0;
        double twelveRolls = 0;
        for (int curTrial = 0; curTrial <= NTRIALS; curTrial++) {
            int roll1 = rollDie();
            int roll2 = rollDie();
            int sum = roll1+roll2;
            if (sum == 12) {
                twelveRolls++;
            }
            if (sum == 11) {
                elevenRolls++;
            }
            if (sum == 10) {
                tenRolls++;
            }
            if (sum == 9) {
                nineRolls++;
            }
            if (sum == 8) {
                eightRolls++;
            }
            if (sum == 7) {
                sevenRolls++;
            }
            if (sum == 6) {
                sixRolls++;
            }
            if (sum == 5) {
                fiveRolls++;
            }
            if (sum == 4) {
                fourRolls++;
            }
            if (sum == 3) {
                threeRolls++;
            }
            if (sum == 2) {
                twoRolls++;
            }
        }
        System.out.println("Probabilty of a sum of 2: " + twoRolls / NTRIALS);
        System.out.println("Probabilty of a sum of 3: " + threeRolls / NTRIALS);
        System.out.println("Probabilty of a sum of 4: " + fourRolls / NTRIALS);
        System.out.println("Probabilty of a sum of 5: " + fiveRolls / NTRIALS);
        System.out.println("Probabilty of a sum of 6: " + sixRolls / NTRIALS);
        System.out.println("Probabilty of a sum of 7: " + sevenRolls / NTRIALS);
        System.out.println("Probabilty of a sum of 8: " + eightRolls / NTRIALS);
        System.out.println("Probabilty of a sum of 9: " + nineRolls / NTRIALS);
        System.out.println("Probabilty of a sum of 10: " + tenRolls / NTRIALS);
        System.out.println("Probabilty of a sum of 11: " + elevenRolls / NTRIALS);
        System.out.println("Probabilty of a sum of 12: " + twelveRolls / NTRIALS);
    }

    public static void twoDieRolls() {
        int[] frequencies = new int[13];
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                frequencies[i+j]++;
            }
        }

        double[] probabilities = new double[13];
        for (int k = 1; k <= 12; k++) {
            probabilities[k] = frequencies[k] / 36.0;
        }
        System.out.println();
        System.out.println("Probabilty of a sum of 2: " + probabilities[2]);
        System.out.println("Probabilty of a sum of 3: " + probabilities[3]);
        System.out.println("Probabilty of a sum of 4: " + probabilities[4]);
        System.out.println("Probabilty of a sum of 5: " + probabilities[5]);
        System.out.println("Probabilty of a sum of 6: " + probabilities[6]);
        System.out.println("Probabilty of a sum of 7: " + probabilities[7]);
        System.out.println("Probabilty of a sum of 8: " + probabilities[8]);
        System.out.println("Probabilty of a sum of 9: " + probabilities[9]);
        System.out.println("Probabilty of a sum of 10: " + probabilities[10]);
        System.out.println("Probabilty of a sum of 11: " + probabilities[11]);
        System.out.println("Probabilty of a sum of 12: " + probabilities[12]);
        //System.out.println(probabilities[2] + " " + probabilities[3]+ " " + probabilities[4]+ " " + probabilities[5]+ " " + probabilities[6]+ " " + probabilities[7]+ " " + probabilities[8]+ " " + probabilities[9]+ " " + probabilities[10]+ " " + probabilities[11]+ " " + probabilities[12]);
    }
    public static void main(String[] args) {
        twoD6Probabilities();
        twoDieRolls();
    }
}
