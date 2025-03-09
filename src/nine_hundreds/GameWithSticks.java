package nine_hundreds;

import java.util.Scanner;

public class GameWithSticks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        if ((Math.min(a, b)) % 2 == 0) {
            System.out.println("Malvika");
        }
        else{
            System.out.println("Akshat");
        }
    }
}
