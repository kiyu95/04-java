package main.java.com.ohgiraffers.understand;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HashMapComparison {

    public static void main(String[] args){

        Map<String, Set<Integer>> hmap1 = new HashMap<>();
        Set<Integer> tset1 = new TreeSet<>();
        tset1.add(1);
        tset1.add(2);
        tset1.add(3);
        hmap1.put("A", tset1);

        Map<String, Set<Integer>> hmap2 = new HashMap<>();
        Set<Integer> tset2 = new TreeSet<>();
        tset2.add(1);
        tset2.add(2);
        tset2.add(3);
        hmap2.put("a", tset2);

        System.out.println(hmap1);
        System.out.println(hmap1.keySet());
        System.out.println(hmap1.values());
        System.out.println(hmap1.get("A"));
        System.out.println(hmap1.get("A").equals(hmap2.get("a")));

        for (String key : hmap1.keySet()){
            System.out.println(key + " : " + hmap1.get(key));
        }

        for (String key1 : hmap1.keySet()){
            for (String key2 : hmap2.keySet()) {
                Set<Integer> value1 = hmap1.get(key1);
                Set<Integer> value2 = hmap2.get(key2);

                if (value1.equals(value2)) {
                    System.out.println(key1 + "의 value와 " + key2 + " 의 value는 같다.");
                } else {
                    System.out.println(key1 + "의 value와 " + key2 + " 의 value는 다르다.");
                }
            }

            }

    }
}
