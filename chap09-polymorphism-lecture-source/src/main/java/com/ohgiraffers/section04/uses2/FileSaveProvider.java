package main.java.com.ohgiraffers.section04.uses2;

public class FileSaveProvider implements SaveProvider{

    @Override
    public boolean save(String data) {
        System.out.println("File Save " + data);
        return false;
    }
}
