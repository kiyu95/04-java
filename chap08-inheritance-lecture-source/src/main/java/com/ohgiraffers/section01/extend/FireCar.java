package main.java.com.ohgiraffers.section01.extend;

public class FireCar extends Car{

    public FireCar(){
        // 모든 생성자에는 맨 첫 줄에 super()를 컴파일러가 자동 추가한다.
        // 부모의 기본 생성자를 호출하는 구문이다.
        // 해당 생성자가 호출 될 시 가장 먼저 Car() 클래스 호출 내용이 출력될 것이다.
        // 명시적, 묵시적 전부 사용가능하다.
        super();
    }

    @Override
    public void soundHorn(){
        if(isRunning()){ // super.isRunning()
            System.out.println("빠아앙");
        } else {
            System.out.println("소방차가 앞으로 갈 수 없습니다.");
        }
    }

    public void sprayWater(){
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다.");
    }

}
