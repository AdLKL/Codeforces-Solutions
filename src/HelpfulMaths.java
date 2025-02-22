import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int numOnes = 0;
        int numTwos = 0;
        int numThrees = 0;
        for(char c : s.toCharArray()) {
            if(c == '1') numOnes++;
            else if(c == '2') numTwos++;
            else if(c == '3') numThrees++;
        }
        StringBuilder sb = new StringBuilder();
        while(numOnes != 0) {
            if(numTwos == 0 && numThrees == 0) {
                if(numOnes == 1) sb.append('1');
                else sb.append("1+");
            }
            else sb.append("1+");
            numOnes--;
        }
        while(numTwos != 0) {
            if(numThrees == 0) {
                if(numTwos == 1) sb.append('2');
                else sb.append("2+");
            }
            else sb.append("2+");
            numTwos--;
        }
        while(numThrees != 0) {
            if(numThrees == 1) break;
            sb.append("3+");
            numThrees--;
        }
        if(numThrees == 1) sb.append('3');
        System.out.println(sb);
    }
}
