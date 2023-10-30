package userLogin;

import java.util.Scanner;

public class MemberService {

    public void signUpMembers() {
        Member[] members = new Member[1];
        Scanner scanner = new Scanner(System.in);

        System.out.println("ID를 입력해주세요");
        String id = scanner.nextLine();

        System.out.println("PW를 입력해주세요");
        String pwd = scanner.nextLine();

        System.out.println("PW를 한번 더 입력해주세요");
        String pwd2 = scanner.nextLine();
//        System.out.println(id);
//        System.out.println(pwd);
//        System.out.println(pwd2);
//        System.out.println( (pwd.equals(pwd2)) ? true : false);

        if (pwd.equals(pwd2)) {
            members[0] = new Member(id, pwd);
        } else {
            System.out.println("비밀번호를 다시 입력해주세요");
        }

        MemberRegister memberRegister = new MemberRegister();
        memberRegister.regist(members);

    }

    public void login() {
        MemberRepository memberRepository = new MemberRepository();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID를 입력 해 주세요");
        String id = scanner.nextLine();
//        if (id.equals(memberRepository.)) {

        }
    }

