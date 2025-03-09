package nine_hundreds;

import java.util.Scanner;

public class HQ9plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        boolean isPrinted = false;
        for(char c : p.toCharArray()) {
            if(c == 'H' || c == 'Q' || c == '9') {
                System.out.println("YES");
                isPrinted = true;
                break;
            }
        }
        if(!isPrinted){
            System.out.println("NO");
        }

    }
}
