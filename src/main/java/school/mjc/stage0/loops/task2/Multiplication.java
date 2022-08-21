package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int multiplier = 0;
        if (multiplyByAndToInclusive >= 0) {
            while (multiplier <= multiplyByAndToInclusive) {
                System.out.println(multiplier * multiplyByAndToInclusive);
                multiplier++;
            }
        } else {
            while (multiplier >= multiplyByAndToInclusive) {
                System.out.println(-1 * multiplier * multiplyByAndToInclusive);
                multiplier--;
            }
        }

    }
}