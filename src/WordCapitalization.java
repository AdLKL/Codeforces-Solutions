import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        word = String.valueOf(word.charAt(0)).toUpperCase().concat(word.substring(1));
        System.out.println(word);
    }
}
