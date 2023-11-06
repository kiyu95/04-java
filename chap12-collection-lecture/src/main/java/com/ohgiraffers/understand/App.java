package main.java.com.ohgiraffers.understand;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("구매하실 수량을 입력해주세요 (최대 구매 : 10개)");
        int sum = 0;

        while (true){

            int num = scanner.nextInt();
            sum += num;
            if (sum % 10 != 0) {
                System.out.println("구매하실 수량을 입력해주세요 (최대 구매 : " + (10 - sum % 10) + "개)");
            }

            if (sum % 10 == 0) {
                Set<Integer> lotto = new TreeSet<>();
                while (lotto.size() < 6) {
                    lotto.add((int)(Math.random() * 45) + 1);
                }
                Map<String, Set<Integer>> lottoMap = new HashMap();
                lottoMap.put("행운 번호", lotto);
                System.out.println(lottoMap);

                for (String key : lottoMap.keySet()) {
                    Set<Integer> valueLotto = lottoMap.get(key);

                    for (int i = 1; i < 11; i++) {
                        if (i < 11) {
                            Set<Integer> autoLotto = new TreeSet<>();
                            while (autoLotto.size() < 6) {
                                autoLotto.add((int) (Math.random() * 45) + 1);
                            }
                            Map<String, Set<Integer>> hmap = new HashMap();
                            hmap.put(i + "번로또", autoLotto);
                            System.out.println(hmap);

                            for (String key1 : hmap.keySet()){
                                Set<Integer> valueAutoLotto = hmap.get(key1);
                                if (valueLotto.equals(valueAutoLotto)) {
                                    System.out.println("행운 번호 : " + valueLotto);
                                    System.out.println(i + "번 로또 당첨 : " + valueAutoLotto);
                                    return;
                                }
                            }
                        }
                    }
                    System.out.println("행운 번호 : " + valueLotto);
                    System.out.println("이번 회차 당첨자 없음");
                    System.out.println();
                    System.out.println("구매하실 수량을 입력해주세요 (최대 구매 : 10개)");
                }
            }
        }
    }
}