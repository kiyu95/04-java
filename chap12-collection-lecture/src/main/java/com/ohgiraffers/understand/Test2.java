package main.java.com.ohgiraffers.understand;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {


        Set<Integer> lotto = new TreeSet<>();
        lotto.add(1);
        lotto.add(2);
        lotto.add(3);
        lotto.add(4);
        lotto.add(5);
        lotto.add(6);
        Map<String, Set<Integer>> lottoMap = new HashMap();
        lottoMap.put("당첨 번호", lotto);

        Set<Integer> testLotto = new TreeSet<>();
        testLotto.add(1);
        testLotto.add(2);
        testLotto.add(3);
        testLotto.add(4);
        testLotto.add(5);
        testLotto.add(6);
        Map<String, Set<Integer>> testMap = new HashMap();
        testMap.put("10번째 번호", testLotto);

        for (String key1 : lottoMap.keySet()) {
            for (String key2 : testMap.keySet()) {
                Set<Integer> value1 = lottoMap.get(key1);
                Set<Integer> value2 = testMap.get(key2);

                if (value1.equals(value2)) {
                    System.out.println("당첨");
                } else {
                    System.out.println("탈락");
                }
            }
        }
    }
}
