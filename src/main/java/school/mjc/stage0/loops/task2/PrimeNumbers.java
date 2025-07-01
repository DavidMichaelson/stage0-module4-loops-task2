package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {

        int number = 2;

        while (number <= printToInclusive) {
            boolean prime = true;

            int divisor = 2;
            while (divisor <= number / 2) {
                if (number % divisor == 0) {
                    prime = false;
                    break;
                }

                divisor++;
            }

            if (prime == true) {
                System.out.println(number);
            }

            number++;
        }
    }

    public static void main(String[] args) {

        PrimeNumbers numbers = new PrimeNumbers();
        numbers.printPrimeNumbers(10);
    }
}
