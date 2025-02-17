import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0 ;
        for(int i=0; i<n; i++) {
            byte b1 = sc.nextByte();
            byte b2 = sc.nextByte();
            byte b3 = sc.nextByte();
            int num = b1 + b2 + b3;
            if(num >= 2) sum++;
        }
        System.out.println(sum);
    }
}
