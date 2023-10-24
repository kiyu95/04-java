package main.java.com.ohgiraffers.section02.encapsulation.problem2;

public class Application01 {

    public static void main(String[] args) {

        // 참조 자료형의 필드가 변경되는 경우 직접 참조를 하는 필드의 모든 값을 변경해야 하는 문제가 발생한다.

        Monster monster = new Monster();
//        monster.name = "두치"; // 2083562754.name = 두치
        monster.hp = 200; // 2083562754.hp = 200
//        System.out.println("monster name : " + monster.name);
        System.out.println("monster hp : " + monster.hp);

        Monster monster2 = new Monster();
//        monster2.name = "뿌꾸"; // 1239731077.name = 뿌꾸
        monster2.hp = -200; // 1239731077.hp = -200
//        System.out.println("monster2 name : " + monster2.name);
        System.out.println("monster2 hp : " + monster2.hp);

        Monster monster3 = new Monster();
//        monster3.name = "드라큘라";
        monster3.setHp(-200);
//        System.out.println("monster3 name : " + monster3.name);
        System.out.println("monster3 hp : " + monster3.hp);

        Monster monster4 = new Monster();
//        monster4.name = "프랑켄슈타인";
        monster4.setHp(1000);
//        System.out.println("monster4 name : " + monster4.name);
        System.out.println("monster4 hp : " + monster4.hp);

    }
}
