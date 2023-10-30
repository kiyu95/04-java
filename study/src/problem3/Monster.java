package problem3;

public class Monster {

    static String kinds;

    static int hp;

    public static void setInfo(String info) {
        kinds = info;
    }

    public static void setHp(int hp) {
        if (hp > 0) {
            System.out.println("정상");
            hp = hp;
        } else {
            System.out.println("비정상이므로 체력을 1로 입력합니다");
            hp = 1;
        }
    }

    public static String getInfo() {
        return "몬스터의 종류는 " + kinds + " 이고, 체력은 " + hp + " 입니다.";
    }
}
