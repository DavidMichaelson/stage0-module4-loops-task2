package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {

        int i = 0;

        while (i <= Math.abs(multiplyByAndToInclusive)) {
            System.out.println(i * multiplyByAndToInclusive);
            i++;
        }
    }

    public static void main(String[] args) {
        Multiplication m = new Multiplication();
        m.printMultiplied(10);
        m.printMultiplied(-10);
    }
}