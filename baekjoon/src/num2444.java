import java.util.Scanner;

public class num2444 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int j = 1; j <= n; j++) {
            System.out.println(j);
        }
        for (int j = n+1; j <= 2*n-1; j++) {
            System.out.println(j);
        }
    }
}