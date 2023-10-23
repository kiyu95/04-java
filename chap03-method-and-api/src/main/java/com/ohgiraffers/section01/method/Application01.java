package main.java.com.ohgiraffers.section01.method;

public class Application01 {
    public static void main(String[] args){

        // 메소드란?
        // 메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.

        System.out.println("main()메서드 시작됨.");

        // 새로운 함수를 만든다.
        Application01 app1 = new Application01();
//        Application01 app1; // 메모리에 공간을 확보
//        app1 = new Application01(); // app1이 가진 주소에 Application01이 가지고 있는 속성을 할당함

        app1.methodA();

    }

    // 접근제어자 public : 공용으로 쓰이는 것
    // 메서드 정의
    public void methodA(){
        System.out.println("methodA() 호출");

        methodB();

        System.out.println("methodA() 종료");
    }

    public void methodB(){
        System.out.println("methodB() 호출");

        methodC();
        System.out.println("methodB() 종료");
    }

    public void methodC(){
        System.out.println("methodC() 호출");
        System.out.println("methodC() 종료");
    }

}
