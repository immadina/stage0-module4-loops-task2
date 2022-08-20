package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        int divider = 2;
        while (counter <= printToInclusive) {
            if (counter == 2) {
                System.out.println(counter);
            } else if (counter % 2 == 1) {
                while (divider < counter) {
                    if (counter % divider == 0) {
                        divider++;
                    }
                }
                if (divider == 2) {
                    System.out.println(counter);
                }
            }
        }
    }
}
