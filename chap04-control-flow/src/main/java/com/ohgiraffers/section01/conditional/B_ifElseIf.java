package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElseIf {

    public void testSimpleIfElseIfStatement() {

        // 금도끼 은도끼 동화에서 산신령이 어떤 도끼가 나무꾼의 도끼인지 물어보는 시나리오 코드를 만들어보자

        Scanner sc = new Scanner(System.in);
        System.out.println("어느 도끼가 너의 도끼이냐? (1. 금도끼, 2. 은도끼, 3. 쇠도끼) : ");
        String axe = sc.nextLine();

        if (axe == "금도끼") {
            // 금도끼를 선택한 경우
            System.out.println("이런 거짓말 쟁이!! 너에게는 아무런 도끼도 줄 수 없구나!! 이 욕심쟁이야!!");
        } else if (axe == "은도끼") {
            //은도끼를 선택한 경우
            System.out.println("욕심이 과하지는 않지만 그래도 넌 거짓말을 하고 있구나!! 어서 썩 사라지거라!!");

        } else if (axe == "쇠도끼") {
            // 쇠도끼를 선택한 경우
            System.out.println("오호~ 정직하구나~ 여기 있는 금도끼, 은도끼, 쇠도끼를 다 가져가거라!!");
        } else {
            System.out.println("도끼를 선택하거라 이중에 너의 것은 존재한다.");
        }
    }

    public void testNestedIfElseIfStatement() {

        // 필기.
        // ohgiraffers 대학의 김xx교수님은 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있었다.
        // 90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D'를
        // 60점 미만인 경우에는 'F'를 학점 등급으로하는 기준이다.
        // 추가로 각 등급의 중간점수(95, 85, 75..)인 경우 '+'를 붙여서 등급을 세분화 하다보니 신경쓸게 이만 저만이 아니다.
        // 그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.


        Scanner sc2 = new Scanner(System.in);
        System.out.print("학생의 이름을 입력하세요 : ");
        String name = sc2.nextLine();
        System.out.print("학생의 점수를 입력하세요 : ");
        int point = sc2.nextInt();
        String grade = null;

        // 90점 이상 'A'
        if (point >= 90){
            // 95점 이상 'A+'
            if (point >= 95){
                grade = "A+";
            }else {
                grade = "A";
            }
        // 80점 이상 'B'
        } else if (point >= 80) {
            // 85점 이상 'B+'
            if (point >= 85){
                grade = "B+";
            }else {
                grade = "B";
            }
        // 70점 이상 'C'
        } else if (point >= 70) {
            // 75점 이상 'C+'
            if (point >= 75){
                grade = "C+";
            } else {
                grade = "C";
            }
        // 60점 이상 'D'
        } else if (point >= 60) {
            // 65점 이상 'D+'
            if (point >= 65){
                grade = "D+";
            } else {
                grade = "D";
            }
        }
        // 60점 미만 'F'
        else {
            grade = "F";
        }
        System.out.println(name + " 학생의 학점은 " + grade + "입니다.");

        // 아래 표현으로 + 등급을 줄 수도 있음
//        if(point % 10 >= 5 && point >= 60 || point == 100){
//            grade += "+";
//        }
    }
}
