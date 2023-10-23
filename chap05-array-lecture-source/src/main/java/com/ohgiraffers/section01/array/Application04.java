package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application04 {

    public static void main(String[] args) {

        // 5명의 자바 점수를 정수로 입력 받아서 합계와 평균을 실수로 구하는 프로그램을 만들어 주세요

        // 1. 5명의 자바 점수를 정수로 입력받음
        // 2. 입력받은 점수의 합
        // 3. 입력은 점수의 평균

        // 5명의 자바 점수를 정수로 입력받음
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];

        // 점수의 합
        int sum = 0;

        // 점수의 평균
        double avg = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "번째 학생의 자바 점수를 입력해주세요 : ");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        avg = sum/arr.length;
        System.out.println("5명의 자바 점수의 합 : " + sum);
        System.out.println("5명의 자바 점수의 평균 : " + avg);
    }
}
