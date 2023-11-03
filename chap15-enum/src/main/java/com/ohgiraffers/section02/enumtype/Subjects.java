package main.java.com.ohgiraffers.section02.enumtype;

public enum Subjects {

    // 상수 열거 필드
    JAVA("java"),
    ORACLE("oracle"),
    JDBC("jdbc"),
    HTML("html"),
    CSS("css"),
    JAVASCRIPT("javascript");

    private String value;

    Subjects (String value){
        this.value = value;
    }
}
