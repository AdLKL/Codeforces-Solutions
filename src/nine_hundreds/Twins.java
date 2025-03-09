package nine_hundreds;

import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int[] a = new int[n];
        int total = 0;
        for(int i=0; i<n; i++) {
            int ai = sc.nextInt();
            a[i] = ai;
            total += ai;
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }

        int sum = 0;
        for(int ai : a) {
            sum += ai;
            total -= ai;
            ans ++;
            if(sum > total) break;
        }
        System.out.println(ans);
    }
}
