package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {
    public void testSimpleForStatement() {

        // for 표현식
        // for(초기값; 조건식; 증감식){
        //
        // }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void testForExample(){

        // 반의 학생이 10명인 학생의 이름을 입력받기

        Scanner scanner = new Scanner(System.in);

//        System.out.println("1번째 학생의 이름을 입력해주세요 : ");
//        String name1 = scanner.nextLine();

        for (int i = 1; i <= 10; i++){
//            for (int i = 1; i <= 10; i*=2){

            System.out.println(i + "번째 학생의 이름을 입력해주세요 : " );
            String student = scanner.nextLine();
            System.out.println(i + "번째 학생의 이름은 " + student + "입니다.");
            System.out.println("\n");
        }
    }

    public void testForExample2(){

        // 1~10까지 수의 합을 구한다

        int sum = 0;

        for (int i = 1; i <= 10; i++){
            sum += i;
        }
        System.out.println(sum);

        // 반복문에서 조건문 사용하기

        for (int i = 0; i <= 10; i++){
            if (i == 0){
                System.out.println("0 입니다.");
            } else if (i % 2 == 0){
                System.out.println(i + "짝수 입니다.");
            } else {
                System.out.println(i + "홀수 입니다.");
            }
        }
    }
    public void testForExample4(){

        // 숫자 두 개를 입력받아 작은 수에서 큰 수까지의 합계를 구하세요
        // 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결을 합니다.

        // 프로그램
        // 목표 : 두 수를 입력받아서 작은 수 부터 큰 수 까지의 합계를 구한다.
        // 주의 : 두 수의 값은 같을 수 없다.

        // 1. 두 수를 입력받아야 한다.
        // 2. 입력 받은 수가 같은지 비교한다.
        //  false. 두 수가 같지 않다면 다음으로 넘긴다.
        //  true. 두 수를 다시 입력받는다.
        // 3. 작은 수와 큰 수를 구한다.
        // 4. 작은 수 부터 큰 수까지의 합계를 구한다.

        System.out.println("두 수를 입력받아 작은 수 부터 큰 수까지의 합계를 구하는 프로그램 입니다.");
        Scanner scanner = new Scanner(System.in);

        for (;;){ // (;;) -> 무한루프 시킴
            // 1. 두 수를 입력받아야 한다.
            System.out.println("첫번째 수를 입력 해주세요 :");
            int firstNum = scanner.nextInt();
            System.out.println("두 번째 수를 입력 해주세요 :");
            int secondNum = scanner.nextInt();

            // 2. 입력 받은 수가 같은지 비교한다.
            if(firstNum == secondNum){ // 같은 경우 다시 입력받는다.
                System.out.println("두 수의 값이 같기 때문에 입력을 다시 받습니다.");
//                System.out.println("첫번째 수를 다시 입력 해주세요 :");
//                firstNum = scanner.nextInt();
//                secondNum = scanner.nextInt();

            }else { // 같지 않은 경우 다음 진행
                // 3. 같지 않다면 작은 수와 큰 수를 구한다.
                int max = (firstNum > secondNum) ? firstNum : secondNum;
                int min = (firstNum < secondNum) ? firstNum : secondNum;
                int sum = 0;
                // 4. 작은 수 부터 큰 수까지의 합계를 구한다.
                for(int i=min; i <= max; i++){
                    sum += i;
                }
                System.out.println("입력 한 두 수에서 작은 값은 " + min + " 큰 값은 " + max + " 이고 합계는 " + sum + " 입니다.");
                break;
            }
        }
    }

    /**
     * 구구단을 위한 함수 입니다.
     * n ~ 9단까지의 구구단
     * @param first : 해당 단을 출력함
     * @return void
     * */
    public void gugudan(int first){
        // 1. 수(몇 단)를 입력받는다.
        // 2. 입력받은 수가 1~9사이의 값인지 확인한다.
        //  false. 수를 다시 입력받는다.
        //  true. 입력받은 수를 1에서부터 9까지 곱해준다.

//        System.out.println("수를 입력받아 구구단을 출력하는 프로그램 입니다.");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("수를 입력 해 주세요 :");
//        int num = scanner.nextInt();

        int i = 0;

        for (;;){
            if (first >= 1 && first <= 9){
                for (i = 1; i <= 9; i++){
                    System.out.println(first + " * " + i + " = " + (first * i) );
                }
            }else {
                System.out.println("1 ~ 9 의 숫자를 입력 해 주세요");
            } break;
        }
    }
}
