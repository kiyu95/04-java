package main.java.com.ohgiraffers.section02;

public class SubClass extends SuperClass{

    // 메소드 이름을 변경하면 에러가 발생된다.
    // 아래의 경우 오버라이드가 아닌 다른 함수로 취급이 된다.
//    @Override
//    public void method1(int num) {
//        super.method(num);
//    }

    // 메소도의 리턴타입이 변경되면 에러가 발생된다.
//    @Override
//    public int method(int num) {
//        return num;
//    }

    // 메서드의 시그니처가 달라도 오류가 발생된다.
    // 아래의 경우 오버로딩이다.
//    @Override
//    public void method(int num, int num2) {
//        super.method(num);
//    }
    @Override
    public void method(int num) {
        System.out.println("오버라이드 오류 안남");
    }

    // private 접근제한자는 자신만 접근할 수 있기 때문에 오류가 발생한다.
//    @Override
//    public void privatedMethod() {
//
//    }

    // final 메소드의 경우 한번 정의된 후 변경이 불가능하다.
//    @Override
//    public final void finalMethod(){
//
//    }

    // 부모 메소드의 젭근제한자와 같거나 더 넓은 범위로 오버라이딩이 가능하다.
    // 더 좁은 범위는 불가능
//    @Override
//    void protectedMethod() { // 접근제한자 : default
//        super.protectedMethod();
//    }

    // 오버라이딩 가능
//    @Override
//    protected void protectedMethod() {
//        super.protectedMethod();
//    }

    // 오버라이딩 가능 (더 넓은범위)
    @Override
    public void protectedMethod() {
        super.protectedMethod();
    }

}
