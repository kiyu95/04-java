package userLogin;

public class MemberRepository {

    private final static Member[] members;

    private static int count;

    static {
        members = new Member[5];
    }

    public static boolean store(Member[] newMembers) {
        for (int i = 0; i < newMembers.length; i++) {
            members[count++] = newMembers[i];
        }
        return true;
    }
}
