package main.java.com.ohgiraffers.understand;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {

        while (true){
            Set<Integer> lotto = new TreeSet<>();
            while (lotto.size() < 6) {
                lotto.add((int)(Math.random() * 45) + 1);
            }
            System.out.println(lotto);

            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

        }


    }
}
