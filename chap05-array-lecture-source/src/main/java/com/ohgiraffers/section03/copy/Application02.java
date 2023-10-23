package main.java.com.ohgiraffers.section03.copy;

public class Application02 {

    public static void main(String[] args) {

        String[] names = {"홍길동", "유관순", "이순신"};
        System.out.println("names의 hashCode : " + names.hashCode());

        print(names);

        for (String x : names){
            System.out.println("print 이후 x의 값 " + x);
        }

        String[] animals = getAnimals();
        System.out.println("리턴 받은 animals의 hashCode : " + animals.hashCode());

        for (String x : animals){
            System.out.println("print 전 = " + x);
        }

        print(animals);
        for (String x : animals){
            System.out.println("print 후 = " + x);
        }
    }

    public static void print(String[] args){
        System.out.println("args의 hashCode : " + args.hashCode()); // names의 주소값을 보내줬다.

        for (int i = 0; i < args.length; i++){
            args[i] = args[i] + "1";
//            System.out.println(args[i] + " ");
        }
        System.out.println();
    }

    public static String[] getAnimals(){
        String[] animals = new String[]{"낙타", "호랑이", "나무늘보"};

        return animals;
    }
}
