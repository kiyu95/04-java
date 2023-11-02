import java.util.Scanner;

public class num10988 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();


        for (int i = 0; i < str.length(); i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(str.length()-(i+1));

            if (c1 == c2){
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
