package main.java.com.ohgiraffers.section04;

import main.java.com.ohgiraffers.section04.uses3.Dicer;
import main.java.com.ohgiraffers.section04.uses3.HellDice;
import main.java.com.ohgiraffers.section04.uses3.SuperDice;

public class Application02 {

    public static void main(String[] args) {

        Dicer dicer = new Dicer();
        dicer.throwDice(new HellDice());
        dicer.throwDice(new SuperDice());
    }
}
