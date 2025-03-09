package eight_hundreds;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int i = 0;
        while(i<s1.length()) {
            int i1 = s1.charAt(i) - s2.charAt(i);
            if(i1 > 0) {
                System.out.println(1);
                break;
            } else if(i1 < 0) {
                System.out.println(-1);
                break;
            }
            i++;
        }
        if(i == s1.length()) System.out.println(0);
    }
}
