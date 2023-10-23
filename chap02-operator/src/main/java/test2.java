public class test2 {

    public static void main(String[] args) {

        // Quiz 1
        // 민식마트의 이번 주 주류 판매 실적은 소주: 45만원, 맥주: 35만원, 와인: 30만원, 고량주: 50만원 이다.

        // 마트의 주당 평균 총 매출이 140 만원일때

        // 그 주의 주류 별 평균 실적과 그 주의 총 매출을 정리하고(세금 10%),

        // 총 매출이 주당 평균 매출보다 높은지 나타내려고 한다.

        // 다음과 같은 양식을 가진다.


        // A마트 이번 주 주류의 평균 실적은 ()만원이고, 세금은 ()만원을 냈으며, 세금을 제외한 수입은 ()만원이다.

        // 이번 주 총 매출은 평균 총 매출보다 높다/낮다. (삼항연산자 사용)

        int saleWeekSoju = 45;
        int saleWeekBeer = 35;
        int saleWeekWine = 30;
        int saleWeekChinasoju = 50;
        int saleAverage = 140;
        int saleWeek = saleWeekSoju + saleWeekBeer + saleWeekWine + saleWeekChinasoju;
        int saleWeekAverage = (saleWeekSoju + saleWeekBeer + saleWeekWine + saleWeekChinasoju) / 4;
        double incomeWeek = saleWeek * 0.9;
        double taxWeek = saleWeek * 0.1;

        System.out.println("A마트 이번 주 주류의 평균 실적은 " + saleWeekAverage + "만원이고, 세금은 " + (int)taxWeek + "만원을 냈으며, 세금을 제외한 수입은 " + (int)incomeWeek + "만원이다.");
        String s = (saleWeek > saleAverage) ? ("높다") : ("낮다");
        System.out.println("이번 주 총 매출은 평균 총 매출보다 " + s);

        System.out.println("==============================");
        // Quiz 2
        // 삼항연산자를 이용해 1이 4보다 작으면 바보 . 4보다 크면 천재를 출력

        String iq = (1 < 4) ? ("바보") : ("천재");
        System.out.println(iq);

        System.out.println("==============================");
        // Quiz 3
        // 한 축구 구단의 직원 수는 약 1892명 이다.
        // 올해에 리그에서 순위가 18위 이하로 나온다면 강등 되어서 직원수는 15% 감소하고, 18위 이하를 기록하지 않는다면 구단의 직원수는 15% 증가한다.

        // 구단의 직원들에게 설명하기 위해 삼항연산자를 활용해 작성해보자.

        // 구단은 기적적으로 17위를 기록하였는데, 이후의 구단 직원수도 구해보자.

        int staffNumber = 1892;
        int ranking = 17;
        int demotionRanking = 18;
        double resultStaffNumber = (ranking <= demotionRanking) ? (staffNumber * 1.15) : (staffNumber * 0.85);
        System.out.println(resultStaffNumber);

        System.out.println("==============================");
        // Quiz 4
        // 영어시험을 본 결과 1번 학생은 90점 2번 학생은 95점 3번 학생은 81점을 맞았다
        // 평균을 구한 후 논리 연산자를 이용해 90점 이상~100점 이하라면 true를 출력, 아니라면 false를 출력하라.

        int scoreStudentA = 90;
        int scoreStudentB = 95;
        int scoreStudentC = 81;
        double scoreAverage = ((double)(scoreStudentA + scoreStudentB + scoreStudentC)) / 3;
        System.out.println("평균 점수는 : " + scoreAverage);
        String result4 = (scoreAverage >= 90 && scoreAverage <= 100) ? "true" : "false";
        System.out.println(result4);

        System.out.println("==============================");
        // Quiz 5
        // 300만원을 갖고 있는 김과장이 62만원인 지갑을 구매하려 한다. 실행되지 않는 코드의 오류를 수정해라. */

        String name = "김과장";
        int balance = 3000000;
        int walletPrice = 620000;

        String result = (balance >= walletPrice) ? (name + " 님의 결제가 진행되었습니다. " + name + " 님의 남은 잔고 : " + (balance - walletPrice)) : "잔액 부족으로 결제가 진행되지 않았습니다." ;
        System.out.println(result);

        System.out.println("==============================");
        // Quiz 6
        // 시험과목 3개의 점수가 50, 40, 60 이다.
        // 평균 40을 넘기면 합격 못넘기면 불합격 출력

        int scoreA = 50;
        int scoreB = 40;
        int scoreC = 60;
        int scoreAverage6 = (scoreA + scoreB +scoreC) / 3;
        String result6 = (scoreAverage6 > 40) ? "합격" : "불합격";
        System.out.println(result6);

        System.out.println("==============================");
        // Quiz 7
        // ch1 = X, ch2 = Z 일때 그 값을 비교한 후 참이면 "참", 거짓이면 "거짓"으로 출력할 것
        int ch1 = 'X';
        int ch2 = 'Z';
        String result7 = (ch1 == ch2) ? "참" : "거짓";
        System.out.println(result7);

        System.out.println("==============================");
        // Quiz 8
        // 자신의 나이를 집어넣고 20 보다 작으면 미성년자, 20보다 높으면 성인이 출력되도록 한다
        int age = 29;
        String result8 = (age < 20) ? "미성년자" : "성인";
        System.out.println(result8);

        System.out.println("==============================");
        // Quiz 9
        // 길동이의 첫달 월급은 100만원이다
        // 짝수달은 10프로 보너스를 받고, 홀수달은 15프로 보너스를 받는다
        // 길동이 연봉은?
        // 출력 내용 : 길동이의 연봉은 XX만원입니다
        int salary = 100;
        int salaryEven = (int)(salary * 1.1);
        System.out.println(salaryEven);
        float salaryOdd = salary * 1.15f;
        System.out.println(salaryOdd);

        int annualIncome = (int)(salaryEven * 6) + (int)(salaryOdd * 6);
        System.out.println("길동이의 연봉은 " + annualIncome + "만원입니다.");

    }
}

