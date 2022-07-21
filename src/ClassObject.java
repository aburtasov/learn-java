public class ClassObject {
      public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1);

        Human h1 = new Human("Bob",20);
        System.out.println(h1); // выведет Human@3cdf34
        // print,println ... вызывают метод toString()

        h1.toString(); // метод унаследовался от Object ... // возвращает hash-код -> уникальный номер объекта
     }
        
} 

// Любой класс в Java наследуется от класса Object
// Наследование - заимствование всех полей и методов класса

class Human {

    

    private String name;
    private int age;
   

    
    public Human(String name, int age) {
        
        this.name = name;
        this.age = age;
       
    }

    
    public String toString() {
        return name + "," + age;
    } // переопределение метода. для этого полностью повторяем его сигнатуру

   

}   // класс Human скрытно наследуется от класса Object и имеет его поля и методы
    // extends