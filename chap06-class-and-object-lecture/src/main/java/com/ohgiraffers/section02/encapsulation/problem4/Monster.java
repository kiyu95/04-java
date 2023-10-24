package main.java.com.ohgiraffers.section02.encapsulation.problem4;

public class Monster {

    // 접근제한자
    // 클래스 혹은 클래스의 맴버에 참조연산자로 접근할 수 있는 범위를 제한하기 위한 키워드이다.
    // 1. public : 모든 패키지에 접근 허용
    // 2. protected : 동일 패키지에 접근 허용 단, 상속관계에 있는 경우 다른 패키지에도 접근 가능
    // 3. default : 동일 패키지에만 접근 가능 (기본 값으로 작성하지 않으면 default 접근 제한을 갖는다.)
    // 4. private : 해당 클래스 내부에서만 접근을 허용

    // 위의 네 가지 접근제한자는 클래스의 맴버(필드, 메소드)에 모두 사용이 가능하다.
    // 단 클래스 선언 시 사용하는 접근 제한자는 public 과 default 만 사용이 가능하다.
    // 필드 : 클래스에 선언된 변수
    // 맴버 : 클래스에 정의된 모든 속성을 의미

    private String kind;
    private int hp;

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setHp(int hp) {
        if(hp > 0) {
            this.hp = hp;
        } else {
            this.hp = 0;
            System.out.println("체력이 0이면 죽음");
        }
    }

    public String getKind() {
        return this.kind;
    }

    public  int getHp() {
        return this.hp;
    }

    @Override // Override : 재정의
    public String toString() {
        return "입력한 종류는 " + kind + " 이고 체력은 " + hp + " 입니다.";
    }
}
