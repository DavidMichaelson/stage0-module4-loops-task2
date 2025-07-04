package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        int i = 0;
        int factorial = 1;

        while (i <= printToInclusive) {
            if (i == 0) {
                System.out.println(1); // 0! is 1
            } else {
                factorial *= i;
                System.out.println(factorial);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        FactorialNumbers fn = new FactorialNumbers();
        fn.printFactorialRow(5); // You can test with any number here
    }
}