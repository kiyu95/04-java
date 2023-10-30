package main.java.com.ohgiraffers.section01.understand;

import main.java.com.ohgiraffers.section01.understand.Car.Car;
import main.java.com.ohgiraffers.section01.understand.Car.ElectricCar;
import main.java.com.ohgiraffers.section01.understand.Car.OldCar;
import main.java.com.ohgiraffers.section01.understand.employee.Seller;

public class Application {

    public static void main(String[] args) {

        System.out.println("자동차 판매 프로그램 입니다.");

        System.out.println("전기차");
        ElectricCar ionic = new ElectricCar("H", 1000, "ionic1", "1000km");
        ElectricCar ionic2 = new ElectricCar("H", 1500, "ionic2", "1500km");
        ElectricCar ionic3 = new ElectricCar("H", 2000, "ionic3", "2000km");
        ElectricCar kona = new ElectricCar("H", 2100, "kona", "2100km");

        System.out.println("내연기관 자동차");
        OldCar poter = new OldCar("H", 1500, "poter", "diesel");
        OldCar avante = new OldCar("H", 1500, "avante", "Gasoline");
        OldCar sonata = new OldCar("H", 2000, "sonata", "Gasoline");

        System.out.println("영원 사원 입사");

        Seller seller = new Seller("노홍철"); // 노홍철 사원이 입사함

        // 노홍철 사원이 판매한 상품
//        OldCar[] sellers = {poter, avante, sonata,poter};
//        seller.oldCarSale(sellers);
//
//        ElectricCar[] electricCars = {ionic2, ionic3, ionic, kona};
//        seller.electricCarSale(electricCars);
//        System.out.println(seller);

        Car[] cars = {poter, kona, ionic2, sonata, avante};
        seller.sale(cars);
        System.out.println(seller);
    }
}
