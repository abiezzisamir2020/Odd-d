import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        int positiveCount = 0;
        int negativeCount = 0;
        double expectation = 0.5;
        for (int i = 0; i < 100000; i++) {
            int num = rand.nextInt(6) + 1;
            if (num % 2 == 0) {
                positiveCount++;
            }
            else {
                negativeCount++;
            }
        }
        double proportionPos = positiveCount / 100000.0;
        System.out.printf("\nScenario 1\nExpected Outcome: %f\nCount of True: %d\nCount of False: %d\nCondition Reached: %f\n", expectation, positiveCount, negativeCount, proportionPos);


        positiveCount = 0;
        negativeCount = 0;
        expectation = (5 / 10.0) + (5 / 10.0) - (3 / 10.0);
        for (int i = 0; i < 100000; i++) {
            int num = rand.nextInt(10) + 1;
            if ((num > 5) || (num % 2 == 0)) {
                positiveCount++;
            }
            else {
                negativeCount++;
            }
        }
        proportionPos = positiveCount / 100000.0;
        System.out.printf("\nScenario 2\nExpected Outcome: %f\nCount of True: %d\nCount of False: %d\nCondition Reached: %f\n", expectation, positiveCount, negativeCount, proportionPos);


        positiveCount = 0;
        negativeCount = 0;
        expectation = 0.5 * 0.5;
        for (int i = 0; i < 100000; i++) {
            int roll1 = rand.nextInt(6) + 1;
            int roll2 = rand.nextInt(6) + 1;
            if ((roll1 % 2 == 0) && (roll2 % 2 == 1)) {
                positiveCount++;
            }
            else {
                negativeCount++;
            }
        }
        proportionPos = positiveCount / 100000.0;
        System.out.printf("\nScenario 3\nExpected Outcome: %f\nCount of True: %d\nCount of False: %d\nCondition Reached: %f\n", expectation, positiveCount, negativeCount, proportionPos);


        positiveCount = 0;
        negativeCount = 0;
        expectation = (1 / 3.0) * (1 / 3.0) * (1 / 3.0);
        for (int i = 0; i < 100000; i++) {
            int roll1 = rand.nextInt(6) + 1;
            int roll2 = rand.nextInt(6) + 1;
            int roll3 = rand.nextInt(6) + 1;
            if ((roll1 > 3) && (roll2 > 2 && roll2 < 5) && (roll3 > 4)) {
                positiveCount++;
            }
            else {
                negativeCount++;
            }
        }
        proportionPos = positiveCount / 100000.0;
        System.out.printf("\nScenario 4\nExpected Outcome: %f\nCount of True: %d\nCount of False: %d\nCondition Reached: %f\n", expectation, positiveCount, negativeCount, proportionPos);


        positiveCount = 0;
        negativeCount = 0;
        expectation = (1.0) * (5 / 6.0) * (2 / 3.0) * (1 / 2.0);
        for (int i = 0; i < 100000; i++) {
            int roll1 = rand.nextInt(6) + 1;
            int roll2 = rand.nextInt(6) + 1;
            int roll3 = rand.nextInt(6) + 1;
            int roll4 = rand.nextInt(6) + 1;

            if ((roll1 != roll2 && roll1 != roll3 && roll1 != roll4) && (roll2 != roll3 && roll2 != roll4) && (roll3 != roll4)) {
                positiveCount++;
            }
            else {
                negativeCount++;
            }
        }
        proportionPos = positiveCount / 100000.0;
        System.out.printf("\nScenario 5\nExpected Outcome: %f\nCount of True: %d\nCount of False: %d\nCondition Reached: %f\n", expectation, positiveCount, negativeCount, proportionPos);
    }
}