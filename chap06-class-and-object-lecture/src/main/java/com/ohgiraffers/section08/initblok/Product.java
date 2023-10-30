package main.java.com.ohgiraffers.section08.initblok;

public class Product {
    private String name;
    private int price;
    private static String brand;


    // 인스턴스 초기화 블럭
    {
        name = "사이언";
        price = 100000;
        brand = "사과";
    }
    static {
//        name = "손오공"; // 생명주기가 달라 error 발생
//        price = 10000; // 생명주기가 달라 error 발생
        brand = "드래곤볼";
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price + '\'' +
                ", brand=" + Product.brand +
                '}';
    }

}
