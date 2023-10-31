package main.java.com.ohgiraffers.poketmonEvolution;

import main.java.com.ohgiraffers.poketmonEvolution.poketmon.Annibugi;
import main.java.com.ohgiraffers.poketmonEvolution.poketmon.Geobukking;
import main.java.com.ohgiraffers.poketmonEvolution.poketmon.Kkobugi;
import main.java.com.ohgiraffers.poketmonEvolution.poketmon.Poketmon;

public class Application {

    public static void main(String[] args) {
        System.out.println("포켓몬");
        Kkobugi kkobugi = new Kkobugi("Kkobugi", "WaterCannon");
        Annibugi annibugi = new Annibugi("Annibugi", "FrozenBeam");
        Geobukking geobukking = new Geobukking("Geobukking", "Blizzard");

        System.out.println(kkobugi);
        System.out.println(annibugi);
        System.out.println(geobukking);

    }
}
