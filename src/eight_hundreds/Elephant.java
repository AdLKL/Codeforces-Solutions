package eight_hundreds;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 0;
        ans += x/5;
        if(x %5 != 0) ans++;
        System.out.println(ans);
    }
}
