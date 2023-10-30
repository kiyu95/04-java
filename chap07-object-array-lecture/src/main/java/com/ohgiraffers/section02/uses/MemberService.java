package main.java.com.ohgiraffers.section02.uses;

public class MemberService {

    public void singUpMembers() {
        Member[] members = new Member[5]; // Member[] 배열의 size를 5로 만들어줌

        // Member 배열에 Member 클래스를 생성하여 값을 넣어줌
        members[0] = new Member(1, "user01", "pass", "홍길동", 20, '남');
        members[1] = new Member(2, "user02", "pass", "유관순", 16, '여');
        members[2] = new Member(3, "user03", "pass", "이순신", 40, '남');
        members[3] = new Member(4, "user04", "pass", "신사임당", 36, '여');
        members[4] = new Member(5, "user05", "pass", "윤봉길", 22, '남');


        MemberRegister memberRegister = new MemberRegister(); // MemberRegister를 생성함
        memberRegister.regist(members); // MemberRegister클래스의 regist()메서드에 Member[]을 매개변수로 전달하여 해당 메서드를 호출함
    }

    public void showAllMember() {
        // MemberFinder 를 생성함 (MemberFinder 클래스의 매서드를 사용하기 위해 heap영역에 MemberFinder 주소값을 finder 변수로 할당함)
        MemberFinder finder = new MemberFinder();

        System.out.println("===== 가입된 회원 목록 =====");
        for (Member member : finder.findAllMembers()) { // findAllMembers 에서 각 인덱스 값을 한 개 씩 꺼내서 member 변수에 대입한다.
            if(member != null) { // member 배열이 null 값이 아닌게 true일 때, 아래 실행
                System.out.println(member.getInfo()); // Member클래스에 선언된 getInfo() 메서드를 호출한다.
            }
        }
        System.out.println("===== 회원 조회 완료 =====");
    }

}
