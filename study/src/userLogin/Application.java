package userLogin;

import java.util.Scanner;

public class Application {

    // 1. 회원가입
    // id
    // pw1
    // pw2
    // (pw1 == pw2) : 회원가입 완료
    // (pw1 != pw2) : 비밀번호를 다시 입력해주세요

    // 2. 로그인
    //      회원가입 후 로그인
    //       - 로그인시 id가 없다면 "없는 회원입니다. 회원가입을 먼저 해주세요"
    //       - 비밀번호가 틀릴시 "비밀번호가 틀렸습니다."

    // 9. 프로그램 종료

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MemberService memberManger = new MemberService();

        while (true) {
            System.out.println("===== 로그인 프로그램 =====");
            System.out.println("1. 회원 가입");
            System.out.println("2. 로그인");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택 : ");
            int no = scanner.nextInt(); // 이용하고자 하는 서비스 번호를 입력받음

            switch (no) {
                case 1 : memberManger.signUpMembers(); break;
                case 2 : memberManger.login(); break;
                case 9 : System.out.println("프로그램을 종료합니다."); return;
                default : System.out.println("번호를 다시 입력해주세요"); break;
            }
        }
    }
}
