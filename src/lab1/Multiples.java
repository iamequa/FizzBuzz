package lab1;

public class Multiples {
    public static void main(String[] args) {
        int total = multiples();
        System.out.println(total);
    }

    private static int multiples() {
        int total = 0;
        for (int i = 1; i < 1000; i++){
            if (i % 3 == 0 | i % 5 == 0) total++;
        }
        return total;
    }
}
