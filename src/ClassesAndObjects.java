public class ClassesAndObjects {
  public static void main(String[] args) {
     Person person1 = new Person();
     person1.name = "Andrey";
     person1.age = 20;

     Person person2 = new Person();
     person2.name = "Vova";
     person2.age = 21;

     System.out.println("Name: " + person1.name + "Age: " + person1.age);
     System.out.println("Name: " + person2.name + "Age: " + person2.age);
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
}