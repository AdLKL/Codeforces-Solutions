package eight_hundreds;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] scores = new int[n];
        for(int i=0; i<n; i++) {
            scores[i] = sc.nextInt();
        }
        int thresh = scores[k-1];
        int result = 0;
        for(int num : scores) {
            if(num >= thresh && num > 0) result++;
        }
        System.out.println(result);
    }
}
