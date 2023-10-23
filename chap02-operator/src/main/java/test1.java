public class test1 {
    public static void main(String[] args) {

        // 승객 두명의 놀이기구 탑승 가능여부를 출력하는 코드를 만드시오.
        // 놀이기구 탑승 기준은 키가 120cm 이상이다.
        // 승객 두명의 키는 각각 113cm 와 127cm 이다.

        // 화면에 보여지는 양식은 다음과 같다.
        // 키카 113cm 이므로 탑승 불가능합니다.
        // 키가 127cm 이므로 탑승 가능합니다.

        // 조건
        // 삼항 연산자를 사용하시오

        int criteria = 120;
        int passengerA = 113;
        int passengerB = 127;

        String s1 = (passengerA >= criteria) ? ("탑승 가능") : ("탑승 불가능");
        String s2 = (passengerB >= criteria) ? ("탑승 가능") : ("탑승 불가능");

        System.out.println("키가 " + passengerA + "cm 이므로 " + s1 + "합니다.");
        System.out.println("키가 " + passengerB + "cm 이므로 " + s2 + "합니다.");
    }
}
