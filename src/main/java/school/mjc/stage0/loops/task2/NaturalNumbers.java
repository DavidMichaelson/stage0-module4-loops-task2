package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {

        int i = 0;
        while (i <= lastPrinted) {
            System.out.println(i);
            i++;
        }
    }


    public static void main(String[] args) {
        NaturalNumbers numbers = new NaturalNumbers();
        numbers.naturalNumbersPrinter(10);
    }
}
