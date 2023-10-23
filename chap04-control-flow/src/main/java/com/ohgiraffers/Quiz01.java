package main.java.com.ohgiraffers;

import java.util.Scanner;

public class Quiz01 {

    // do while을 이용하여 사용자에게 1단 부터 N단 까지 출력하는 구구단 프로그램을 보여줍니다.
    // 프로그램은 다음과 같습니다.

    // EX) 사용자 입력 값이 6이라면 1~6단 까지의 단을 출력해주세요
    // 1*1 = 1; ~ 1*9 = 9;
    // 6*1 = 6; ~ 6*9 = 54;

    // ! 중첩 반복문을 사용해야 합니다.

    public void quiz01() {

        int i = 0;
        int num;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1단 부터 N단 까지 출력하는 구구단 프로그램 입니다.");
            System.out.println("숫자를 입력 해 주세요");
            num = scanner.nextInt();
            for (i = 1; i <= 9; i++) {
                System.out.println(num + " * " + i + " = " + (num * i));

            }
        } while (false);
    }
}

// 입력한 값을 1부터 9까지 곱해준다.
// 입력한 값