package main.java.com.ohgiraffers.section04.uses2;

public class DatabaseSaveProvider implements SaveProvider{

    @Override
    public boolean save(String data) {
        System.out.println("dataBase Save " + data);
        return false;
    }
}
