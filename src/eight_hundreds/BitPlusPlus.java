package eight_hundreds;

import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        for(int i=0; i<n; i++) {
            String s = sc.next();
            for(char c : s.toCharArray()) {
                if(c == 'X') continue;
                if(c == '+') {
                    x++;
                    break;
                }
                else {
                    x--;
                    break;
                }
            }
        }
        System.out.println(x);
    }
}
