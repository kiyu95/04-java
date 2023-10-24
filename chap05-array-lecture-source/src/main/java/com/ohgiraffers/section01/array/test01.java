package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class test01 {

    public static void main(String[] args) {

        // 5명의 자바 점수를 정수로 입력 받아서 합계와 평균을 실수로 구하는 프로그램을 만들어 주세요

        Scanner scanner = new Scanner(System.in);
        int[] arrScore = new int[5];

        int sum = 0;

        for (int i = 0; i < arrScore.length; i++) {
            System.out.println(i + "번째 학생의 점수를 입력하세요 : ");
            arrScore[i] = scanner.nextInt();
            sum += arrScore[i];
        }
        System.out.println("점수의 합 : " + sum);
        System.out.println("점수의 평균 : " + (double)(sum/5));
    }
}
