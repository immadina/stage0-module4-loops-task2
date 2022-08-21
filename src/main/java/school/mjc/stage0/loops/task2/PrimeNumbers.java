package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        int counter2;
        boolean isPrime;
        while (counter <= printToInclusive) {
            counter2 = 1;
            isPrime = true;
            while (counter2 <= counter) {
                if (counter2 != 1 && counter2 != counter && counter % counter2 == 0) {
                    isPrime = false;
                }
                counter2++;
            }
            if (isPrime) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
