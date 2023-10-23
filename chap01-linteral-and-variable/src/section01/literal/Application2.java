package section01.literal;

public class Application2 {
    public static void main(String[] args){
        /*수업 목표. 정수 리터럴 연산 형식의 값을 직접 연산한다. */

        // 1. 123 + 456
        // 2. 123 - 456
        // 3. 123 * 456
        // 4. 40 / 10
        // 5. 10 % 2

//        int a = 123;
//        int b = 456;
//        System.out.println(a+b);

        System.out.println(123 + 456);
        System.out.println(123 - 456);
        System.out.println(123 * 456);
        System.out.println(40 / 10);
        System.out.println(10 % 2); // % : 몫 연산 (나머지 출력)

        System.out.println("----------");

        /*수업목표. 실수와 실수 리터럴 연산 */

//        1. 1.23 + 1.23
//        1. 1.23 - 1.23
//        1. 1.23 * 1.23
//        1. 1.23 / 1.23
//        1. 1.23 % 1.23

        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 1.23);
        System.out.println(1.23 * 1.23);
        System.out.println(1.23 / 1.23);
        System.out.println(1.23 % 1.23);


        System.out.println("----------");
        /*수업목표. 정수와 실수 연산 */

//        1. 1 + 0.5
//        1. 1 - 0.5
//        1. 1 * 0.5
//        1. 1 / 0.5
//        1. 1 % 0.5

        System.out.println(1 + 0.5); // 실수의 범위가 더 크기 때문에 자동 형 변환이 되었음
        System.out.println(1 - 0.5);
        System.out.println(1 * 0.5);
        System.out.println(1 / 0.5);
        System.out.println(1 % 0.5);

        System.out.println("----- 문자와 문자의 연산 -----");
//        목차. 2. 문자의 연산
//        목차. 2-1. 문자와 문자의 연산
//        필기. 문자끼리의 연산도 사칙연산에 mod 연산까지 가능하다.
//        설명. 지금은 계산 결과가 왜 이렇게 나왔는지 보다 연산이 사용 가능하다는 것에 집중하자!!

//        ('a' + 'b');
//        ('a' - 'b');
//        ('a' * 'b');
//        ('a' / 'b');
//        ('a' % 'b');
        System.out.println('a' + 'b'); // 문자형이지만 연산시에는 숫자로 변환이 된다
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        System.out.println("----- 문자와 정수의 연산 -----");

        System.out.println('a' + '1');
        System.out.println('a' - '1');
        System.out.println('a' * '1');
        System.out.println('a' / '1');
        System.out.println('a' % '1');

//        목차. 3-2 문자열과 다른 형태의 값 연산
//        필기. 문자열과의 연산은 '+' 연산만 가능하다.
//        필기. 연산 결과는 다른 형태의 값들도 문자열로 취급하여 문자열 이어붙이기(문자열 합치기)결과가 나오게 된다.
        System.out.println("----- 문자열과 다른 형태의 값 연산 -----");
//        문자열과 정수의 연산
        System.out.println("helloworld" + 1004);
//        문자열과 실수의 연산
        System.out.println("helloworld" + 123.456);
//        문자열과 문자의 연산
        System.out.println("helloworld" + 'a');
//        문자열과 논리값의 연산
        System.out.println("helloworld" + true);

        System.out.println("123" + "456");

//        논리값 연산
//        4-1 논리값과 논리값 연산
//        System.out,println(true + false); // 불가능
//        System.out.println(true + 1); // 불가능
        System.out.println(true + "false"); // 문자열과는 가능
        System.out.println("안녕 " + 'f'+'a'+'l'+'s'+'e');

    }
}
