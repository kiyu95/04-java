package main.java.com.ohgiraffers.section01.exception;

public class Application02 {

    public static void main(String[] args) {
        ExceptionText et = new ExceptionText();

        try{
            et.checkEnoughMoney(5000, 10000);
            et.checkEnoughMoney(10000, 100);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
}
