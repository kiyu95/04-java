package main.java.com.ohgiraffers;

import java.util.Random;
import java.util.Scanner;

public class makeQuiz_UpDown {

    // up down 게임 만들기
    // 랜덤으로 생성된 수를 맞추는 게임입니다.
    // 랜덤으로 생성하는 수의 범위는 1~50 입니다.
    // 입력한 수가 랜덤으로 생성된 수보다 낮다면 "up",
    // 입력한 수가 랜덤으로 생성된 수보다 높다면 "down",
    // 입력한 수가 랜덤으로 생선된 수와 같다면 "정답"이 출력되어야 합니다.

    // 조건문과 반복문을 사용하세요.

    public static void main(String[] args) {
        // 1. 랜덤으로 숫자를 생성(1~50)
        // 2. 숫자를 입력받아 조건에 따라 출력
        //  2-1. 입력한 수가 랜덤으로 생성된 수보다 낮다면 "up"
        //  2-2. 입력한 수가 랜덤으로 생성된 수보다 높다면 "down"
        //  2-3. 입력한 수가 랜덤으로 생선된 수와 같다면 "정답"

        makeQuiz_UpDown game = new makeQuiz_UpDown();
        game.upDown();

    }

    public void upDown(){
        Random random = new Random();
        int randomNumber = random.nextInt(49) + 1;


        Scanner scanner = new Scanner(System.in);

        for (;;){
            System.out.println("1~50 사이의 숫자를 입력 해 주세요.");
            int inputNumber = scanner.nextInt();

            if (inputNumber == randomNumber){
                System.out.println("정답");
                break;
            } else if (inputNumber < randomNumber){
                System.out.println("up");
            } else {
                System.out.println("down");
            }
        }
    }
}
