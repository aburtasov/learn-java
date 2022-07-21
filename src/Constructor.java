public class This {
    public static void main(String[] args) {
      Human human1 = new Human("Bob",30);
      human1.setName("Tom");

      Human.description = "some description"; // обращение через название класса
      Human.getDesc();

      human1.getAllFileds();

      Human human2 = new Human("Sam",22);

      Human.description = "Nice";

      human1.getAllFileds();
      human2.getAllFileds();

      Math.pow(2,4); // класс Math , коллекция статических методов. Без создания конкретного объекта

      human1.printCountHuman();
      human2.printCountHuman(); // общая переменная countHuman


     //  human2.description = "Changing"; // не имеет смысла
    }
}

class Human {

    

    private String name;
    private int age;
    public static String description; // статическая переменная доступная только классу,а не объекту
    // будет делиться между всеми объектами класса Human
    private static int countHuman; // теперь в конструкторе будем инкрементировать эту переменную

    public Human() {
        System.out.println("Hello from constructor-1!");
        this.name = "Default";
        this.age = 0;
        countHuman++;
       } // конструктор; нет типа возвращаемого значения,имя с большой буквы
       
    public Human(String name) {
        System.out.println("Hello from constructor-2!");
        this.name = name;
        countHuman++;
    }  // перегрузка методов...возможна в одном классе

    public Human(String name, int age) {
        System.out.println("Hello from constructor-3!");
        this.name = name;
        this.age = age;
        countHuman++;
    }

    public void setName(String name) {this.name = name;}

    public void setAge(int age) {this.age = age; }

    public static void getDesc(){System.out.println(description);}

    public void getAllFileds() {
        System.out.println(name + "," + age + "," + description);
    }

   /* public static void printAllFileds() {
        System.out.println(name);
    } */  // Невозможно обратиться к не статической переменной из статического метода ... статические методы и переменные уже
    // существуют без существования объектов, как только мы запускаем программу

    public static void printCountHuman() {
        System.out.println("Number of people: " + countHuman);
    }

}   