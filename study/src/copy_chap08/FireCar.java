package copy_chap08;

public class FireCar extends Car{

    public FireCar() {
        super();
    }

    @Override
    public void soundHorn() { // Car의 soundHorn() 메서드 재정의
        if (isRunning()) {
            System.out.println("소방차 경적 울림");
        } else {
            System.out.println("소방차가 주행중이 아닙니다.");
        }
    }

    @Override
    public void run() {
        System.out.println("소방차가 달립니다");
    }

    @Override
    public void stop() {
        System.out.println("소방차가 멈춥니다");
    }

    public void sprayWater() { // 속성을 확장(extend)하였음
        System.out.println("물을 뿌립니다.");
    }

}
