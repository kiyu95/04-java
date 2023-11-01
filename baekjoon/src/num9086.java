import java.util.Scanner;

public class num9086 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        for (int i = 0; i < test; i++) {
            String str = scanner.next();
            System.out.print(str.charAt(0));
            System.out.println(str.charAt(str.length() - 1));
        }
    }
}
