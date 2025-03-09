package nine_hundreds;

import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] f = new int[m];
        for(int i=0; i<m; i++) {
            f[i] = sc.nextInt();
        }
        Arrays.sort(f);
        if(n == m) {
            System.out.println(f[m-1] - f[0]);
        } else {
            int min = Integer.MAX_VALUE;
            for(int i=0; i<=m-n; i++) {
                min = Math.min((f[n-1+i] - f[i]), min);
            }
            System.out.println(min);
        }

    }
}
