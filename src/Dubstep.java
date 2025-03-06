import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dubstep = sc.next();
        String originalSong = dubstep.replaceAll("(WUB)+", " ").trim();

        System.out.println(originalSong);
    }
}
