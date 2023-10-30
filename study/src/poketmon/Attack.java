package poketmon;

import java.util.Random;
import java.util.Scanner;

public class Attack {
    public static void main(String[] args) {

        int hp = 100;
        Random random = new Random();
        System.out.println("포켓몬의 hp : " + hp);

        while (hp > 0) {
            int result = random.nextInt(2);

            switch (result) {
                case 0 :
                    hp -= 30;
                    System.out.println("현재 남은 hp : " + hp); break;
                case 1 :
                    System.out.println("공격이 실패하였습니다"); break;

            }
        }
    }
}
