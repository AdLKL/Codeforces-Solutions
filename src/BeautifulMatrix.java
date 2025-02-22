import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int res = 0;
        for1: for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(matrix[i][j] == 1) {
                    res += Math.abs(i+1-3);
                    res += Math.abs(j+1-3);
                    break for1;
                }
            }
        }
        System.out.println(res);
    }
}
