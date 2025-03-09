package nine_hundreds;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String situation = sc.next();
        boolean dangerous = false;
        for(int i=0; i< situation.length(); i++) {
            int j=i;
            int d = 1;
            while(j+1<situation.length() && situation.charAt(j) == situation.charAt(j+1)) {
                d++;
                j++;
                if(d >= 7) {
                    dangerous = true;
                    break;
                }
            }
            if(dangerous) break;
            i = j;
        }
        System.out.println(dangerous ? "YES" : "NO");
    }
}
