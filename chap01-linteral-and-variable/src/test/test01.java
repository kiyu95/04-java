package test;

public class test01 {
    public static void main(String[] args) {

        // 김경리가 사원 10명의 월급을 입급해줘야 하는 날이다.
        // 사원의 직책은 대리, 과장, 부장, 차장이 있으며
        // 대리는 100만원
        // 과장은 120만원
        // 부장은 130만원
        // 차장은 150만원의 월급을 받고,
        // 보너스는 각 월급 *0.5 만큼을 더해서 주어야 한다.

        // 화면에 보여지는 형태는 다음과 같다.
        // 김대리의 월급은 100만원 + 보너스 50만원으로 총 150만원 입급되었습니다.

        int salaryA = 100, bonusA = 50;
        int salaryB = 120, bonusB = 60;
        int salaryC = 130, bonusC = 65;
        int salaryD = 150, bonusD = 75;

//        int salary;
//        int bonus;
//        bonus = (salary + salary / 2);

        System.out.println("김대리의 월급은 " + salaryA + "만원 + 보너스 " + bonusA + "만원으로 총 " + (salaryA+bonusA) + "만원 입급되었습니다.");
        System.out.println("김과장의 월급은 " + salaryB + "만원 + 보너스 " + bonusB + "만원으로 총 " + (salaryB+bonusB) + "만원 입급되었습니다.");
        System.out.println("김부장의 월급은 " + salaryC + "만원 + 보너스 " + bonusC + "만원으로 총 " + (salaryC+bonusC) + "만원 입급되었습니다.");
        System.out.println("김차장의 월급은 " + salaryD + "만원 + 보너스 " + bonusD + "만원으로 총 " + (salaryD+bonusD) + "만원 입급되었습니다.");

        System.out.println("김대리의 월급은 " + salaryA + "만원 + 보너스 " + (salaryA/2) + "만원으로 총 " + (salaryA + salaryA/2) + "만원 입급되었습니다.");

    }
}

