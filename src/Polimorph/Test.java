package Polimorph;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
       /* Dog dog1 = new Dog();

        animal1.eat();
        dog1.eat(); */

        Animal animal2 = new Dog(); // к объекту класса Dog мы можем обратиться через переменную типа Animal
        // animal2.eat() // good .. // переопределенный метод Dog
        // animal2.bark(); // no good
        Dog dog2 = new Dog();
        dog2.eat(); 
        dog2.bark(); // ok 

        


    }

    public static void test(Animal animal) {
        animal.eat();
    }
}

// преимущество полиморфизма: меньше код. многоразово использовать