package main.java.com.ohgiraffers.section01.exception;

public class Application03 {

    public static void main(String[] args){

        ExceptionText et = new ExceptionText();

        try{
            et.checkEnoughMoney(5000, 10000); // 아직 런타임 되지 않았기 때문에 exception인지 모르기 때문에 예외처리 해주어야 한다.
            System.out.println("상품 구매완료");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
}
