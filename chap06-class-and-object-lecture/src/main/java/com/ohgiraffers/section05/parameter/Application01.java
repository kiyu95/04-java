package main.java.com.ohgiraffers.section05.parameter;

public class Application01 {
    public static void main(String[] args) {
        ParameterTest pt = new ParameterTest();

        int num = 20;
        pt.testPrimaryTypeParameter(num);

        int[] iarr = new int[] {1,2,3,4,5,6};
        System.out.println("인자로 전달하는 값 : " + iarr[0]);
        pt.testPrimaryTypeArrayParameter(iarr);
        System.out.println("전달 후 iarr의 값 : " + iarr[0]);

        System.out.println();

        RactAngle r1 = new RactAngle(12.5, 22.5);
        System.out.println("인자로 전달하는 r1의 값 : " + r1);
        r1.calcRound();
        r1.calcArea();

        pt.testClassTypeParameter(r1);
        System.out.println("변경 후 사각형의 넓이와 둘레 : ");
        r1.calcRound();
        r1.calcArea();

        // 가변인자
        pt.testVariableLengthArrayParameter("홍길동");
        // hobbs의 String 배열 값을 입력받지 않았는데도 에러가 나지 않음.
        // why? 가변배열이기 때문에

        pt.testVariableLengthArrayParameter("홍길동", "농구", "헬스", "무에타이", "뮤지컬");
    }
}
