package Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");

        animal1.sleep();
        person1.sayHello();

        animal1.showInfo();
        person1.showInfo();

        Info info1 = new Animal(2);
        Info info2 = new Person("Tom"); // классы реализуют интерфейс Info,
        // поэтому такая запись корректна
        // полиморфизм

        info1.showInfo();
        info2.showInfo();

        outPutInfo(info1);
        outPutInfo(info2);

        outPutInfo(animal1);
        outPutInfo(person1);


    }

    public static void outPutInfo(Info info) {
        info.showInfo();
    }
}