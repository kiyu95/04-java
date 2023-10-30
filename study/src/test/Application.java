package test;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        User user = new User();
        System.out.println("회원 등록을 하시겠습니까? (true / false)");
        Scanner scanner = new Scanner(System.in);
        boolean result = scanner.nextBoolean();
        user.regist(result);
    }
}
