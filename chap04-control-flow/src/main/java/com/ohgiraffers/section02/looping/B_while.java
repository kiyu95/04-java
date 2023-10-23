package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {

    public void testSimpleWhileStatement() {

        // while 표현식
        // while(조건식){
        //
        // }

        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        int i = 0;
        while (i <= value.length()) {
            i++;
            if (i%2 == 0){
                continue;
            } else if (i == 11) {
                break;
            }
        }

        // do while 표현식
        // do{
        //
        // }while(조건식);
        boolean isTrue = false;

        do{ // do while : 최초로 do 를 시행하고, while 시행
            System.out.println("메뚜기 월드 게임");
            System.out.println("시작을 원하면 true, 시작을 원하지 않으면 false를 입력해주세요");
            isTrue = scanner.nextBoolean();
        }while (isTrue);

    }
}

