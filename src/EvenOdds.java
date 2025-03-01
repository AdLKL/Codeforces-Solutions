import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long numOdds = (n + 1) / 2;

        long result;
        if (k <= numOdds) {
            result = 2 * k - 1;
        } else {
            result = 2 * (k - numOdds);
        }

        System.out.println(result);
        sc.close();
    }
}
