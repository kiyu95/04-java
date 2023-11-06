package main.java.com.ohgiraffers.story;

public class Application {

    public static void main(String[] args){

        // 개발관련 목표가 없던 지올팍
        // 그는 강사에게 과제를 받았다.
        // 과제는 job에 대한 조사를 하는 것이다.
        // 생각보다 직업이 많아서 고민을 하던 지올팍
        // 배열을 가지고 직업 리스트를 만들기로 하였다.

        // 처음 개발 관련 직군이 몇개가 있는지 모르는 지올팍
        // ArrayList를 사용하는 것이 아직은 익숙하지 않아
        // 상대적으로 접근하기 쉬운 배열로 관리하기로 했다.

        Jobs[] joblist = new Jobs[5];

        try{
            joblist[0] = new Jobs(1, "백엔드");
            joblist[1] = new Jobs(2, "프론트엔드");
            joblist[2] = new Jobs(3, "데브옵스");
            joblist[3] = new Jobs(4, "DBA");
            joblist[4] = new Jobs(5, "PM");
            // ArrayIndexOutOfBoundsException가 발생됨에 따라서 프로그램이 동작을 멈춤
            joblist[5] = new Jobs(6, "PL");
            joblist[6] = new Jobs(7, "BigData");
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        for (int i = 0; i < joblist.length; i++) {
            System.out.println(joblist[i]);
        }

    }
}
