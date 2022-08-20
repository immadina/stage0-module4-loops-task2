package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 0;
        int result = 1;

        while (counter <= printToInclusive) {
            if (printToInclusive == 0) {
                System.out.println(result);
                counter++;
            } else {
                System.out.println(result);
                counter++;
                result = result * counter;
            }
        }
    }
}
