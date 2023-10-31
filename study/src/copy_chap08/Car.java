package copy_chap08;

public class Car {

    private boolean runningState;

    public Car() {
        System.out.println("Car 클래스의 기본 생성자를 호출함");
    }

    public void run() {
        runningState = true;
        System.out.println("자동차가 달립니다.");
    }

    public void soundHorn() {
        if (isRunning()) {
            System.out.println("빵빵");
        } else {
            System.out.println("주행중이 아닐 때는 경적을 울릴수 없습니다.");
        }
    }

    public boolean isRunning() {
        return runningState;
    }

    public void stop() {
        runningState = false;
        System.out.println("자동차를 멈춥니다.");
    }

}
