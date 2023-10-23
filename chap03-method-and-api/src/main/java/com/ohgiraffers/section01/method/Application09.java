package main.java.com.ohgiraffers.section01.method;

public class Application09 {

    public static void main(String[] args) {

        // 계산기 만들기

        int first = 100;
        int second = 50;

        int result = 0;

        Calculator app9 = new Calculator();
        result = app9.minNumberOf(first, second);
        System.out.println(result);

        result = Calculator.maxNumberOf(first, second);
        System.out.println(result);
    }


}
