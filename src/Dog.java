public class Dog extends Animal {

    public void bark() {
        System.out.println("I am barking!");
    }
    
    public void eat() {
        System.out.println("Dog is barking!");
    } // переопределение метода. одинаковая сигнатура

    public void showName() {
        System.out.println(name);
    }

} // наследование класса Animal
