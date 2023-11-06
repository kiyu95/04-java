package main.java.com.ohgiraffers.understand;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        int sum = 0;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("구매하실 수량을 입력해주세요 (최대 10)");
            int num = scanner.nextInt();

            if (num <= 10) {
                sum += num;
                if (sum % 10 == 0) {
                    Set<Integer> lotto = new TreeSet<>();
                    lotto.add(1);
                    lotto.add(2);
                    lotto.add(3);
                    lotto.add(4);
                    lotto.add(5);
                    lotto.add(6);
                    Map<String, Set<Integer>> lottoMap = new HashMap();
                    lottoMap.put("당첨 번호", lotto);
                    System.out.println(lottoMap);
//                    while (lotto.size() < 6) {
//                        lotto.add((int)(Math.random() * 45) + 1);
//                    }
//                    System.out.println(lotto);

                    for (String key : lottoMap.keySet()) {
                        Set<Integer> valueLotto = lottoMap.get(key);

                        for (int i = 1; i < 11; i++) {
                            if (i < 10) {
                                Set<Integer> autoLotto = new TreeSet<>();
                                while (autoLotto.size() < 6) {
                                    autoLotto.add((int) (Math.random() * 45) + 1);
                                }
                                Map<String, Set<Integer>> hmap = new HashMap();
                                hmap.put(i + "번째 번호", autoLotto);
                                System.out.println(hmap);

                                for (String key1 : hmap.keySet()){
                                    Set<Integer> valueAutoLotto = hmap.get(key1);
                                    if (valueLotto.equals(valueAutoLotto)) {
                                        System.out.println("행운 번호 : " + valueLotto);
                                        System.out.println(i + "번 로또 당첨 : " + valueAutoLotto);
                                    }
                                }

                            }
                            if (i == 10) {
                                Set<Integer> testLotto = new TreeSet<>();
                                testLotto.add(1);
                                testLotto.add(2);
                                testLotto.add(3);
                                testLotto.add(4);
                                testLotto.add(5);
                                testLotto.add(6);
                                Map<String, Set<Integer>> testMap = new HashMap();
                                testMap.put("10번째 번호", testLotto);
                                System.out.println(testMap);
                                for (String key2 : testMap.keySet()) {
                                    Set<Integer> valueTestLotto = testMap.get(key2);
                                    if (valueLotto.equals(valueTestLotto)) {
                                        System.out.println("행운 번호 : " + valueLotto);
                                        System.out.println(i + "번 로또 당첨 : " + valueTestLotto);
                                        return;
                                    } else {
                                        System.out.println("행운 번호 : " + valueLotto);
                                        System.out.println("이번 회차 당첨자 없음");
                                    }
                                }
                            }
                        }

                    }

                }
            }
        }
    }
}
