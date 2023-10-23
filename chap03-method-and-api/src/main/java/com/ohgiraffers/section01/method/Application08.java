package main.java.com.ohgiraffers.section01.method;

public class Application08 {

    public static void main(String[] args){

        // static 메서드
        //
        // static 메소드를 호출하는 방법
        // 클래스.메소드명();

        // 권장하지 않는 방식
        Application08 app8 = new Application08();
        int result = app8.sumToNumber(1, 2);

        int result2 = Application08.sumToNumber(1, 2);
    }

    public static int sumToNumber(int num1, int num2){
        return num1 + num2;
    }

}
