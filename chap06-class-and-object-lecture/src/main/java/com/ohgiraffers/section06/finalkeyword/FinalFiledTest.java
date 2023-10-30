package main.java.com.ohgiraffers.section06.finalkeyword;

public class FinalFiledTest {

    // final
    // : final은 중단의 의미를 가지는 키워드이다.
    // final 키워드를 사용할 수 있는 위치는 다양한 편이며 의미가 약간 다르지만, 결국 변경은 불가의 의미이다.
    // 1. 지역변수 : 초기화 이후 값 변경 불가 final string value = "final";
    // 2. 매개변수 : 호출시 전달한 인자 변경 불가 method(final string value;)
    // 3. 전역변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가
    // 4. 클래스 (static) 변수 : 프로그램 start 이후 값 변경 불가
    // 5. non-static 메소드 : 메소드 재작성(overriding) 불가
    // 6. static 메소드 : 메소드 재작성(overriding) 불가
    // 7. 클래스 : 상속 불가

    // final은 변경 불가의 의미를 가진다.
    // 따라서 초기 인스턴스(생성된 객체)가 생성되고 나면 기본값 0이 필드에 들어가게 되는데,
    // 그 초기화 이후 값을 변경할 수 없기 때문에 선언하면서 바로 초기화를 해 주어야 한다.
    // 그렇지 않으면 compile error가 발생한다.

//    private final int nonStaticNuml; // error
    private final int NON_STATIC_NUM = 1;

    private final String NON_STATIC_NAME; // nonStaticName 매개변수를 입력받아 바로 초기화되므로 error가 발생하지 않음

    public FinalFiledTest(String nonStaticName) {
        this.NON_STATIC_NAME = nonStaticName;
    }

    // static 할때 이미 error가 발생하기 떄문에 나중에 매개변수를 입력받아 초기화 하는게 불가능
//    private static final int STATIC_NUM;
//
//    public FinalFiledTest(int nonStaticNum) {
//        this.STATIC_NUM = nonStaticNum;
//    }

    private static final int STATIC_NUM = 10; // static 할때는 값을 이렇게 초기화 해 주어야 한다

    private static final double STATIC_DOUBLE;
    static {
        STATIC_DOUBLE = 10.0;
    }

}
