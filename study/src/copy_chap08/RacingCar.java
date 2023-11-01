package copy_chap08;

public class RacingCar extends Car{

    public RacingCar() {
        System.out.println("RacingCar 클래스의 기본 생성자를 호출");
//        super();
    }

    @Override
    public void run() {
        setIsRunning(true);
        System.out.println("레이싱카가 달립니다.");
    }

    @Override
    public void soundHorn() {
        if (isRunning()) {
            System.out.println("레이싱카는 동작중에도 경적을 울릴 수 없습니다.");
        } else {
            System.out.println("레이싱카가 주행중이 아닙니다.");
        }
    }

    @Override
    public void stop() {
        setIsRunning(false);
        System.out.println("레이싱카 멈춤");
    }

    public void booster() {
        if (isRunning()) {
            System.out.println("부스터 발동");
        } else {
            System.out.println("시동이 꺼져있습니다.");
        }
    }
}
