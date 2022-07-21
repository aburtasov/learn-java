public class ClassesAndObjects {
  public static void main(String[] args) {
     Person person1 = new Person();
     person1.name = "Andrey";
     person1.age = 20;

     Person person2 = new Person();
     person2.name = "Vova";
     person2.age = 21;

     //System.out.println("Name: " + person1.name + " Age: " + person1.age);
     //System.out.println("Name: " + person2.name + " Age: " + person2.age);
     person1.speak();
     person2.speak();
     person1.sayHello();
     int years1 = person1.calculateYearsToRetirement();
     System.out.println(years1);

     person1.setName("Vasya");
     person1.speak();

     String s1 = "Vova";
     person2.setName(s1);
     person2.speak();
  }
}  // публичный класс может быть только один
/*class test {

}
class test2 {

}*/

class Person {
    // У класса могут быть:
    // 1. Данные(поля)
    // 2. Действия(методы)
    String name;
    int age;

    void speak() {
      System.out.println("Name: " + name + ", Age: " + age);
    }

    void sayHello() {
      System.out.println("Hello from " + name);
    }

    int calculateYearsToRetirement() {
      int years = 65 - age;
      return years;
    }

    void setName(String username) {  // параметров может быть сколько угодно
         name = username;
    }
}