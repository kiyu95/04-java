package main.java.com.ohgiraffers.section02.encapsulation.problem3;

public class Application01 {

    public static void main(String[] args) {

        Monster monster = new Monster();
        monster.setInfo("드라큘라"); // 드라큘라
        monster.setHp(10);

        Monster monster1 = new Monster();
        monster1.setInfo("미라"); // 미라
        monster1.setHp(1000);

        Monster monster2 = new Monster();
        monster2.setInfo("프랑켄슈타인"); // 프랑켄슈타인
        monster2.setHp(500);

        System.out.println(monster.getInfo());
        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
    }
}