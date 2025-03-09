package nine_hundreds;

import java.util.Scanner;

public class KefaAndFirstSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int i = 0;
        int j = 0;
        int max = 0;
        while(j<n-1) {
            if(a[j] > a[j+1]) {
                max = Math.max(max, j-i+1);
                i = j+1;
            }
            j++;
        }
        max = Math.max(max, j-i+1);
        System.out.println(max);
    }
}
