package eight_hundreds;

import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        while(k-- >0) {
            if(n %10 != 0) n--;
            else n /= 10;
        }
        System.out.println(n);
    }
}
