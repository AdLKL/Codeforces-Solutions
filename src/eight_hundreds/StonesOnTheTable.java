package eight_hundreds;

import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char c = s.charAt(0);
        int ans = 0;
        for(int i=1; i<n; i++) {
            if(s.charAt(i) != c) {
                c = s.charAt(i);
            } else {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
