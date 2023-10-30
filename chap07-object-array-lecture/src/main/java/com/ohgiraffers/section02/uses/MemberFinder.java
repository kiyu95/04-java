package main.java.com.ohgiraffers.section02.uses;

public class MemberFinder {

    public Member[] findAllMembers() { // 배열 findAllMembers() 메서드 선언
        return MemberRepository.findAllMembers(); // MemberRepository 클래스의 findAllMembers() 메서드 값을 반환한다
    }
}
