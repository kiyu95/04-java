package main.java.com.ohgiraffers.section02.uses;

public class MemberRegister {

    public void regist(Member[] members) {
        System.out.println("회원을 등록합니다.");
        // 전달 받은 매개변수 members에서 각 인덱스(위치) 값을 한 개씩 꺼내서 member 변수에 대입한다.
        for (Member member : members) {
            System.out.println(member.getInfo() + "님을 회원 등록에 성공했습니다."); // member클래스에 선언된 getInfo() 메서드를 호출한다.
        }
        // MemberRepository클래스에 선언된 store메서드의 매개변수로 Member[]를 전달한다.
        if(MemberRepository.store(members)) { // store에서 반환 받은 값이 true이면 아래의 내용을 출력한다.
            System.out.println("총 " + members.length + "명의 회원 등록에 성공했습니다.");
        }
    }
}
