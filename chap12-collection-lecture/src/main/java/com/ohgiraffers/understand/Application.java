package main.java.com.ohgiraffers.understand;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        // 당첨 번호 생성
        Set<Integer> lotto = new TreeSet<>();
        while (lotto.size() < 6) {
            lotto.add((int)(Math.random() * 45) + 1);
        }
        System.out.println(lotto);

        // 구매한 수량만큼 로또 생성
        System.out.println("로또 구매 수량을 입력해주세요 : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num + "장의 로또를 구매하셨습니다.");
        for (int i = 0; i < num; i++) {
            Set<Integer> autoLotto = new TreeSet<>();
            while (autoLotto.size() < 6) {
                autoLotto.add((int)(Math.random() * 45) + 1);
            }
            System.out.println(i + "번째 번호 :" + autoLotto);
        }

    }
}
