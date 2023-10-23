package main.java.com.ohgiraffers.section01.array;

import java.util.Random;

public class Application05 {

    public static void main(String[] args) {

        // 랜덤한 카드를 한 장 뽑아서 출력해보자

        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] chardNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        // Math.random() 사용
//        int shapesNum = (int) (Math.random() * shapes.length);
//        int num = (int) (Math.random() * chardNumber.length);

        // 랜덤으로 문양과 숫자 뽑기
        Random random = new Random();
        int randomShapes = random.nextInt(3);
        int randomCardNumber = random.nextInt(12);


        // 랜덤으로 뽑은 카드 출력
        System.out.println(shapes[randomShapes] + " " + chardNumber[randomCardNumber]);
    }
}
