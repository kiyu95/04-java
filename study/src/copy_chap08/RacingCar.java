package copy_chap08;

public class RacingCar extends Car{

    public RacingCar() {
        System.out.println("RacingCar 클래스의 기본 생성자를 호출");
//        super();
    }

    @Override
    public void run() {
        System.out.println("레이싱카가 달립니다.");
    }

    @Override
    public void soundHorn() {
        System.out.println("레이싱카는 경적을 울릴 수 없습니다.");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카 멈춤");
    }
}
