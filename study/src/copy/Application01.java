package copy;

public class Application01 {
    public static void main(String[] args){

        Monster monster = new Monster();
        System.out.println(monster.hashCode());
        monster.name = "두치";
        monster.hp = 200;
        System.out.println("name : " + monster.name);
        System.out.println("hp : " + monster.hp);

        monster.name = "뿌꾸";
        monster.setHp(-200);
        System.out.println("name : " + monster.name);
        System.out.println("hp : " + monster.hp);
    }
}
