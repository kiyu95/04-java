package main.java.com.ohgiraffers.section01.understand.Car;

// 전기차가 갖는 특징을 정의해주기 위해 만든 클래스이다.
// 전기차는 자동차가 갖는 속성을 갖으면서 별도로 energy라는 옵션을 갖는다.
// 그래서 전기차를 만들때 car를 상속받아 brand명과 price의 대한 속성을 중복 정의하지 않기 위해 부모가 가진 기능을 상속받았다.
// 이점 1. 이를 통해 중복 코드가 줄어드는 이점이 생겼다.
public class ElectricCar extends Car{
    private String carName;

    private String energy;

    public ElectricCar(String brand, int price, String carName, String energy) {
        super(brand, price);
        this.carName = carName;
        this.energy = energy;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    // 전기차는 판매 시 15%의 수수료를 주는 이벤트가 적용되어 있어 car에서 정의된 getPrice를 우리가 재정의하여 price*0.15를 반환하도록 작성하였다.
    // 이를 통해 전기차 판매시 영웝사원의 수수료를 알 수 있다.
    @Override
    public double getPrice() {
        System.out.println("전기차의 판매가는 " + super.getPrice() + "원 입니다.");
        return super.getPrice() * 0.15;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "carName='" + carName + '\'' +
                ", energy='" + energy + '\'' +
                '}';
    }
}
