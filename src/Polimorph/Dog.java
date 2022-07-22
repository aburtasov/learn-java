package Polimorph;

public class Dog extends Animal {
    public void bark() {
        System.out.println("dog is barking...");
    }
       
    @Override
    public void eat() {
          System.out.println("Dog is eating...");
    } // переопределение метода
}
