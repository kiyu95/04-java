package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        A_for app1 = new A_for();

        Scanner scanner = new Scanner(System.in);
        System.out.println("N단을 출력하는 프로그램입니다. N의 값을 입력해주세요.");
        int num = scanner.nextInt();
        app1.gugudan(num);

//        B_while b = new B_while();
//        b.testSimpleWhileStatement();
    }
}
