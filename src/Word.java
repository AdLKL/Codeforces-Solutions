import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int numLower = 0;
        int numUpper = 0;
        for(char c : s.toCharArray()) {
            if(c-'a' >= 0 && c-'a' <= 25) {
                numLower++;
            } else numUpper++;
        }
        if(numLower>=numUpper) s = s.toLowerCase();
        else s = s.toUpperCase();
        System.out.println(s);
    }
}
