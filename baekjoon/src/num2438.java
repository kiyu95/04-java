import java.util.Scanner;

public class num2438 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n*2; i++) {
            for (int j = 0; j < i/2; j++) {
                System.out.print("*");
            }
            for (int j = i/2; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}