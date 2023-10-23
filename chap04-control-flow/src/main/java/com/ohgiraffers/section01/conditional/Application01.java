package main.java.com.ohgiraffers.section01.conditional;

public class Application01 {

    public static void main(String[] args){

        //

        A_if app1 = new A_if();
        B_ifElseIf app2 = new B_ifElseIf();
        C_switch app3 = new C_switch();

        String result = app3.testSwitchVendingMachine();
        System.out.println(result);


    }
}
