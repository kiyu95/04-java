package main.java.com.ohgiraffers.section02;

public abstract class Product {

    public Product(){

    }

    public void nonStaticMethod(){
        System.out.println("Product 클래스의 NonStaticMethod를 호출함");
    }

    public static void staticMethod() {
        System.out.println("Product 클래스의 StaticMethod를 호출함");
    }

    public abstract void abstractMethod(); // abstract : 공통적으로 가지면서 개별적으로 바꿔줘야 하는 경우 (ex. 유통기한)
}
