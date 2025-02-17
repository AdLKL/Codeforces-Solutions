import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i<n; i++) {
            String s = sc.next();
            if(s.length() > 10) {
                int num = s.length()-2;
                StringBuilder sb = new StringBuilder();
                sb.append(s.charAt(0));
                sb.append(num);
                sb.append(s.charAt(s.length()-1));
                System.out.println(sb);
            } else {
                System.out.println(s);
            }

        }
    }
}
