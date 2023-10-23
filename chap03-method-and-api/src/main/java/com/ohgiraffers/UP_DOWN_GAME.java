package main.java.com.ohgiraffers;

import java.util.Random;
import java.util.Scanner;

public class UP_DOWN_GAME {

    public static void main(String[] args) {

        // Up Down 게임 만들기 (1~50)
        Random random = new Random();
        int randomNumber = random.nextInt(50) + 1;
//        System.out.println(randomNumber);

        System.out.println("1~50사이의 숫자를 입력하세요 : ");

        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();

        UP_DOWN_GAME app1 = new UP_DOWN_GAME();
        app1.test1(inputNumber, randomNumber);

        System.out.println("숫자를 입력하세요 : ");
        int inputNumber2 = sc.nextInt();
        app1.test2(inputNumber2, randomNumber);

        System.out.println("숫자를 입력하세요 : ");
        int inputNumber3 = sc.nextInt();
        app1.test3(inputNumber3, randomNumber);

        System.out.println("숫자를 입력하세요 : ");
        int inputNumber4 = sc.nextInt();
        app1.test4(inputNumber4, randomNumber);

        System.out.println("숫자를 입력하세요 : ");
        int inputNumber5 = sc.nextInt();
        app1.test5(inputNumber5, randomNumber);

        System.out.println("숫자를 입력하세요 : ");
        int inputNumber6 = sc.nextInt();
        app1.test5(inputNumber6, randomNumber);

        System.out.println("숫자를 입력하세요 : ");
        int inputNumber7 = sc.nextInt();
        app1.test5(inputNumber7, randomNumber);

        System.out.println("숫자를 입력하세요 : ");
        int inputNumber8 = sc.nextInt();
        app1.test5(inputNumber8, randomNumber);

        System.out.println("숫자를 입력하세요 : ");
        int inputNumber9 = sc.nextInt();
        app1.test5(inputNumber9, randomNumber);

        System.out.println("숫자를 입력하세요 : ");
        int inputNumber10 = sc.nextInt();
        app1.test5(inputNumber10, randomNumber);
    }

    public void test1(int inputNumber, int randomNumber) {
        if (inputNumber == randomNumber) {
            System.out.println("정답 입니다.");
            System.exit(0);
        } else if (inputNumber > randomNumber) {
            System.out.println("Down 입니다.");
        } else {
            System.out.println("Up 입니다.");
        }
    }

    public void test2(int inputNumber2, int randomNumber) {
        if (inputNumber2 == randomNumber) {
            System.out.println("정답 입니다.");
            System.exit(0);
        } else if (inputNumber2 > randomNumber) {
            System.out.println("Down 입니다.");
        } else {
            System.out.println("Up 입니다.");
        }
    }

    public void test3(int inputNumber3, int randomNumber) {
        if (inputNumber3 == randomNumber) {
            System.out.println("정답 입니다.");
            System.exit(0);
        } else if (inputNumber3 > randomNumber) {
            System.out.println("Down 입니다.");
        } else {
            System.out.println("Up 입니다.");
        }
    }

    public void test4(int inputNumber4, int randomNumber) {
        if (inputNumber4 == randomNumber) {
            System.out.println("정답 입니다.");
            System.exit(0);
        } else if (inputNumber4 > randomNumber) {
            System.out.println("Down 입니다.");
        } else {
            System.out.println("Up 입니다.");
        }
    }

    public void test5(int inputNumber5, int randomNumber) {
        if (inputNumber5 == randomNumber) {
            System.out.println("정답 입니다.");
            System.exit(0);
        } else if (inputNumber5 > randomNumber) {
            System.out.println("Down 입니다.");
        } else {
            System.out.println("Up 입니다.");
        }
    }
    public void test6(int inputNumber6, int randomNumber) {
        if (inputNumber6 == randomNumber) {
            System.out.println("정답 입니다.");
            System.exit(0);
        } else if (inputNumber6 > randomNumber) {
            System.out.println("Down 입니다.");
        } else {
            System.out.println("Up 입니다.");
        }
    }
    public void test7(int inputNumber7, int randomNumber) {
        if (inputNumber7 == randomNumber) {
            System.out.println("정답 입니다.");
            System.exit(0);
        } else if (inputNumber7 > randomNumber) {
            System.out.println("Down 입니다.");
        } else {
            System.out.println("Up 입니다.");
        }
    }
    public void test8(int inputNumber8, int randomNumber) {
        if (inputNumber8 == randomNumber) {
            System.out.println("정답 입니다.");
            System.exit(0);
        } else if (inputNumber8 > randomNumber) {
            System.out.println("Down 입니다.");
        } else {
            System.out.println("Up 입니다.");
        }
    }
    public void test9(int inputNumber9, int randomNumber) {
        if (inputNumber9 == randomNumber) {
            System.out.println("정답 입니다.");
            System.exit(0);
        } else if (inputNumber9 > randomNumber) {
            System.out.println("Down 입니다.");
        } else {
            System.out.println("Up 입니다.");
        }
    }
    public void test10(int inputNumber10, int randomNumber) {
        if (inputNumber10 == randomNumber) {
            System.out.println("정답 입니다.");
            System.exit(0);
        } else if (inputNumber10 > randomNumber) {
            System.out.println("Down 입니다.");
        } else {
            System.out.println("Up 입니다.");
        }
    }
}