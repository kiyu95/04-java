package main.java.com.ohgiraffers.section01.run;

import main.java.com.ohgiraffers.section01.*;

import java.util.ArrayList;
import java.util.List;

public class Application01 {

    public static void main(String[] args) {

        // RabbitFarm은 Rabbit의 자손만 들어올 수 있기때문에 Animal은 에러
//        RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();

//        RabbitFarm<Mammal> farm = new RabbitFarm<Mammal>();
//        RabbitFarm<Snake> farm = new RabbitFarm<Snake>();
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

//        RabbitFarm<?> farm7 = new RabbitFarm<>();
//        farm7.setAnimal(new Snake());

        farm4.setAnimal(new Rabbit());
        ((Rabbit) farm4.getAnimal()).cry(); // 타입을 꺼내와야 참조자료형이 된다

        // Rabbit의 후손 타입만 허용할 수 있도록 제네릭스의 제한을 걸어 두었기 때문에
        // <T extends Rabbit> 형변환이 생각 가능하다.
        // 이유 T이 결정되어도 T의 값은 Rabbit의 후손일 것이기 때문에
        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        ((Bunny) farm6.getAnimal()).cry();

        List<? super Rabbit> parents = new ArrayList<>();
        parents.add(new Rabbit());
//        parents.add(new Mammal());
    }
}
