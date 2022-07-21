public class This {
    public static void main(String[] args) {
      Human human1 = new Human("Bob");
    }
}

class Human {

    

    private String name;
    private int age;

    public Human() {
        System.out.println("Hello from constructor-1!");
        this.name = "Default";
        this.age = 0;
       } // конструктор; нет типа возвращаемого значения,имя с большой буквы
       
    public Human(String name) {
        System.out.println("Hello from constructor-2!");
        this.name = name;
    }  // перегрузка методов...возможна в одном классе

    public Human(String name, int age) {
        System.out.println("Hello from constructor-3!");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {this.name = name;}

    public void setAge(int age) {this.age = age; }

}   