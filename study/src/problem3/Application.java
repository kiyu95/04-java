package problem3;

public class Application {
    public static void main(String[] args) {


        Monster.setInfo("프랑켄슈타인");
        Monster.setHp(1000);
        System.out.println(Monster.getInfo());



        Monster.setInfo("드라큘라");
        Monster.setHp(-100);
        System.out.println(Monster.getInfo());
    }
}
