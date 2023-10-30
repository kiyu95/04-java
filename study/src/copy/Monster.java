package copy;

import java.util.Scanner;

public class Monster {

    String name;
    int hp;

    public void setHp(int hp) {
        if (hp > 0) {
            System.out.println("입력한 값으로 설정합니다");
            this.hp = hp;
        } else {
            System.out.println("양수값으로 다시 입력 해 주세요");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            if (x > 0) {
                this.hp = x;
            } else {
                int b = 0;
                while (b > 0) {
                    System.out.println("양수값으로 다시 입력 해 주세요");
                    b = scanner.nextInt();
                } if (b > 0) {
                    this.hp = b;
                } else {
                    System.out.println("양수값으로 다시 입력 해 주세요");
                    b = scanner.nextInt();
                }
            }
        }
    }
}
