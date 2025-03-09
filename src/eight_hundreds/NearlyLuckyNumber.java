package eight_hundreds;

import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int numLucky = 0;
        while(n != 0) {
            if(n %10 == 4 || n%10 == 7) numLucky++;
            n = n/10;
        }
        if(numLucky == 4 || numLucky == 7) System.out.println("YES");
        else System.out.println("NO");
    }
}
