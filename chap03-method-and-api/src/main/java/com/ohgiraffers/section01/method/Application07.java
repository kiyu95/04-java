package main.java.com.ohgiraffers.section01.method;

public class Application07 {

    public static void main(String[] args) {

        // Quiz
        // 두 수를 매개변수로 받아 더한 값을 반환하는 함수
        // 두 수를 매개변수로 받아 뺀 값을 반환하는 함수
        // 두 수를 매개변수로 받아 곱한 값을 반환하는 함수
        // 두 수를 매개변수로 받아 나눈 값을 반환하는 함수

        // 메소드에서 반환한 값을 받아서 화면에 출력해주세요

        Application07 app7 = new Application07();
//        app7.methodA(10, 20);
        String returnValue = app7.methodA(10, 20);
        System.out.println(returnValue);

        System.out.println("====================");

        int returnValueB = app7.methodB(10, 20);
        System.out.println("두 수를 더한 값은 : " + returnValueB);

        int returnValueC = app7.methodC(10, 20);
        System.out.println("두 수를 뺀 값은 : " + returnValueC);

        int returnValueD = app7.methodD(10, 20);
        System.out.println("두 수를 뺀 값은 : " + returnValueD);

        double returnValueE = app7.methodE(10, 20);
        System.out.println("두 수를 뺀 값은 : " + returnValueE);
    }

    public String methodA(double a, double b){
        return  "두 수를 더한 값은 : " + (int)(a +b) + "\n" +
                "두 수를 뺀 값은 : " + (int)(a - b) + "\n" +
                "두 수를 곱한 값은 : " + (int)(a * b) + "\n" +
                "두 수를 나눈 값은 : " + (a / b);
    }

    public int methodB(int a, int b){
        return (a+b);
    }

    public int methodC(int a, int b){
        return (a-b);
    }

    public int methodD(int a, int b){
        return (a*b);
    }
    public double methodE(double a, double b){
        return (a/b);
    }

}
