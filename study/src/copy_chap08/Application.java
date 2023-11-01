package copy_chap08;

public class Application {

    public static void main(String[] args) {

        RacingCar racingCar = new RacingCar();
        racingCar.soundHorn();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.booster();
        racingCar.stop();
        racingCar.soundHorn();
        racingCar.booster();

    }
}
