package main.java.com.ohgiraffers;

import java.util.Random;

public class QuizSolve {

    public static void main(String[] args) {

        // A와 B라는 난수를 설정하고 그 합을 반환하는 함수를 만들어 주세요.
        // 답변 양식은  ("A의 값은 " + A + "B의 값은 " + B + "이므로 합은 " + # + "입니다.")

        Random random = new Random();
        int num1 = random.nextInt(10);
        System.out.println(num1);

        int num2 = random.nextInt(10);
        System.out.println(num2);

//        QuizSolve method = new QuizSolve();
        int returnValue = QuizSolve.plus(num1, num2);
        System.out.println("A의 값은: " + num1 + ", B의 값은: " + num2 + ", 이므로 합은 " + returnValue + "입니다.");
    }

    public static int plus(int num1, int num2){
        return (num1 + num2);
    }
}
