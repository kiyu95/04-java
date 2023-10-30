package main.java.com.ohgiraffers.section02.uses;

public class MemberRepository {

    private final static Member[] members; // 배열 members 를 static 하여 선언

    private static int count; // int 자료형 count 를 static 하여 선언

    static {
        members = new Member[10]; // members 배열의 크기를 10으로 할당
    }

    public static boolean store(Member[] newMembers) { // 전달받은 Member[]를 newMembers에 대입한다.

            for (int i = 0; i < newMembers.length; i++) { // members의 길이만큼 반복문을 실행한다.
                members[count++] = newMembers[i];
                // members에 [count++]가 들어가는 이유 : members가 스태틱 변수 이므로, 모든 MemberRepository의 인스턴스가 members를 공유하게 된다
                // 여기서 members의 길이는 10으로 고정되어 있기 때문에 member[i]를 대입하게되면 매번 호출시 i는 0 으로 시작하게 되어 기존 배열을 초기화하고 다시 저장한다.
                // 이러한 오류를 해결하기 위하여 count라는 static 변수를 참조하여 member[i]를 대입시켜준다.
            }
            return true; // 위의 대입하는 과정 종류 후 true를 반환한다.
        }



    public static Member[] findAllMembers() { // 배열 findAllMembers()을 static 하여 선언
        return members; // static 되어있는 members 배열 값을 반환
    }

}
