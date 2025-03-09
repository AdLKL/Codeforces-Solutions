package eight_hundreds;

import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int[] count = new int[26];
        for(char c : name.toCharArray()) {
            count[c-'a'] += 1;
        }
        int numDisChar = 0;
        for(int i=0; i<26; i++) {
            if(count[i] > 0) numDisChar++;
        }
        if(numDisChar %2 == 0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}
