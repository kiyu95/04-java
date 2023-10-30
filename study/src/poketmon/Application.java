package poketmon;

import java.util.Random;

public class Application {
    public static void main(String[] args) {

        String[] poketmon = new String[] {"파이리", "꼬북이", "이상해씨"};
        System.out.println(poketmon[0]);
        Random random = new Random();
        int result = random.nextInt(3);
        System.out.println(result);
        switch (result) {
            case 0 : System.out.println("앗! 야생의 파이리가 나타났다"); break;
            case 1 : System.out.println("앗! 야생의 꼬북이가 나타났다"); break;
            case 2 : System.out.println("앗! 야생의 이상해씨가 나타났다"); break;
        }


    }
}
