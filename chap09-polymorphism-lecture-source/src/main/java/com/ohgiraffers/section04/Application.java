package main.java.com.ohgiraffers.section04;

import main.java.com.ohgiraffers.section04.uses2.DatabaseSaveProvider;
import main.java.com.ohgiraffers.section04.uses2.FileSaveProvider;
import main.java.com.ohgiraffers.section04.uses2.Person;

public class Application {

    public static void main(String[] args) {
        Person person = new Person(new DatabaseSaveProvider());
//        DatabaseSaveProvider databaseSaveProvider = new DatabaseSaveProvider();
//        Person person = new Person(databaseSaveProvider);

        Person person1 = new Person(new FileSaveProvider());
        person.doSomething();
        person1.doSomething();

    }
}
