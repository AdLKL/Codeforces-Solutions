package nine_hundreds;

import java.util.Scanner;

public class OddDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            long n = sc.nextLong();
            if(n %2 == 1) System.out.println("YES");
            else if((n & (n-1)) == 0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
