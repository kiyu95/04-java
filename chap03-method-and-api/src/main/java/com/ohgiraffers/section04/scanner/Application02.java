package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("값을 입력해주세요 ");
        String greeting = sc.nextLine();
        System.out.println(greeting);

        System.out.println("두번째 값을 입력해주세요");
        String greeting2 = sc.next(); // 띄어쓰기 기준으로 한개의 토큰만 반환
        System.out.println(greeting2);

    }
}
