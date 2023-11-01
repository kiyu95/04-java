package login.service;

import login.auth.SnsAuth;
import login.dto.MemberDTO;

import java.util.Scanner;

public class MemberService {

    private SnsAuth snsAuth;

    public MemberService(SnsAuth snsAuth){
        this.snsAuth = snsAuth;
    }

    public boolean findMember(/* String authType, */MemberDTO memberDTO){
//        switch (authType){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("로그인 연동하려는 사이트는 무엇인가요? (google, naver, kakao) ");
//            scanner.nextLine();
//            case "google" : snsAuth = 000; break;
//            case "naver" : snsAuth = 000; break;
//            case "kakao" : snsAuth = 000; break;
//            default:
//                System.out.println("존재하지 않는 인증 유형입니다."); return false;
//        }

        boolean result = snsAuth.login(memberDTO);

        return result;
    }
}
