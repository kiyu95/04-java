package test;

import java.util.Scanner;

public class User {
    private String name;
    private int age;
    private char gender;
    private static int reserveNum = 3;

    public void regist(boolean result){
        if (result == true) {
            while (true) {
                if (User.reserveNum > 0) {
                    User.reserveNum -= 1;
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("이름을 입력해주세요");
                    this.name = scanner.nextLine();
                    System.out.println("나이를 입력해주세요");
                    this.age = scanner.nextInt();
                    System.out.println("성별을 입력해주세요 (남 / 여)");
                    this.gender = scanner.next().charAt(0);

                    System.out.println("회원 등록이 완료되었습니다.");
                    System.out.println("이름 : " + this.name + " 나이 : " + this.age + " 성별 : " + this.gender);
                } else {
                    System.out.println("죄송합니다. 회원등록이 마감되었습니다.");
                    break;
                }
            }
        } else {
            System.out.println("안할거면 가세요");
        }
    }
}
